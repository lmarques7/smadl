/**
 */
package org.smadl.smadl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smadl.smadl.SmadlPackage
 * @generated
 */
public interface SmadlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmadlFactory eINSTANCE = org.smadl.smadl.impl.SmadlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Social Machine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Social Machine</em>'.
   * @generated
   */
  SocialMachine createSocialMachine();

  /**
   * Returns a new object of class '<em>Relationship Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Group</em>'.
   * @generated
   */
  RelationshipGroup createRelationshipGroup();

  /**
   * Returns a new object of class '<em>OAuth Relationship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OAuth Relationship</em>'.
   * @generated
   */
  OAuthRelationship createOAuthRelationship();

  /**
   * Returns a new object of class '<em>Generic Relationship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Relationship</em>'.
   * @generated
   */
  GenericRelationship createGenericRelationship();

  /**
   * Returns a new object of class '<em>General Config Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>General Config Parameter</em>'.
   * @generated
   */
  GeneralConfigParameter createGeneralConfigParameter();

  /**
   * Returns a new object of class '<em>Relationship Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Constraint</em>'.
   * @generated
   */
  RelationshipConstraint createRelationshipConstraint();

  /**
   * Returns a new object of class '<em>Relationship Constraint Full Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Constraint Full Access</em>'.
   * @generated
   */
  RelationshipConstraintFullAccess createRelationshipConstraintFullAccess();

  /**
   * Returns a new object of class '<em>Relationship Constraint List Of Ops</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Constraint List Of Ops</em>'.
   * @generated
   */
  RelationshipConstraintListOfOps createRelationshipConstraintListOfOps();

  /**
   * Returns a new object of class '<em>Computational Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Computational Unit</em>'.
   * @generated
   */
  ComputationalUnit createComputationalUnit();

  /**
   * Returns a new object of class '<em>Provided Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Service</em>'.
   * @generated
   */
  ProvidedService createProvidedService();

  /**
   * Returns a new object of class '<em>Operation Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Constraint</em>'.
   * @generated
   */
  OperationConstraint createOperationConstraint();

  /**
   * Returns a new object of class '<em>General Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>General Constraint</em>'.
   * @generated
   */
  GeneralConstraint createGeneralConstraint();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SmadlPackage getSmadlPackage();

} //SmadlFactory
