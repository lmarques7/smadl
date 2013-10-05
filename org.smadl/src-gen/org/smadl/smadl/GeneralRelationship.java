/**
 */
package org.smadl.smadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smadl.smadl.GeneralRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.GeneralRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.smadl.smadl.GeneralRelationship#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.smadl.smadl.GeneralRelationship#getParamValue <em>Param Value</em>}</li>
 *   <li>{@link org.smadl.smadl.GeneralRelationship#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smadl.smadl.SmadlPackage#getGeneralRelationship()
 * @model
 * @generated
 */
public interface GeneralRelationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.smadl.smadl.SmadlPackage#getGeneralRelationship_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.smadl.smadl.GeneralRelationship#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(SocialMachine)
   * @see org.smadl.smadl.SmadlPackage#getGeneralRelationship_Target()
   * @model
   * @generated
   */
  SocialMachine getTarget();

  /**
   * Sets the value of the '{@link org.smadl.smadl.GeneralRelationship#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(SocialMachine value);

  /**
   * Returns the value of the '<em><b>Param Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Name</em>' attribute list.
   * @see org.smadl.smadl.SmadlPackage#getGeneralRelationship_ParamName()
   * @model unique="false"
   * @generated
   */
  EList<String> getParamName();

  /**
   * Returns the value of the '<em><b>Param Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Value</em>' attribute list.
   * @see org.smadl.smadl.SmadlPackage#getGeneralRelationship_ParamValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getParamValue();

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(RelationshipConstraint)
   * @see org.smadl.smadl.SmadlPackage#getGeneralRelationship_Constraint()
   * @model containment="true"
   * @generated
   */
  RelationshipConstraint getConstraint();

  /**
   * Sets the value of the '{@link org.smadl.smadl.GeneralRelationship#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(RelationshipConstraint value);

} // GeneralRelationship
