/**
 */
package org.smadl.smadl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smadl.smadl.SmadlFactory
 * @model kind="package"
 * @generated
 */
public interface SmadlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smadl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.smadl.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smadl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmadlPackage eINSTANCE = org.smadl.smadl.impl.SmadlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.EntityImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITIES = 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.SocialMachineImpl <em>Social Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.SocialMachineImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getSocialMachine()
   * @generated
   */
  int SOCIAL_MACHINE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__DEPENDENCIES = 1;

  /**
   * The feature id for the '<em><b>General Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__GENERAL_CONSTRAINTS = 2;

  /**
   * The feature id for the '<em><b>Relationship Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__RELATIONSHIP_GROUP = 3;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__CONSTRUCTORS = 4;

  /**
   * The feature id for the '<em><b>Wrapper Interface</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__WRAPPER_INTERFACE = 5;

  /**
   * The number of structural features of the '<em>Social Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.RelationshipGroupImpl <em>Relationship Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.RelationshipGroupImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipGroup()
   * @generated
   */
  int RELATIONSHIP_GROUP = 2;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_GROUP__RELATIONSHIPS = 0;

  /**
   * The number of structural features of the '<em>Relationship Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.RelationshipImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NAME = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TARGET = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__URI = 2;

  /**
   * The feature id for the '<em><b>Api Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__API_KEY = 3;

  /**
   * The feature id for the '<em><b>Secret</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECRET = 4;

  /**
   * The feature id for the '<em><b>User Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__USER_TOKEN = 5;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__CONSTRAINT = 6;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.RelationshipConstraintImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipConstraint()
   * @generated
   */
  int RELATIONSHIP_CONSTRAINT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__TYPE = 0;

  /**
   * The number of structural features of the '<em>Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.RelationshipConstraintFullAccessImpl <em>Relationship Constraint Full Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.RelationshipConstraintFullAccessImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipConstraintFullAccess()
   * @generated
   */
  int RELATIONSHIP_CONSTRAINT_FULL_ACCESS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_FULL_ACCESS__NAME = 0;

  /**
   * The number of structural features of the '<em>Relationship Constraint Full Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_FULL_ACCESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.RelationshipConstraintListOfOpsImpl <em>Relationship Constraint List Of Ops</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.RelationshipConstraintListOfOpsImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipConstraintListOfOps()
   * @generated
   */
  int RELATIONSHIP_CONSTRAINT_LIST_OF_OPS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_LIST_OF_OPS__NAME = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_LIST_OF_OPS__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Relationship Constraint List Of Ops</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_LIST_OF_OPS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.ComputationalUnitImpl <em>Computational Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.ComputationalUnitImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getComputationalUnit()
   * @generated
   */
  int COMPUTATIONAL_UNIT = 7;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTATIONAL_UNIT__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTATIONAL_UNIT__BODY = 1;

  /**
   * The number of structural features of the '<em>Computational Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTATIONAL_UNIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.ProvidedServiceImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getProvidedService()
   * @generated
   */
  int PROVIDED_SERVICE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Op Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__OP_CONSTRAINT = 3;

  /**
   * The number of structural features of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.OperationConstraintImpl <em>Operation Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.OperationConstraintImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getOperationConstraint()
   * @generated
   */
  int OPERATION_CONSTRAINT = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CONSTRAINT__TYPE = 0;

  /**
   * The number of structural features of the '<em>Operation Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.GeneralConstraintImpl <em>General Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.GeneralConstraintImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getGeneralConstraint()
   * @generated
   */
  int GENERAL_CONSTRAINT = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_CONSTRAINT__TYPE = 0;

  /**
   * The number of structural features of the '<em>General Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.smadl.smadl.OperationConstraintType <em>Operation Constraint Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.OperationConstraintType
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getOperationConstraintType()
   * @generated
   */
  int OPERATION_CONSTRAINT_TYPE = 11;


  /**
   * Returns the meta object for class '{@link org.smadl.smadl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.smadl.smadl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.smadl.smadl.Entity#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.smadl.smadl.Entity#getEntities()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Entities();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.SocialMachine <em>Social Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Social Machine</em>'.
   * @see org.smadl.smadl.SocialMachine
   * @generated
   */
  EClass getSocialMachine();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.SocialMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.smadl.smadl.SocialMachine#getName()
   * @see #getSocialMachine()
   * @generated
   */
  EAttribute getSocialMachine_Name();

  /**
   * Returns the meta object for the reference list '{@link org.smadl.smadl.SocialMachine#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependencies</em>'.
   * @see org.smadl.smadl.SocialMachine#getDependencies()
   * @see #getSocialMachine()
   * @generated
   */
  EReference getSocialMachine_Dependencies();

  /**
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.SocialMachine#getGeneralConstraints <em>General Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>General Constraints</em>'.
   * @see org.smadl.smadl.SocialMachine#getGeneralConstraints()
   * @see #getSocialMachine()
   * @generated
   */
  EReference getSocialMachine_GeneralConstraints();

  /**
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.SocialMachine#getRelationshipGroup <em>Relationship Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationship Group</em>'.
   * @see org.smadl.smadl.SocialMachine#getRelationshipGroup()
   * @see #getSocialMachine()
   * @generated
   */
  EReference getSocialMachine_RelationshipGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.smadl.smadl.SocialMachine#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.smadl.smadl.SocialMachine#getConstructors()
   * @see #getSocialMachine()
   * @generated
   */
  EReference getSocialMachine_Constructors();

  /**
   * Returns the meta object for the containment reference list '{@link org.smadl.smadl.SocialMachine#getWrapperInterface <em>Wrapper Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Wrapper Interface</em>'.
   * @see org.smadl.smadl.SocialMachine#getWrapperInterface()
   * @see #getSocialMachine()
   * @generated
   */
  EReference getSocialMachine_WrapperInterface();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.RelationshipGroup <em>Relationship Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Group</em>'.
   * @see org.smadl.smadl.RelationshipGroup
   * @generated
   */
  EClass getRelationshipGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.smadl.smadl.RelationshipGroup#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see org.smadl.smadl.RelationshipGroup#getRelationships()
   * @see #getRelationshipGroup()
   * @generated
   */
  EReference getRelationshipGroup_Relationships();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see org.smadl.smadl.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.Relationship#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.smadl.smadl.Relationship#getName()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Name();

  /**
   * Returns the meta object for the reference '{@link org.smadl.smadl.Relationship#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.smadl.smadl.Relationship#getTarget()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Target();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.Relationship#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.smadl.smadl.Relationship#getUri()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Uri();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.Relationship#getApiKey <em>Api Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Api Key</em>'.
   * @see org.smadl.smadl.Relationship#getApiKey()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_ApiKey();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.Relationship#getSecret <em>Secret</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secret</em>'.
   * @see org.smadl.smadl.Relationship#getSecret()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Secret();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.Relationship#getUserToken <em>User Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Token</em>'.
   * @see org.smadl.smadl.Relationship#getUserToken()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_UserToken();

  /**
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.Relationship#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see org.smadl.smadl.Relationship#getConstraint()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Constraint();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.RelationshipConstraint <em>Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Constraint</em>'.
   * @see org.smadl.smadl.RelationshipConstraint
   * @generated
   */
  EClass getRelationshipConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.RelationshipConstraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.smadl.smadl.RelationshipConstraint#getType()
   * @see #getRelationshipConstraint()
   * @generated
   */
  EReference getRelationshipConstraint_Type();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.RelationshipConstraintFullAccess <em>Relationship Constraint Full Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Constraint Full Access</em>'.
   * @see org.smadl.smadl.RelationshipConstraintFullAccess
   * @generated
   */
  EClass getRelationshipConstraintFullAccess();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.RelationshipConstraintFullAccess#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.smadl.smadl.RelationshipConstraintFullAccess#getName()
   * @see #getRelationshipConstraintFullAccess()
   * @generated
   */
  EAttribute getRelationshipConstraintFullAccess_Name();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.RelationshipConstraintListOfOps <em>Relationship Constraint List Of Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Constraint List Of Ops</em>'.
   * @see org.smadl.smadl.RelationshipConstraintListOfOps
   * @generated
   */
  EClass getRelationshipConstraintListOfOps();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.RelationshipConstraintListOfOps#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.smadl.smadl.RelationshipConstraintListOfOps#getName()
   * @see #getRelationshipConstraintListOfOps()
   * @generated
   */
  EAttribute getRelationshipConstraintListOfOps_Name();

  /**
   * Returns the meta object for the reference list '{@link org.smadl.smadl.RelationshipConstraintListOfOps#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Operations</em>'.
   * @see org.smadl.smadl.RelationshipConstraintListOfOps#getOperations()
   * @see #getRelationshipConstraintListOfOps()
   * @generated
   */
  EReference getRelationshipConstraintListOfOps_Operations();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.ComputationalUnit <em>Computational Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Computational Unit</em>'.
   * @see org.smadl.smadl.ComputationalUnit
   * @generated
   */
  EClass getComputationalUnit();

  /**
   * Returns the meta object for the containment reference list '{@link org.smadl.smadl.ComputationalUnit#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.smadl.smadl.ComputationalUnit#getParameters()
   * @see #getComputationalUnit()
   * @generated
   */
  EReference getComputationalUnit_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.ComputationalUnit#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.smadl.smadl.ComputationalUnit#getBody()
   * @see #getComputationalUnit()
   * @generated
   */
  EReference getComputationalUnit_Body();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.ProvidedService <em>Provided Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Service</em>'.
   * @see org.smadl.smadl.ProvidedService
   * @generated
   */
  EClass getProvidedService();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.ProvidedService#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.smadl.smadl.ProvidedService#getName()
   * @see #getProvidedService()
   * @generated
   */
  EAttribute getProvidedService_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.ProvidedService#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.smadl.smadl.ProvidedService#getReturnType()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link org.smadl.smadl.ProvidedService#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.smadl.smadl.ProvidedService#getParameters()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.ProvidedService#getOpConstraint <em>Op Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Constraint</em>'.
   * @see org.smadl.smadl.ProvidedService#getOpConstraint()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_OpConstraint();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.OperationConstraint <em>Operation Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Constraint</em>'.
   * @see org.smadl.smadl.OperationConstraint
   * @generated
   */
  EClass getOperationConstraint();

  /**
   * Returns the meta object for the attribute list '{@link org.smadl.smadl.OperationConstraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see org.smadl.smadl.OperationConstraint#getType()
   * @see #getOperationConstraint()
   * @generated
   */
  EAttribute getOperationConstraint_Type();

  /**
   * Returns the meta object for class '{@link org.smadl.smadl.GeneralConstraint <em>General Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Constraint</em>'.
   * @see org.smadl.smadl.GeneralConstraint
   * @generated
   */
  EClass getGeneralConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.smadl.smadl.GeneralConstraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.smadl.smadl.GeneralConstraint#getType()
   * @see #getGeneralConstraint()
   * @generated
   */
  EAttribute getGeneralConstraint_Type();

  /**
   * Returns the meta object for enum '{@link org.smadl.smadl.OperationConstraintType <em>Operation Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operation Constraint Type</em>'.
   * @see org.smadl.smadl.OperationConstraintType
   * @generated
   */
  EEnum getOperationConstraintType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmadlFactory getSmadlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.EntityImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ENTITIES = eINSTANCE.getEntity_Entities();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.SocialMachineImpl <em>Social Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.SocialMachineImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getSocialMachine()
     * @generated
     */
    EClass SOCIAL_MACHINE = eINSTANCE.getSocialMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOCIAL_MACHINE__NAME = eINSTANCE.getSocialMachine_Name();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOCIAL_MACHINE__DEPENDENCIES = eINSTANCE.getSocialMachine_Dependencies();

    /**
     * The meta object literal for the '<em><b>General Constraints</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOCIAL_MACHINE__GENERAL_CONSTRAINTS = eINSTANCE.getSocialMachine_GeneralConstraints();

    /**
     * The meta object literal for the '<em><b>Relationship Group</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOCIAL_MACHINE__RELATIONSHIP_GROUP = eINSTANCE.getSocialMachine_RelationshipGroup();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOCIAL_MACHINE__CONSTRUCTORS = eINSTANCE.getSocialMachine_Constructors();

    /**
     * The meta object literal for the '<em><b>Wrapper Interface</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOCIAL_MACHINE__WRAPPER_INTERFACE = eINSTANCE.getSocialMachine_WrapperInterface();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.RelationshipGroupImpl <em>Relationship Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.RelationshipGroupImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipGroup()
     * @generated
     */
    EClass RELATIONSHIP_GROUP = eINSTANCE.getRelationshipGroup();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP_GROUP__RELATIONSHIPS = eINSTANCE.getRelationshipGroup_Relationships();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.RelationshipImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__URI = eINSTANCE.getRelationship_Uri();

    /**
     * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__API_KEY = eINSTANCE.getRelationship_ApiKey();

    /**
     * The meta object literal for the '<em><b>Secret</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__SECRET = eINSTANCE.getRelationship_Secret();

    /**
     * The meta object literal for the '<em><b>User Token</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__USER_TOKEN = eINSTANCE.getRelationship_UserToken();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__CONSTRAINT = eINSTANCE.getRelationship_Constraint();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.RelationshipConstraintImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipConstraint()
     * @generated
     */
    EClass RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP_CONSTRAINT__TYPE = eINSTANCE.getRelationshipConstraint_Type();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.RelationshipConstraintFullAccessImpl <em>Relationship Constraint Full Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.RelationshipConstraintFullAccessImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipConstraintFullAccess()
     * @generated
     */
    EClass RELATIONSHIP_CONSTRAINT_FULL_ACCESS = eINSTANCE.getRelationshipConstraintFullAccess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP_CONSTRAINT_FULL_ACCESS__NAME = eINSTANCE.getRelationshipConstraintFullAccess_Name();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.RelationshipConstraintListOfOpsImpl <em>Relationship Constraint List Of Ops</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.RelationshipConstraintListOfOpsImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getRelationshipConstraintListOfOps()
     * @generated
     */
    EClass RELATIONSHIP_CONSTRAINT_LIST_OF_OPS = eINSTANCE.getRelationshipConstraintListOfOps();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP_CONSTRAINT_LIST_OF_OPS__NAME = eINSTANCE.getRelationshipConstraintListOfOps_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP_CONSTRAINT_LIST_OF_OPS__OPERATIONS = eINSTANCE.getRelationshipConstraintListOfOps_Operations();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.ComputationalUnitImpl <em>Computational Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.ComputationalUnitImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getComputationalUnit()
     * @generated
     */
    EClass COMPUTATIONAL_UNIT = eINSTANCE.getComputationalUnit();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTATIONAL_UNIT__PARAMETERS = eINSTANCE.getComputationalUnit_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTATIONAL_UNIT__BODY = eINSTANCE.getComputationalUnit_Body();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.ProvidedServiceImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getProvidedService()
     * @generated
     */
    EClass PROVIDED_SERVICE = eINSTANCE.getProvidedService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_SERVICE__NAME = eINSTANCE.getProvidedService_Name();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__RETURN_TYPE = eINSTANCE.getProvidedService_ReturnType();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__PARAMETERS = eINSTANCE.getProvidedService_Parameters();

    /**
     * The meta object literal for the '<em><b>Op Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__OP_CONSTRAINT = eINSTANCE.getProvidedService_OpConstraint();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.OperationConstraintImpl <em>Operation Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.OperationConstraintImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getOperationConstraint()
     * @generated
     */
    EClass OPERATION_CONSTRAINT = eINSTANCE.getOperationConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_CONSTRAINT__TYPE = eINSTANCE.getOperationConstraint_Type();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.impl.GeneralConstraintImpl <em>General Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.impl.GeneralConstraintImpl
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getGeneralConstraint()
     * @generated
     */
    EClass GENERAL_CONSTRAINT = eINSTANCE.getGeneralConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERAL_CONSTRAINT__TYPE = eINSTANCE.getGeneralConstraint_Type();

    /**
     * The meta object literal for the '{@link org.smadl.smadl.OperationConstraintType <em>Operation Constraint Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.OperationConstraintType
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getOperationConstraintType()
     * @generated
     */
    EEnum OPERATION_CONSTRAINT_TYPE = eINSTANCE.getOperationConstraintType();

  }

} //SmadlPackage
