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
      case SmadlPackage.RELATIONSHIP_GROUP: return createRelationshipGroup();
      case SmadlPackage.OAUTH_RELATIONSHIP: return createOAuthRelationship();
      case SmadlPackage.GENERAL_RELATIONSHIP: return createGeneralRelationship();
      case SmadlPackage.RELATIONSHIP_CONSTRAINT: return createRelationshipConstraint();
      case SmadlPackage.RELATIONSHIP_CONSTRAINT_FULL_ACCESS: return createRelationshipConstraintFullAccess();
      case SmadlPackage.RELATIONSHIP_CONSTRAINT_LIST_OF_OPS: return createRelationshipConstraintListOfOps();
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
      case SmadlPackage.OPERATION_CONSTRAINT_TYPE:
        return createOperationConstraintTypeFromString(eDataType, initialValue);
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
      case SmadlPackage.OPERATION_CONSTRAINT_TYPE:
        return convertOperationConstraintTypeToString(eDataType, instanceValue);
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
  public RelationshipGroup createRelationshipGroup()
  {
    RelationshipGroupImpl relationshipGroup = new RelationshipGroupImpl();
    return relationshipGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OAuthRelationship createOAuthRelationship()
  {
    OAuthRelationshipImpl oAuthRelationship = new OAuthRelationshipImpl();
    return oAuthRelationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralRelationship createGeneralRelationship()
  {
    GeneralRelationshipImpl generalRelationship = new GeneralRelationshipImpl();
    return generalRelationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipConstraint createRelationshipConstraint()
  {
    RelationshipConstraintImpl relationshipConstraint = new RelationshipConstraintImpl();
    return relationshipConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipConstraintFullAccess createRelationshipConstraintFullAccess()
  {
    RelationshipConstraintFullAccessImpl relationshipConstraintFullAccess = new RelationshipConstraintFullAccessImpl();
    return relationshipConstraintFullAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipConstraintListOfOps createRelationshipConstraintListOfOps()
  {
    RelationshipConstraintListOfOpsImpl relationshipConstraintListOfOps = new RelationshipConstraintListOfOpsImpl();
    return relationshipConstraintListOfOps;
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
  public OperationConstraintType createOperationConstraintTypeFromString(EDataType eDataType, String initialValue)
  {
    OperationConstraintType result = OperationConstraintType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationConstraintTypeToString(EDataType eDataType, Object instanceValue)
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
