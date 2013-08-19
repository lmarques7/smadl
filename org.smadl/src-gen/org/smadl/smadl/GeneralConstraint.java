/**
 */
package org.smadl.smadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smadl.smadl.GeneralConstraint#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smadl.smadl.SmadlPackage#getGeneralConstraint()
 * @model
 * @generated
 */
public interface GeneralConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.smadl.smadl.OperationConstraintType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.smadl.smadl.OperationConstraintType
   * @see #setType(OperationConstraintType)
   * @see org.smadl.smadl.SmadlPackage#getGeneralConstraint_Type()
   * @model
   * @generated
   */
  OperationConstraintType getType();

  /**
   * Sets the value of the '{@link org.smadl.smadl.GeneralConstraint#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.smadl.smadl.OperationConstraintType
   * @see #getType()
   * @generated
   */
  void setType(OperationConstraintType value);

} // GeneralConstraint
