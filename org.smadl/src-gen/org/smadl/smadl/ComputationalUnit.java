/**
 */
package org.smadl.smadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computational Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smadl.smadl.ComputationalUnit#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.smadl.smadl.ComputationalUnit#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smadl.smadl.SmadlPackage#getComputationalUnit()
 * @model
 * @generated
 */
public interface ComputationalUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.smadl.smadl.SmadlPackage#getComputationalUnit_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.smadl.smadl.SmadlPackage#getComputationalUnit_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getExpressions();

} // ComputationalUnit
