/**
 */
package org.smadl.smadl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.xbase.XExpression;

import org.smadl.smadl.ComputationalUnit;
import org.smadl.smadl.SmadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computational Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smadl.smadl.impl.ComputationalUnitImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.ComputationalUnitImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputationalUnitImpl extends MinimalEObjectImpl.Container implements ComputationalUnit
{
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
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<XExpression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComputationalUnitImpl()
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
    return SmadlPackage.Literals.COMPUTATIONAL_UNIT;
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
      parameters = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, SmadlPackage.COMPUTATIONAL_UNIT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<XExpression>(XExpression.class, this, SmadlPackage.COMPUTATIONAL_UNIT__EXPRESSIONS);
    }
    return expressions;
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
      case SmadlPackage.COMPUTATIONAL_UNIT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case SmadlPackage.COMPUTATIONAL_UNIT__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
      case SmadlPackage.COMPUTATIONAL_UNIT__PARAMETERS:
        return getParameters();
      case SmadlPackage.COMPUTATIONAL_UNIT__EXPRESSIONS:
        return getExpressions();
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
      case SmadlPackage.COMPUTATIONAL_UNIT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends JvmFormalParameter>)newValue);
        return;
      case SmadlPackage.COMPUTATIONAL_UNIT__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends XExpression>)newValue);
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
      case SmadlPackage.COMPUTATIONAL_UNIT__PARAMETERS:
        getParameters().clear();
        return;
      case SmadlPackage.COMPUTATIONAL_UNIT__EXPRESSIONS:
        getExpressions().clear();
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
      case SmadlPackage.COMPUTATIONAL_UNIT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case SmadlPackage.COMPUTATIONAL_UNIT__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComputationalUnitImpl
