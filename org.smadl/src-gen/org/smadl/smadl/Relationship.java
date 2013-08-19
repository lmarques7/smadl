/**
 */
package org.smadl.smadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smadl.smadl.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.smadl.smadl.Relationship#getUri <em>Uri</em>}</li>
 *   <li>{@link org.smadl.smadl.Relationship#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.smadl.smadl.Relationship#getSecret <em>Secret</em>}</li>
 *   <li>{@link org.smadl.smadl.Relationship#getUserToken <em>User Token</em>}</li>
 *   <li>{@link org.smadl.smadl.Relationship#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smadl.smadl.SmadlPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject
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
   * @see org.smadl.smadl.SmadlPackage#getRelationship_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.smadl.smadl.Relationship#getName <em>Name</em>}' attribute.
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
   * @see org.smadl.smadl.SmadlPackage#getRelationship_Target()
   * @model
   * @generated
   */
  SocialMachine getTarget();

  /**
   * Sets the value of the '{@link org.smadl.smadl.Relationship#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(SocialMachine value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see org.smadl.smadl.SmadlPackage#getRelationship_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link org.smadl.smadl.Relationship#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Api Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Api Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Api Key</em>' attribute.
   * @see #setApiKey(String)
   * @see org.smadl.smadl.SmadlPackage#getRelationship_ApiKey()
   * @model
   * @generated
   */
  String getApiKey();

  /**
   * Sets the value of the '{@link org.smadl.smadl.Relationship#getApiKey <em>Api Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Api Key</em>' attribute.
   * @see #getApiKey()
   * @generated
   */
  void setApiKey(String value);

  /**
   * Returns the value of the '<em><b>Secret</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secret</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secret</em>' attribute.
   * @see #setSecret(String)
   * @see org.smadl.smadl.SmadlPackage#getRelationship_Secret()
   * @model
   * @generated
   */
  String getSecret();

  /**
   * Sets the value of the '{@link org.smadl.smadl.Relationship#getSecret <em>Secret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secret</em>' attribute.
   * @see #getSecret()
   * @generated
   */
  void setSecret(String value);

  /**
   * Returns the value of the '<em><b>User Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Token</em>' attribute.
   * @see #setUserToken(String)
   * @see org.smadl.smadl.SmadlPackage#getRelationship_UserToken()
   * @model
   * @generated
   */
  String getUserToken();

  /**
   * Sets the value of the '{@link org.smadl.smadl.Relationship#getUserToken <em>User Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Token</em>' attribute.
   * @see #getUserToken()
   * @generated
   */
  void setUserToken(String value);

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
   * @see org.smadl.smadl.SmadlPackage#getRelationship_Constraint()
   * @model containment="true"
   * @generated
   */
  RelationshipConstraint getConstraint();

  /**
   * Sets the value of the '{@link org.smadl.smadl.Relationship#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(RelationshipConstraint value);

} // Relationship
