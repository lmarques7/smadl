package org.smadl.validation

import java.util.Collection
import java.util.LinkedHashSet
import java.util.Set
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xtype.XtypePackage
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
        newArrayList(
            SmadlPackage::eINSTANCE,
            XbasePackage::eINSTANCE,
            TypesPackage::eINSTANCE,
            XtypePackage::eINSTANCE)
    }

    @Check
    def checkSocialMachineSelfOrCyclicReference(SocialMachine sm) {
         sm.findDependentTasks [ cycle |
            if (cycle.size == 1) {
                error('''The Social Machine '«sm.name»' cannot relate to itself.''', 
                      cycle.head, SOCIAL_MACHINE__NAME, CYCLIC_DEPENDENCY)
            } else {
                error('''There is a cyclic relationship that involves Social Machines «cycle.map[name].join(", ")»''', 
                      cycle.head, SOCIAL_MACHINE__NAME, CYCLIC_DEPENDENCY)
            }
        ]
    }
    
    def private Collection<SocialMachine> findDependentTasks(SocialMachine it, (Set<SocialMachine>) => void cycleHandler) {
        
        // 1. collect all tasks that we depend on
        val socialMachines = new LinkedHashSet<SocialMachine>
        internalFindDependentTasksRec(it, socialMachines)
        
        // 2. sort them so that dependents come after dependees  
        val result = <SocialMachine>newLinkedHashSet
        var changed = true
        while (changed) {
            changed = false
            for (t : socialMachines.toList) 
                if (result.containsAll(t.depends)) {
                    changed = true
                    result.add(t)
                    socialMachines.remove(t)
                }
        }
        if (!socialMachines.empty && cycleHandler != null)
            cycleHandler.apply(socialMachines)
        result
    }

    def private void internalFindDependentTasksRec(SocialMachine sm, Set<SocialMachine> set) {
        if (!set.add(sm))
            return;
        for (t : sm.depends) 
            internalFindDependentTasksRec(t, set)
    }

//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character::isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage$Literals::GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}
