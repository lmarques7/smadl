/**
 */
package org.smadl.smadl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.smadl.smadl.GeneralConfigParameter;
import org.smadl.smadl.GeneralRelationship;
import org.smadl.smadl.RelationshipConstraint;
import org.smadl.smadl.SmadlPackage;
import org.smadl.smadl.SocialMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smadl.smadl.impl.GeneralRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.GeneralRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.GeneralRelationshipImpl#getConfigParams <em>Config Params</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.GeneralRelationshipImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralRelationshipImpl extends MinimalEObjectImpl.Container implements GeneralRelationship
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
   * The cached value of the '{@link #getConfigParams() <em>Config Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigParams()
   * @generated
   * @ordered
   */
  protected EList<GeneralConfigParameter> configParams;

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
  protected GeneralRelationshipImpl()
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
    return SmadlPackage.Literals.GENERAL_RELATIONSHIP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.GENERAL_RELATIONSHIP__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmadlPackage.GENERAL_RELATIONSHIP__TARGET, oldTarget, target));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.GENERAL_RELATIONSHIP__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GeneralConfigParameter> getConfigParams()
  {
    if (configParams == null)
    {
      configParams = new EObjectContainmentEList<GeneralConfigParameter>(GeneralConfigParameter.class, this, SmadlPackage.GENERAL_RELATIONSHIP__CONFIG_PARAMS);
    }
    return configParams;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT, oldConstraint, newConstraint);
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
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT, newConstraint, newConstraint));
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
      case SmadlPackage.GENERAL_RELATIONSHIP__CONFIG_PARAMS:
        return ((InternalEList<?>)getConfigParams()).basicRemove(otherEnd, msgs);
      case SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT:
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
      case SmadlPackage.GENERAL_RELATIONSHIP__NAME:
        return getName();
      case SmadlPackage.GENERAL_RELATIONSHIP__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case SmadlPackage.GENERAL_RELATIONSHIP__CONFIG_PARAMS:
        return getConfigParams();
      case SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT:
        return getConstraint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmadlPackage.GENERAL_RELATIONSHIP__NAME:
        setName((String)newValue);
        return;
      case SmadlPackage.GENERAL_RELATIONSHIP__TARGET:
        setTarget((SocialMachine)newValue);
        return;
      case SmadlPackage.GENERAL_RELATIONSHIP__CONFIG_PARAMS:
        getConfigParams().clear();
        getConfigParams().addAll((Collection<? extends GeneralConfigParameter>)newValue);
        return;
      case SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT:
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
      case SmadlPackage.GENERAL_RELATIONSHIP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmadlPackage.GENERAL_RELATIONSHIP__TARGET:
        setTarget((SocialMachine)null);
        return;
      case SmadlPackage.GENERAL_RELATIONSHIP__CONFIG_PARAMS:
        getConfigParams().clear();
        return;
      case SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT:
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
      case SmadlPackage.GENERAL_RELATIONSHIP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmadlPackage.GENERAL_RELATIONSHIP__TARGET:
        return target != null;
      case SmadlPackage.GENERAL_RELATIONSHIP__CONFIG_PARAMS:
        return configParams != null && !configParams.isEmpty();
      case SmadlPackage.GENERAL_RELATIONSHIP__CONSTRAINT:
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
    result.append(')');
    return result.toString();
  }

} //GeneralRelationshipImpl
