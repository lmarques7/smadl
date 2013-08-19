/**
 */
package org.smadl.smadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smadl.smadl.ProvidedService#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.ProvidedService#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.smadl.smadl.ProvidedService#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.smadl.smadl.ProvidedService#getOpConstraint <em>Op Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smadl.smadl.SmadlPackage#getProvidedService()
 * @model
 * @generated
 */
public interface ProvidedService extends EObject
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
   * @see org.smadl.smadl.SmadlPackage#getProvidedService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.smadl.smadl.ProvidedService#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(JvmTypeReference)
   * @see org.smadl.smadl.SmadlPackage#getProvidedService_ReturnType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getReturnType();

  /**
   * Sets the value of the '{@link org.smadl.smadl.ProvidedService#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(JvmTypeReference value);

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
   * @see org.smadl.smadl.SmadlPackage#getProvidedService_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Op Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Constraint</em>' containment reference.
   * @see #setOpConstraint(OperationConstraint)
   * @see org.smadl.smadl.SmadlPackage#getProvidedService_OpConstraint()
   * @model containment="true"
   * @generated
   */
  OperationConstraint getOpConstraint();

  /**
   * Sets the value of the '{@link org.smadl.smadl.ProvidedService#getOpConstraint <em>Op Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Constraint</em>' containment reference.
   * @see #getOpConstraint()
   * @generated
   */
  void setOpConstraint(OperationConstraint value);

} // ProvidedService
