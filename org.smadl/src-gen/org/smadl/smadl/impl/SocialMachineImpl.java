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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.smadl.smadl.ComputationalUnit;
import org.smadl.smadl.GeneralConstraint;
import org.smadl.smadl.ProvidedService;
import org.smadl.smadl.RelationshipGroup;
import org.smadl.smadl.SmadlPackage;
import org.smadl.smadl.SocialMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smadl.smadl.impl.SocialMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.SocialMachineImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.SocialMachineImpl#getGeneralConstraints <em>General Constraints</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.SocialMachineImpl#getRelationshipGroup <em>Relationship Group</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.SocialMachineImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.smadl.smadl.impl.SocialMachineImpl#getWrapperInterface <em>Wrapper Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialMachineImpl extends MinimalEObjectImpl.Container implements SocialMachine
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
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<SocialMachine> dependencies;

  /**
   * The cached value of the '{@link #getGeneralConstraints() <em>General Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralConstraints()
   * @generated
   * @ordered
   */
  protected GeneralConstraint generalConstraints;

  /**
   * The cached value of the '{@link #getRelationshipGroup() <em>Relationship Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationshipGroup()
   * @generated
   * @ordered
   */
  protected RelationshipGroup relationshipGroup;

  /**
   * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructors()
   * @generated
   * @ordered
   */
  protected EList<ComputationalUnit> constructors;

  /**
   * The cached value of the '{@link #getWrapperInterface() <em>Wrapper Interface</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrapperInterface()
   * @generated
   * @ordered
   */
  protected EList<ProvidedService> wrapperInterface;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SocialMachineImpl()
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
    return SmadlPackage.Literals.SOCIAL_MACHINE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.SOCIAL_MACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SocialMachine> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectResolvingEList<SocialMachine>(SocialMachine.class, this, SmadlPackage.SOCIAL_MACHINE__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralConstraint getGeneralConstraints()
  {
    return generalConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeneralConstraints(GeneralConstraint newGeneralConstraints, NotificationChain msgs)
  {
    GeneralConstraint oldGeneralConstraints = generalConstraints;
    generalConstraints = newGeneralConstraints;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS, oldGeneralConstraints, newGeneralConstraints);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneralConstraints(GeneralConstraint newGeneralConstraints)
  {
    if (newGeneralConstraints != generalConstraints)
    {
      NotificationChain msgs = null;
      if (generalConstraints != null)
        msgs = ((InternalEObject)generalConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS, null, msgs);
      if (newGeneralConstraints != null)
        msgs = ((InternalEObject)newGeneralConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS, null, msgs);
      msgs = basicSetGeneralConstraints(newGeneralConstraints, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS, newGeneralConstraints, newGeneralConstraints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipGroup getRelationshipGroup()
  {
    return relationshipGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationshipGroup(RelationshipGroup newRelationshipGroup, NotificationChain msgs)
  {
    RelationshipGroup oldRelationshipGroup = relationshipGroup;
    relationshipGroup = newRelationshipGroup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP, oldRelationshipGroup, newRelationshipGroup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationshipGroup(RelationshipGroup newRelationshipGroup)
  {
    if (newRelationshipGroup != relationshipGroup)
    {
      NotificationChain msgs = null;
      if (relationshipGroup != null)
        msgs = ((InternalEObject)relationshipGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP, null, msgs);
      if (newRelationshipGroup != null)
        msgs = ((InternalEObject)newRelationshipGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP, null, msgs);
      msgs = basicSetRelationshipGroup(newRelationshipGroup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP, newRelationshipGroup, newRelationshipGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComputationalUnit> getConstructors()
  {
    if (constructors == null)
    {
      constructors = new EObjectContainmentEList<ComputationalUnit>(ComputationalUnit.class, this, SmadlPackage.SOCIAL_MACHINE__CONSTRUCTORS);
    }
    return constructors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProvidedService> getWrapperInterface()
  {
    if (wrapperInterface == null)
    {
      wrapperInterface = new EObjectContainmentEList<ProvidedService>(ProvidedService.class, this, SmadlPackage.SOCIAL_MACHINE__WRAPPER_INTERFACE);
    }
    return wrapperInterface;
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
      case SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS:
        return basicSetGeneralConstraints(null, msgs);
      case SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP:
        return basicSetRelationshipGroup(null, msgs);
      case SmadlPackage.SOCIAL_MACHINE__CONSTRUCTORS:
        return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
      case SmadlPackage.SOCIAL_MACHINE__WRAPPER_INTERFACE:
        return ((InternalEList<?>)getWrapperInterface()).basicRemove(otherEnd, msgs);
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
      case SmadlPackage.SOCIAL_MACHINE__NAME:
        return getName();
      case SmadlPackage.SOCIAL_MACHINE__DEPENDENCIES:
        return getDependencies();
      case SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS:
        return getGeneralConstraints();
      case SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP:
        return getRelationshipGroup();
      case SmadlPackage.SOCIAL_MACHINE__CONSTRUCTORS:
        return getConstructors();
      case SmadlPackage.SOCIAL_MACHINE__WRAPPER_INTERFACE:
        return getWrapperInterface();
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
      case SmadlPackage.SOCIAL_MACHINE__NAME:
        setName((String)newValue);
        return;
      case SmadlPackage.SOCIAL_MACHINE__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends SocialMachine>)newValue);
        return;
      case SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS:
        setGeneralConstraints((GeneralConstraint)newValue);
        return;
      case SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP:
        setRelationshipGroup((RelationshipGroup)newValue);
        return;
      case SmadlPackage.SOCIAL_MACHINE__CONSTRUCTORS:
        getConstructors().clear();
        getConstructors().addAll((Collection<? extends ComputationalUnit>)newValue);
        return;
      case SmadlPackage.SOCIAL_MACHINE__WRAPPER_INTERFACE:
        getWrapperInterface().clear();
        getWrapperInterface().addAll((Collection<? extends ProvidedService>)newValue);
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
      case SmadlPackage.SOCIAL_MACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmadlPackage.SOCIAL_MACHINE__DEPENDENCIES:
        getDependencies().clear();
        return;
      case SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS:
        setGeneralConstraints((GeneralConstraint)null);
        return;
      case SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP:
        setRelationshipGroup((RelationshipGroup)null);
        return;
      case SmadlPackage.SOCIAL_MACHINE__CONSTRUCTORS:
        getConstructors().clear();
        return;
      case SmadlPackage.SOCIAL_MACHINE__WRAPPER_INTERFACE:
        getWrapperInterface().clear();
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
      case SmadlPackage.SOCIAL_MACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmadlPackage.SOCIAL_MACHINE__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case SmadlPackage.SOCIAL_MACHINE__GENERAL_CONSTRAINTS:
        return generalConstraints != null;
      case SmadlPackage.SOCIAL_MACHINE__RELATIONSHIP_GROUP:
        return relationshipGroup != null;
      case SmadlPackage.SOCIAL_MACHINE__CONSTRUCTORS:
        return constructors != null && !constructors.isEmpty();
      case SmadlPackage.SOCIAL_MACHINE__WRAPPER_INTERFACE:
        return wrapperInterface != null && !wrapperInterface.isEmpty();
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

} //SocialMachineImpl
