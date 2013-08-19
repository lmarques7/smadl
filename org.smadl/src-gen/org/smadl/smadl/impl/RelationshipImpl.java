/**
 */
package org.smadl.smadl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.smadl.smadl.Relationship;
import org.smadl.smadl.RelationshipConstraint;
import org.smadl.smadl.SmadlPackage;
import org.smadl.smadl.SocialMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smadl.smadl.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.RelationshipImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.RelationshipImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.RelationshipImpl#getSecret <em>Secret</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.RelationshipImpl#getUserToken <em>User Token</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.RelationshipImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected SocialMachine target;

  /**
   * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected static final String URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected String uri = URI_EDEFAULT;

  /**
   * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApiKey()
   * @generated
   * @ordered
   */
  protected static final String API_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApiKey()
   * @generated
   * @ordered
   */
  protected String apiKey = API_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getSecret() <em>Secret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecret()
   * @generated
   * @ordered
   */
  protected static final String SECRET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecret() <em>Secret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecret()
   * @generated
   * @ordered
   */
  protected String secret = SECRET_EDEFAULT;

  /**
   * The default value of the '{@link #getUserToken() <em>User Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserToken()
   * @generated
   * @ordered
   */
  protected static final String USER_TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUserToken() <em>User Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserToken()
   * @generated
   * @ordered
   */
  protected String userToken = USER_TOKEN_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected RelationshipConstraint constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmadlPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SocialMachine getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (SocialMachine)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmadlPackage.RELATIONSHIP__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SocialMachine basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(SocialMachine newTarget)
  {
    SocialMachine oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUri(String newUri)
  {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__URI, oldUri, uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getApiKey()
  {
    return apiKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApiKey(String newApiKey)
  {
    String oldApiKey = apiKey;
    apiKey = newApiKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__API_KEY, oldApiKey, apiKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSecret()
  {
    return secret;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecret(String newSecret)
  {
    String oldSecret = secret;
    secret = newSecret;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__SECRET, oldSecret, secret));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUserToken()
  {
    return userToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserToken(String newUserToken)
  {
    String oldUserToken = userToken;
    userToken = newUserToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__USER_TOKEN, oldUserToken, userToken));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipConstraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(RelationshipConstraint newConstraint, NotificationChain msgs)
  {
    RelationshipConstraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(RelationshipConstraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.RELATIONSHIP__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.RELATIONSHIP__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.RELATIONSHIP__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmadlPackage.RELATIONSHIP__CONSTRAINT:
        return basicSetConstraint(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmadlPackage.RELATIONSHIP__NAME:
        return getName();
      case SmadlPackage.RELATIONSHIP__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case SmadlPackage.RELATIONSHIP__URI:
        return getUri();
      case SmadlPackage.RELATIONSHIP__API_KEY:
        return getApiKey();
      case SmadlPackage.RELATIONSHIP__SECRET:
        return getSecret();
      case SmadlPackage.RELATIONSHIP__USER_TOKEN:
        return getUserToken();
      case SmadlPackage.RELATIONSHIP__CONSTRAINT:
        return getConstraint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmadlPackage.RELATIONSHIP__NAME:
        setName((String)newValue);
        return;
      case SmadlPackage.RELATIONSHIP__TARGET:
        setTarget((SocialMachine)newValue);
        return;
      case SmadlPackage.RELATIONSHIP__URI:
        setUri((String)newValue);
        return;
      case SmadlPackage.RELATIONSHIP__API_KEY:
        setApiKey((String)newValue);
        return;
      case SmadlPackage.RELATIONSHIP__SECRET:
        setSecret((String)newValue);
        return;
      case SmadlPackage.RELATIONSHIP__USER_TOKEN:
        setUserToken((String)newValue);
        return;
      case SmadlPackage.RELATIONSHIP__CONSTRAINT:
        setConstraint((RelationshipConstraint)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmadlPackage.RELATIONSHIP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmadlPackage.RELATIONSHIP__TARGET:
        setTarget((SocialMachine)null);
        return;
      case SmadlPackage.RELATIONSHIP__URI:
        setUri(URI_EDEFAULT);
        return;
      case SmadlPackage.RELATIONSHIP__API_KEY:
        setApiKey(API_KEY_EDEFAULT);
        return;
      case SmadlPackage.RELATIONSHIP__SECRET:
        setSecret(SECRET_EDEFAULT);
        return;
      case SmadlPackage.RELATIONSHIP__USER_TOKEN:
        setUserToken(USER_TOKEN_EDEFAULT);
        return;
      case SmadlPackage.RELATIONSHIP__CONSTRAINT:
        setConstraint((RelationshipConstraint)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmadlPackage.RELATIONSHIP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmadlPackage.RELATIONSHIP__TARGET:
        return target != null;
      case SmadlPackage.RELATIONSHIP__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
      case SmadlPackage.RELATIONSHIP__API_KEY:
        return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
      case SmadlPackage.RELATIONSHIP__SECRET:
        return SECRET_EDEFAULT == null ? secret != null : !SECRET_EDEFAULT.equals(secret);
      case SmadlPackage.RELATIONSHIP__USER_TOKEN:
        return USER_TOKEN_EDEFAULT == null ? userToken != null : !USER_TOKEN_EDEFAULT.equals(userToken);
      case SmadlPackage.RELATIONSHIP__CONSTRAINT:
        return constraint != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", uri: ");
    result.append(uri);
    result.append(", apiKey: ");
    result.append(apiKey);
    result.append(", secret: ");
    result.append(secret);
    result.append(", userToken: ");
    result.append(userToken);
    result.append(')');
    return result.toString();
  }

} //RelationshipImpl
