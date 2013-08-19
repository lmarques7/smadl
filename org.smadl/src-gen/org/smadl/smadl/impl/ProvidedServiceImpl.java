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

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.smadl.smadl.OperationConstraint;
import org.smadl.smadl.ProvidedService;
import org.smadl.smadl.SmadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smadl.smadl.impl.ProvidedServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.ProvidedServiceImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.ProvidedServiceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.ProvidedServiceImpl#getOpConstraint <em>Op Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedServiceImpl extends MinimalEObjectImpl.Container implements ProvidedService
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
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference returnType;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<JvmFormalParameter> parameters;

  /**
   * The cached value of the '{@link #getOpConstraint() <em>Op Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpConstraint()
   * @generated
   * @ordered
   */
  protected OperationConstraint opConstraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidedServiceImpl()
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
    return SmadlPackage.Literals.PROVIDED_SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.PROVIDED_SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(JvmTypeReference newReturnType, NotificationChain msgs)
  {
    JvmTypeReference oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(JvmTypeReference newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmFormalParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, SmadlPackage.PROVIDED_SERVICE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationConstraint getOpConstraint()
  {
    return opConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpConstraint(OperationConstraint newOpConstraint, NotificationChain msgs)
  {
    OperationConstraint oldOpConstraint = opConstraint;
    opConstraint = newOpConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT, oldOpConstraint, newOpConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpConstraint(OperationConstraint newOpConstraint)
  {
    if (newOpConstraint != opConstraint)
    {
      NotificationChain msgs = null;
      if (opConstraint != null)
        msgs = ((InternalEObject)opConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT, null, msgs);
      if (newOpConstraint != null)
        msgs = ((InternalEObject)newOpConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT, null, msgs);
      msgs = basicSetOpConstraint(newOpConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT, newOpConstraint, newOpConstraint));
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
      case SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case SmadlPackage.PROVIDED_SERVICE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT:
        return basicSetOpConstraint(null, msgs);
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
      case SmadlPackage.PROVIDED_SERVICE__NAME:
        return getName();
      case SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE:
        return getReturnType();
      case SmadlPackage.PROVIDED_SERVICE__PARAMETERS:
        return getParameters();
      case SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT:
        return getOpConstraint();
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
      case SmadlPackage.PROVIDED_SERVICE__NAME:
        setName((String)newValue);
        return;
      case SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE:
        setReturnType((JvmTypeReference)newValue);
        return;
      case SmadlPackage.PROVIDED_SERVICE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends JvmFormalParameter>)newValue);
        return;
      case SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT:
        setOpConstraint((OperationConstraint)newValue);
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
      case SmadlPackage.PROVIDED_SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE:
        setReturnType((JvmTypeReference)null);
        return;
      case SmadlPackage.PROVIDED_SERVICE__PARAMETERS:
        getParameters().clear();
        return;
      case SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT:
        setOpConstraint((OperationConstraint)null);
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
      case SmadlPackage.PROVIDED_SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmadlPackage.PROVIDED_SERVICE__RETURN_TYPE:
        return returnType != null;
      case SmadlPackage.PROVIDED_SERVICE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case SmadlPackage.PROVIDED_SERVICE__OP_CONSTRAINT:
        return opConstraint != null;
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

} //ProvidedServiceImpl
