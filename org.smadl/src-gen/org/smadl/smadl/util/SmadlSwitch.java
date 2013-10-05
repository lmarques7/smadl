/**
 */
package org.smadl.smadl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.smadl.smadl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.smadl.smadl.SmadlPackage
 * @generated
 */
public class SmadlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmadlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmadlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SmadlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SmadlPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.SOCIAL_MACHINE:
      {
        SocialMachine socialMachine = (SocialMachine)theEObject;
        T result = caseSocialMachine(socialMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.RELATIONSHIP_GROUP:
      {
        RelationshipGroup relationshipGroup = (RelationshipGroup)theEObject;
        T result = caseRelationshipGroup(relationshipGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.OAUTH_RELATIONSHIP:
      {
        OAuthRelationship oAuthRelationship = (OAuthRelationship)theEObject;
        T result = caseOAuthRelationship(oAuthRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.GENERAL_RELATIONSHIP:
      {
        GeneralRelationship generalRelationship = (GeneralRelationship)theEObject;
        T result = caseGeneralRelationship(generalRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.RELATIONSHIP_CONSTRAINT:
      {
        RelationshipConstraint relationshipConstraint = (RelationshipConstraint)theEObject;
        T result = caseRelationshipConstraint(relationshipConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.RELATIONSHIP_CONSTRAINT_FULL_ACCESS:
      {
        RelationshipConstraintFullAccess relationshipConstraintFullAccess = (RelationshipConstraintFullAccess)theEObject;
        T result = caseRelationshipConstraintFullAccess(relationshipConstraintFullAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.RELATIONSHIP_CONSTRAINT_LIST_OF_OPS:
      {
        RelationshipConstraintListOfOps relationshipConstraintListOfOps = (RelationshipConstraintListOfOps)theEObject;
        T result = caseRelationshipConstraintListOfOps(relationshipConstraintListOfOps);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.COMPUTATIONAL_UNIT:
      {
        ComputationalUnit computationalUnit = (ComputationalUnit)theEObject;
        T result = caseComputationalUnit(computationalUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.PROVIDED_SERVICE:
      {
        ProvidedService providedService = (ProvidedService)theEObject;
        T result = caseProvidedService(providedService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.OPERATION_CONSTRAINT:
      {
        OperationConstraint operationConstraint = (OperationConstraint)theEObject;
        T result = caseOperationConstraint(operationConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmadlPackage.GENERAL_CONSTRAINT:
      {
        GeneralConstraint generalConstraint = (GeneralConstraint)theEObject;
        T result = caseGeneralConstraint(generalConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Social Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Social Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSocialMachine(SocialMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipGroup(RelationshipGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OAuth Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OAuth Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOAuthRelationship(OAuthRelationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralRelationship(GeneralRelationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipConstraint(RelationshipConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Constraint Full Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Constraint Full Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipConstraintFullAccess(RelationshipConstraintFullAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Constraint List Of Ops</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Constraint List Of Ops</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipConstraintListOfOps(RelationshipConstraintListOfOps object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Computational Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Computational Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComputationalUnit(ComputationalUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedService(ProvidedService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationConstraint(OperationConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralConstraint(GeneralConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SmadlSwitch
