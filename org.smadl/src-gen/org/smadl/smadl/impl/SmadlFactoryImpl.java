/**
 */
package org.smadl.smadl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smadl.smadl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmadlFactoryImpl extends EFactoryImpl implements SmadlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmadlFactory init()
  {
    try
    {
      SmadlFactory theSmadlFactory = (SmadlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.smadl.org"); 
      if (theSmadlFactory != null)
      {
        return theSmadlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmadlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmadlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmadlPackage.ENTITY: return createEntity();
      case SmadlPackage.SOCIAL_MACHINE: return createSocialMachine();
      case SmadlPackage.COMPUTATIONAL_UNIT: return createComputationalUnit();
      case SmadlPackage.PROVIDED_SERVICE: return createProvidedService();
      case SmadlPackage.OPERATION_CONSTRAINT: return createOperationConstraint();
      case SmadlPackage.GENERAL_CONSTRAINT: return createGeneralConstraint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SmadlPackage.CONSTRAINT_TYPE:
        return createConstraintTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SmadlPackage.CONSTRAINT_TYPE:
        return convertConstraintTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SocialMachine createSocialMachine()
  {
    SocialMachineImpl socialMachine = new SocialMachineImpl();
    return socialMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComputationalUnit createComputationalUnit()
  {
    ComputationalUnitImpl computationalUnit = new ComputationalUnitImpl();
    return computationalUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedService createProvidedService()
  {
    ProvidedServiceImpl providedService = new ProvidedServiceImpl();
    return providedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationConstraint createOperationConstraint()
  {
    OperationConstraintImpl operationConstraint = new OperationConstraintImpl();
    return operationConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralConstraint createGeneralConstraint()
  {
    GeneralConstraintImpl generalConstraint = new GeneralConstraintImpl();
    return generalConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintType createConstraintTypeFromString(EDataType eDataType, String initialValue)
  {
    ConstraintType result = ConstraintType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmadlPackage getSmadlPackage()
  {
    return (SmadlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmadlPackage getPackage()
  {
    return SmadlPackage.eINSTANCE;
  }

} //SmadlFactoryImpl
