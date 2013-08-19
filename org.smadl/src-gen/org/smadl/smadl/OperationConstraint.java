/**
 */
package org.smadl.smadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smadl.smadl.OperationConstraint#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smadl.smadl.SmadlPackage#getOperationConstraint()
 * @model
 * @generated
 */
public interface OperationConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute list.
   * The list contents are of type {@link org.smadl.smadl.OperationConstraintType}.
   * The literals are from the enumeration {@link org.smadl.smadl.OperationConstraintType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute list.
   * @see org.smadl.smadl.OperationConstraintType
   * @see org.smadl.smadl.SmadlPackage#getOperationConstraint_Type()
   * @model unique="false"
   * @generated
   */
  EList<OperationConstraintType> getType();

} // OperationConstraint
