/**
 */
package org.smadl.smadl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.smadl.smadl.ComputationalUnit;
import org.smadl.smadl.Entity;
import org.smadl.smadl.GeneralConfigParameter;
import org.smadl.smadl.GeneralConstraint;
import org.smadl.smadl.GenericRelationship;
import org.smadl.smadl.OAuthRelationship;
import org.smadl.smadl.OperationConstraint;
import org.smadl.smadl.OperationConstraintType;
import org.smadl.smadl.ProvidedService;
import org.smadl.smadl.RelationshipConstraint;
import org.smadl.smadl.RelationshipConstraintFullAccess;
import org.smadl.smadl.RelationshipConstraintListOfOps;
import org.smadl.smadl.RelationshipGroup;
import org.smadl.smadl.SmadlFactory;
import org.smadl.smadl.SmadlPackage;
import org.smadl.smadl.SocialMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmadlPackageImpl extends EPackageImpl implements SmadlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass socialMachineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oAuthRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalConfigParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipConstraintFullAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipConstraintListOfOpsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass computationalUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providedServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operationConstraintTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.smadl.smadl.SmadlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SmadlPackageImpl()
  {
    super(eNS_URI, SmadlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SmadlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SmadlPackage init()
  {
    if (isInited) return (SmadlPackage)EPackage.Registry.INSTANCE.getEPackage(SmadlPackage.eNS_URI);

    // Obtain or create and register package
    SmadlPackageImpl theSmadlPackage = (SmadlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmadlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmadlPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSmadlPackage.createPackageContents();

    // Initialize created meta-data
    theSmadlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSmadlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SmadlPackage.eNS_URI, theSmadlPackage);
    return theSmadlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Entities()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSocialMachine()
  {
    return socialMachineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSocialMachine_Name()
  {
    return (EAttribute)socialMachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSocialMachine_Dependencies()
  {
    return (EReference)socialMachineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSocialMachine_GeneralConstraints()
  {
    return (EReference)socialMachineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSocialMachine_RelationshipGroup()
  {
    return (EReference)socialMachineEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSocialMachine_Constructors()
  {
    return (EReference)socialMachineEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSocialMachine_WrapperInterface()
  {
    return (EReference)socialMachineEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipGroup()
  {
    return relationshipGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipGroup_Relationships()
  {
    return (EReference)relationshipGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOAuthRelationship()
  {
    return oAuthRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOAuthRelationship_Name()
  {
    return (EAttribute)oAuthRelationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOAuthRelationship_Target()
  {
    return (EReference)oAuthRelationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOAuthRelationship_Uri()
  {
    return (EAttribute)oAuthRelationshipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOAuthRelationship_ApiKey()
  {
    return (EAttribute)oAuthRelationshipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOAuthRelationship_Secret()
  {
    return (EAttribute)oAuthRelationshipEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOAuthRelationship_UserToken()
  {
    return (EAttribute)oAuthRelationshipEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOAuthRelationship_Constraint()
  {
    return (EReference)oAuthRelationshipEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericRelationship()
  {
    return genericRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericRelationship_Name()
  {
    return (EAttribute)genericRelationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericRelationship_Target()
  {
    return (EReference)genericRelationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericRelationship_ConfigParams()
  {
    return (EReference)genericRelationshipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericRelationship_Constraint()
  {
    return (EReference)genericRelationshipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralConfigParameter()
  {
    return generalConfigParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralConfigParameter_Name()
  {
    return (EAttribute)generalConfigParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralConfigParameter_Value()
  {
    return (EAttribute)generalConfigParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipConstraint()
  {
    return relationshipConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipConstraint_Type()
  {
    return (EReference)relationshipConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipConstraintFullAccess()
  {
    return relationshipConstraintFullAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationshipConstraintFullAccess_Name()
  {
    return (EAttribute)relationshipConstraintFullAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipConstraintListOfOps()
  {
    return relationshipConstraintListOfOpsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationshipConstraintListOfOps_Name()
  {
    return (EAttribute)relationshipConstraintListOfOpsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipConstraintListOfOps_Operations()
  {
    return (EReference)relationshipConstraintListOfOpsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComputationalUnit()
  {
    return computationalUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComputationalUnit_Parameters()
  {
    return (EReference)computationalUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComputationalUnit_Body()
  {
    return (EReference)computationalUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvidedService()
  {
    return providedServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvidedService_Name()
  {
    return (EAttribute)providedServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidedService_ReturnType()
  {
    return (EReference)providedServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidedService_Parameters()
  {
    return (EReference)providedServiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidedService_OpConstraint()
  {
    return (EReference)providedServiceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationConstraint()
  {
    return operationConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationConstraint_Type()
  {
    return (EAttribute)operationConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralConstraint()
  {
    return generalConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralConstraint_Type()
  {
    return (EAttribute)generalConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperationConstraintType()
  {
    return operationConstraintTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmadlFactory getSmadlFactory()
  {
    return (SmadlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__ENTITIES);

    socialMachineEClass = createEClass(SOCIAL_MACHINE);
    createEAttribute(socialMachineEClass, SOCIAL_MACHINE__NAME);
    createEReference(socialMachineEClass, SOCIAL_MACHINE__DEPENDENCIES);
    createEReference(socialMachineEClass, SOCIAL_MACHINE__GENERAL_CONSTRAINTS);
    createEReference(socialMachineEClass, SOCIAL_MACHINE__RELATIONSHIP_GROUP);
    createEReference(socialMachineEClass, SOCIAL_MACHINE__CONSTRUCTORS);
    createEReference(socialMachineEClass, SOCIAL_MACHINE__WRAPPER_INTERFACE);

    relationshipGroupEClass = createEClass(RELATIONSHIP_GROUP);
    createEReference(relationshipGroupEClass, RELATIONSHIP_GROUP__RELATIONSHIPS);

    oAuthRelationshipEClass = createEClass(OAUTH_RELATIONSHIP);
    createEAttribute(oAuthRelationshipEClass, OAUTH_RELATIONSHIP__NAME);
    createEReference(oAuthRelationshipEClass, OAUTH_RELATIONSHIP__TARGET);
    createEAttribute(oAuthRelationshipEClass, OAUTH_RELATIONSHIP__URI);
    createEAttribute(oAuthRelationshipEClass, OAUTH_RELATIONSHIP__API_KEY);
    createEAttribute(oAuthRelationshipEClass, OAUTH_RELATIONSHIP__SECRET);
    createEAttribute(oAuthRelationshipEClass, OAUTH_RELATIONSHIP__USER_TOKEN);
    createEReference(oAuthRelationshipEClass, OAUTH_RELATIONSHIP__CONSTRAINT);

    genericRelationshipEClass = createEClass(GENERIC_RELATIONSHIP);
    createEAttribute(genericRelationshipEClass, GENERIC_RELATIONSHIP__NAME);
    createEReference(genericRelationshipEClass, GENERIC_RELATIONSHIP__TARGET);
    createEReference(genericRelationshipEClass, GENERIC_RELATIONSHIP__CONFIG_PARAMS);
    createEReference(genericRelationshipEClass, GENERIC_RELATIONSHIP__CONSTRAINT);

    generalConfigParameterEClass = createEClass(GENERAL_CONFIG_PARAMETER);
    createEAttribute(generalConfigParameterEClass, GENERAL_CONFIG_PARAMETER__NAME);
    createEAttribute(generalConfigParameterEClass, GENERAL_CONFIG_PARAMETER__VALUE);

    relationshipConstraintEClass = createEClass(RELATIONSHIP_CONSTRAINT);
    createEReference(relationshipConstraintEClass, RELATIONSHIP_CONSTRAINT__TYPE);

    relationshipConstraintFullAccessEClass = createEClass(RELATIONSHIP_CONSTRAINT_FULL_ACCESS);
    createEAttribute(relationshipConstraintFullAccessEClass, RELATIONSHIP_CONSTRAINT_FULL_ACCESS__NAME);

    relationshipConstraintListOfOpsEClass = createEClass(RELATIONSHIP_CONSTRAINT_LIST_OF_OPS);
    createEAttribute(relationshipConstraintListOfOpsEClass, RELATIONSHIP_CONSTRAINT_LIST_OF_OPS__NAME);
    createEReference(relationshipConstraintListOfOpsEClass, RELATIONSHIP_CONSTRAINT_LIST_OF_OPS__OPERATIONS);

    computationalUnitEClass = createEClass(COMPUTATIONAL_UNIT);
    createEReference(computationalUnitEClass, COMPUTATIONAL_UNIT__PARAMETERS);
    createEReference(computationalUnitEClass, COMPUTATIONAL_UNIT__BODY);

    providedServiceEClass = createEClass(PROVIDED_SERVICE);
    createEAttribute(providedServiceEClass, PROVIDED_SERVICE__NAME);
    createEReference(providedServiceEClass, PROVIDED_SERVICE__RETURN_TYPE);
    createEReference(providedServiceEClass, PROVIDED_SERVICE__PARAMETERS);
    createEReference(providedServiceEClass, PROVIDED_SERVICE__OP_CONSTRAINT);

    operationConstraintEClass = createEClass(OPERATION_CONSTRAINT);
    createEAttribute(operationConstraintEClass, OPERATION_CONSTRAINT__TYPE);

    generalConstraintEClass = createEClass(GENERAL_CONSTRAINT);
    createEAttribute(generalConstraintEClass, GENERAL_CONSTRAINT__TYPE);

    // Create enums
    operationConstraintTypeEEnum = createEEnum(OPERATION_CONSTRAINT_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Entities(), this.getSocialMachine(), null, "entities", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(socialMachineEClass, SocialMachine.class, "SocialMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSocialMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, SocialMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSocialMachine_Dependencies(), this.getSocialMachine(), null, "dependencies", null, 0, -1, SocialMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSocialMachine_GeneralConstraints(), this.getGeneralConstraint(), null, "generalConstraints", null, 0, 1, SocialMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSocialMachine_RelationshipGroup(), this.getRelationshipGroup(), null, "relationshipGroup", null, 0, 1, SocialMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSocialMachine_Constructors(), this.getComputationalUnit(), null, "constructors", null, 0, -1, SocialMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSocialMachine_WrapperInterface(), this.getProvidedService(), null, "wrapperInterface", null, 0, -1, SocialMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipGroupEClass, RelationshipGroup.class, "RelationshipGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationshipGroup_Relationships(), ecorePackage.getEObject(), null, "relationships", null, 0, -1, RelationshipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oAuthRelationshipEClass, OAuthRelationship.class, "OAuthRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOAuthRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, OAuthRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOAuthRelationship_Target(), this.getSocialMachine(), null, "target", null, 0, 1, OAuthRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOAuthRelationship_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, OAuthRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOAuthRelationship_ApiKey(), ecorePackage.getEString(), "apiKey", null, 0, 1, OAuthRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOAuthRelationship_Secret(), ecorePackage.getEString(), "secret", null, 0, 1, OAuthRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOAuthRelationship_UserToken(), ecorePackage.getEString(), "userToken", null, 0, 1, OAuthRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOAuthRelationship_Constraint(), this.getRelationshipConstraint(), null, "constraint", null, 0, 1, OAuthRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericRelationshipEClass, GenericRelationship.class, "GenericRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericRelationship_Target(), this.getSocialMachine(), null, "target", null, 0, 1, GenericRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericRelationship_ConfigParams(), this.getGeneralConfigParameter(), null, "configParams", null, 0, -1, GenericRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericRelationship_Constraint(), this.getRelationshipConstraint(), null, "constraint", null, 0, 1, GenericRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalConfigParameterEClass, GeneralConfigParameter.class, "GeneralConfigParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralConfigParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, GeneralConfigParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralConfigParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, GeneralConfigParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipConstraintEClass, RelationshipConstraint.class, "RelationshipConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationshipConstraint_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, RelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipConstraintFullAccessEClass, RelationshipConstraintFullAccess.class, "RelationshipConstraintFullAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationshipConstraintFullAccess_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationshipConstraintFullAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipConstraintListOfOpsEClass, RelationshipConstraintListOfOps.class, "RelationshipConstraintListOfOps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationshipConstraintListOfOps_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationshipConstraintListOfOps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationshipConstraintListOfOps_Operations(), this.getProvidedService(), null, "operations", null, 0, -1, RelationshipConstraintListOfOps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(computationalUnitEClass, ComputationalUnit.class, "ComputationalUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComputationalUnit_Parameters(), theTypesPackage.getJvmFormalParameter(), null, "parameters", null, 0, -1, ComputationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComputationalUnit_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, ComputationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providedServiceEClass, ProvidedService.class, "ProvidedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProvidedService_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProvidedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidedService_ReturnType(), theTypesPackage.getJvmTypeReference(), null, "returnType", null, 0, 1, ProvidedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidedService_Parameters(), theTypesPackage.getJvmFormalParameter(), null, "parameters", null, 0, -1, ProvidedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidedService_OpConstraint(), this.getOperationConstraint(), null, "opConstraint", null, 0, 1, ProvidedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationConstraintEClass, OperationConstraint.class, "OperationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationConstraint_Type(), this.getOperationConstraintType(), "type", null, 0, -1, OperationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalConstraintEClass, GeneralConstraint.class, "GeneralConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralConstraint_Type(), this.getOperationConstraintType(), "type", null, 0, 1, GeneralConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(operationConstraintTypeEEnum, OperationConstraintType.class, "OperationConstraintType");
    addEEnumLiteral(operationConstraintTypeEEnum, OperationConstraintType.UNLIMITED);
    addEEnumLiteral(operationConstraintTypeEEnum, OperationConstraintType.REQUESTS_PER_PERIOD);
    addEEnumLiteral(operationConstraintTypeEEnum, OperationConstraintType.PRE_AUTH_SM);
    addEEnumLiteral(operationConstraintTypeEEnum, OperationConstraintType.REDUCED_RESOURCE);

    // Create resource
    createResource(eNS_URI);
  }

} //SmadlPackageImpl
