/**
 */
package org.smadl.smadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smadl.smadl.SocialMachine#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.SocialMachine#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.smadl.smadl.SocialMachine#getGeneralConstraints <em>General Constraints</em>}</li>
 *   <li>{@link org.smadl.smadl.SocialMachine#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.smadl.smadl.SocialMachine#getWrapperInterface <em>Wrapper Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smadl.smadl.SmadlPackage#getSocialMachine()
 * @model
 * @generated
 */
public interface SocialMachine extends EObject
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
   * @see org.smadl.smadl.SmadlPackage#getSocialMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.smadl.smadl.SocialMachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Depends</b></em>' reference list.
   * The list contents are of type {@link org.smadl.smadl.SocialMachine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends</em>' reference list.
   * @see org.smadl.smadl.SmadlPackage#getSocialMachine_Depends()
   * @model
   * @generated
   */
  EList<SocialMachine> getDepends();

  /**
   * Returns the value of the '<em><b>General Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>General Constraints</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>General Constraints</em>' containment reference.
   * @see #setGeneralConstraints(GeneralConstraint)
   * @see org.smadl.smadl.SmadlPackage#getSocialMachine_GeneralConstraints()
   * @model containment="true"
   * @generated
   */
  GeneralConstraint getGeneralConstraints();

  /**
   * Sets the value of the '{@link org.smadl.smadl.SocialMachine#getGeneralConstraints <em>General Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>General Constraints</em>' containment reference.
   * @see #getGeneralConstraints()
   * @generated
   */
  void setGeneralConstraints(GeneralConstraint value);

  /**
   * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
   * The list contents are of type {@link org.smadl.smadl.ComputationalUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructors</em>' containment reference list.
   * @see org.smadl.smadl.SmadlPackage#getSocialMachine_Constructors()
   * @model containment="true"
   * @generated
   */
  EList<ComputationalUnit> getConstructors();

  /**
   * Returns the value of the '<em><b>Wrapper Interface</b></em>' containment reference list.
   * The list contents are of type {@link org.smadl.smadl.ProvidedService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wrapper Interface</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wrapper Interface</em>' containment reference list.
   * @see org.smadl.smadl.SmadlPackage#getSocialMachine_WrapperInterface()
   * @model containment="true"
   * @generated
   */
  EList<ProvidedService> getWrapperInterface();

} // SocialMachine
