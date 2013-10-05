package org.smadl.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xtype.XtypePackage;
import org.smadl.smadl.GeneralRelationship;
import org.smadl.smadl.OAuthRelationship;
import org.smadl.smadl.ProvidedService;
import org.smadl.smadl.RelationshipConstraint;
import org.smadl.smadl.RelationshipConstraintListOfOps;
import org.smadl.smadl.RelationshipGroup;
import org.smadl.smadl.SmadlPackage;
import org.smadl.smadl.SmadlPackage.Literals;
import org.smadl.smadl.SocialMachine;
import org.smadl.validation.AbstractSMADLValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class SMADLValidator extends AbstractSMADLValidator {
  public final static String CYCLIC_DEPENDENCY = "smadl.issue.cyclicDependency";
  
  protected List<EPackage> getEPackages() {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(SmadlPackage.eINSTANCE, XbasePackage.eINSTANCE, TypesPackage.eINSTANCE, 
      XtypePackage.eINSTANCE);
    return _newArrayList;
  }
  
  @Check
  public void checkSocialMachineSelfRelationship(final SocialMachine sm) {
    RelationshipGroup _relationshipGroup = sm.getRelationshipGroup();
    EList<EObject> _relationships = _relationshipGroup.getRelationships();
    for (final EObject relationship : _relationships) {
      {
        String targetName = "";
        EReference feature = Literals.OAUTH_RELATIONSHIP__TARGET;
        if ((relationship instanceof OAuthRelationship)) {
          SocialMachine _target = ((OAuthRelationship) relationship).getTarget();
          String _name = _target.getName();
          targetName = _name;
        } else {
          if ((relationship instanceof GeneralRelationship)) {
            SocialMachine _target_1 = ((GeneralRelationship) relationship).getTarget();
            String _name_1 = _target_1.getName();
            targetName = _name_1;
            feature = Literals.GENERAL_RELATIONSHIP__TARGET;
          }
        }
        String _name_2 = sm.getName();
        boolean _equals = targetName.equals(_name_2);
        if (_equals) {
          this.error("A social machine cannot have a self relationship", relationship, feature);
        }
      }
    }
  }
  
  @Check
  public void checkSocialMachineRelationshipOperations(final SocialMachine sm) {
    RelationshipGroup _relationshipGroup = sm.getRelationshipGroup();
    EList<EObject> _relationships = _relationshipGroup.getRelationships();
    for (final EObject relationship : _relationships) {
      {
        RelationshipConstraint constraint = null;
        SocialMachine relationshipTarget = null;
        EReference feature = Literals.OAUTH_RELATIONSHIP__CONSTRAINT;
        if ((relationship instanceof OAuthRelationship)) {
          RelationshipConstraint _constraint = ((OAuthRelationship) relationship).getConstraint();
          constraint = _constraint;
          SocialMachine _target = ((OAuthRelationship) relationship).getTarget();
          relationshipTarget = _target;
        } else {
          if ((relationship instanceof GeneralRelationship)) {
            RelationshipConstraint _constraint_1 = ((GeneralRelationship) relationship).getConstraint();
            constraint = _constraint_1;
            SocialMachine _target_1 = ((GeneralRelationship) relationship).getTarget();
            relationshipTarget = _target_1;
            feature = Literals.GENERAL_RELATIONSHIP__CONSTRAINT;
          }
        }
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(constraint, null));
        if (!_notEquals) {
          _and = false;
        } else {
          EObject _type = constraint.getType();
          _and = (_notEquals && (_type instanceof RelationshipConstraintListOfOps));
        }
        if (_and) {
          EObject _type_1 = constraint.getType();
          EList<ProvidedService> listOfOps = ((RelationshipConstraintListOfOps) _type_1).getOperations();
          ArrayList<String> opConstraintNames = CollectionLiterals.<String>newArrayList();
          for (final ProvidedService op : listOfOps) {
            String _name = op.getName();
            opConstraintNames.add(_name);
          }
          ArrayList<String> opTargetNames = CollectionLiterals.<String>newArrayList();
          EList<ProvidedService> _wrapperInterface = relationshipTarget.getWrapperInterface();
          for (final ProvidedService op_1 : _wrapperInterface) {
            String _name_1 = op_1.getName();
            opTargetNames.add(_name_1);
          }
          boolean _containsAll = opTargetNames.containsAll(opConstraintNames);
          boolean _not = (!_containsAll);
          if (_not) {
            String name = relationshipTarget.getName();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Only operations of the target ");
            _builder.append(name, "");
            _builder.append(" are valid for this relationship");
            this.error(_builder.toString(), relationship, feature);
          }
        }
      }
    }
  }
}
