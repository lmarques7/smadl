package org.smadl.validation

import java.util.List
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xtype.XtypePackage
import org.smadl.smadl.GeneralConfigParameter
import org.smadl.smadl.GeneralRelationship
import org.smadl.smadl.OAuthRelationship
import org.smadl.smadl.RelationshipConstraint
import org.smadl.smadl.RelationshipConstraintListOfOps
import org.smadl.smadl.SmadlPackage
import org.smadl.smadl.SocialMachine

import static org.smadl.smadl.SmadlPackage$Literals.*

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class SMADLValidator extends AbstractSMADLValidator {

    public static val CYCLIC_DEPENDENCY = "smadl.issue.cyclicDependency"

    override protected getEPackages() {
        newArrayList(SmadlPackage::eINSTANCE, XbasePackage::eINSTANCE, TypesPackage::eINSTANCE,
            XtypePackage::eINSTANCE)
    }

    @Check
    def checkSocialMachineSelfRelationship(SocialMachine sm) {
        for (relationship : sm.relationshipGroup.relationships) {
            var targetName = ""
            var feature = OAUTH_RELATIONSHIP__TARGET
            if (relationship instanceof OAuthRelationship) {
                targetName = (relationship as OAuthRelationship).target.name
            } else if (relationship instanceof GeneralRelationship) {
                targetName = (relationship as GeneralRelationship).target.name
                feature = GENERAL_RELATIONSHIP__TARGET
            }
            if (targetName.equals(sm.name)) {
                error("A social machine cannot have a self relationship", relationship, feature)
            }
        }
    }
    
    @Check
    def checkSocialMachineNonRelatedRelationship(SocialMachine sm) {
        var List<String> relatedNames = newArrayList
        for (relatedSM : sm.dependencies) {
            relatedNames.add(relatedSM.name)
        }
        for (relationship : sm.relationshipGroup.relationships) {
            var targetName = ""
            var feature = OAUTH_RELATIONSHIP__TARGET
            if (relationship instanceof OAuthRelationship) {
                targetName = (relationship as OAuthRelationship).target.name
            } else if (relationship instanceof GeneralRelationship) {
                targetName = (relationship as GeneralRelationship).target.name
                feature = GENERAL_RELATIONSHIP__TARGET
            }
            if (!relatedNames.contains(targetName)) {
                error("The Social Machine '" + targetName + 
                      "' has not been listed in the 'relates to' section", 
                      relationship, feature)
            }
        }
    }

    @Check
    def checkSocialMachineRelationshipOperations(SocialMachine sm) {
        for (relationship : sm.relationshipGroup.relationships) {
            var RelationshipConstraint constraint = null
            var SocialMachine relationshipTarget = null
            var feature = OAUTH_RELATIONSHIP__CONSTRAINT
            if (relationship instanceof OAuthRelationship) {
                constraint = (relationship as OAuthRelationship).constraint
                relationshipTarget = (relationship as OAuthRelationship).target
            } else if (relationship instanceof GeneralRelationship) {
                constraint = (relationship as GeneralRelationship).constraint
                relationshipTarget = (relationship as GeneralRelationship).target
                feature = GENERAL_RELATIONSHIP__CONSTRAINT
            }
            if (constraint != null && constraint.type instanceof RelationshipConstraintListOfOps) {
                var listOfOps = (constraint.type as RelationshipConstraintListOfOps).operations
                var opConstraintNames = newArrayList()
                for (op : listOfOps) {
                    opConstraintNames.add(op.name)
                }
                var opTargetNames = newArrayList()
                for (op : relationshipTarget.wrapperInterface) {
                    opTargetNames.add(op.name)
                }
                if (!opTargetNames.containsAll(opConstraintNames)) {
                    var name = relationshipTarget.name
                    error('''Only operations of the target «name» are valid for this relationship''',
                        relationship, feature)
                }
            }
        }
    }
    
    @Check
    def checkDuplicatedParamInGeneralRelationship(GeneralRelationship genRelationship) {
        var allParams = genRelationship.configParams
        var index = 0
        for (param : allParams) {
            var List<GeneralConfigParameter> remainingParams = allParams.subList(index + 1, allParams.size)
            var List<String> remainingNames = newArrayList
            for (toGetName : remainingParams) {
                remainingNames.add(toGetName.name)
            }
            var failIndex = 0
            for (currentName : remainingNames) {
                if (currentName.equals(param.name)) {
                    error('''Duplicated configuration parameter: «param.name»''',
                        genRelationship, GENERAL_RELATIONSHIP__CONFIG_PARAMS, failIndex + index + 1)
                }
                failIndex = failIndex + 1
            }
            index = index + 1
        }
    }
    
//    @Check
//    def checkSocialMachineSelfOrCyclicReference(SocialMachine sm) {
//         sm.findDependentTasks [ cycle |
//            if (cycle.size == 1) {
//                error('''The Social Machine '«sm.name»' cannot relate to itself.''', 
//                      cycle.head, SOCIAL_MACHINE__NAME, CYCLIC_DEPENDENCY)
//            } else {
//                error('''There is a cyclic relationship that involves Social Machines «cycle.map[name].join(", ")»''', 
//                      cycle.head, SOCIAL_MACHINE__NAME, CYCLIC_DEPENDENCY)
//            }
//        ]
//    }
//    
//    def private Collection<SocialMachine> findDependentTasks(SocialMachine it, (Set<SocialMachine>) => void cycleHandler) {
//        
//        // 1. collect all tasks that we depend on
//        val socialMachines = new LinkedHashSet<SocialMachine>
//        internalFindDependentTasksRec(it, socialMachines)
//        
//        // 2. sort them so that dependents come after dependees  
//        val result = <SocialMachine>newLinkedHashSet
//        var changed = true
//        while (changed) {
//            changed = false
//            for (t : socialMachines.toList) 
//                if (result.containsAll(t.depends)) {
//                    changed = true
//                    result.add(t)
//                    socialMachines.remove(t)
//                }
//        }
//        if (!socialMachines.empty && cycleHandler != null)
//            cycleHandler.apply(socialMachines)
//        result
//    }
//
//    def private void internalFindDependentTasksRec(SocialMachine sm, Set<SocialMachine> set) {
//        if (!set.add(sm))
//            return;
//        for (t : sm.depends) 
//            internalFindDependentTasksRec(t, set)
//    }

}
