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
   * The feature id for the '<em><b>Depends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__DEPENDS = 1;

  /**
   * The feature id for the '<em><b>General Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__GENERAL_CONSTRAINTS = 2;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__CONSTRUCTORS = 3;

  /**
   * The feature id for the '<em><b>Wrapper Interface</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE__WRAPPER_INTERFACE = 4;

  /**
   * The number of structural features of the '<em>Social Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_MACHINE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.ComputationalUnitImpl <em>Computational Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.ComputationalUnitImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getComputationalUnit()
   * @generated
   */
  int COMPUTATIONAL_UNIT = 2;

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
  int PROVIDED_SERVICE = 3;

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
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__BODY = 3;

  /**
   * The feature id for the '<em><b>Op Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__OP_CONSTRAINTS = 4;

  /**
   * The number of structural features of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.smadl.smadl.impl.OperationConstraintImpl <em>Operation Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.impl.OperationConstraintImpl
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getOperationConstraint()
   * @generated
   */
  int OPERATION_CONSTRAINT = 4;

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
  int GENERAL_CONSTRAINT = 5;

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
   * The meta object id for the '{@link org.smadl.smadl.ConstraintType <em>Constraint Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.smadl.smadl.ConstraintType
   * @see org.smadl.smadl.impl.SmadlPackageImpl#getConstraintType()
   * @generated
   */
  int CONSTRAINT_TYPE = 6;


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
   * Returns the meta object for the reference list '{@link org.smadl.smadl.SocialMachine#getDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Depends</em>'.
   * @see org.smadl.smadl.SocialMachine#getDepends()
   * @see #getSocialMachine()
   * @generated
   */
  EReference getSocialMachine_Depends();

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
   * Returns the meta object for the containment reference '{@link org.smadl.smadl.ProvidedService#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.smadl.smadl.ProvidedService#getBody()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_Body();

  /**
   * Returns the meta object for the containment reference list '{@link org.smadl.smadl.ProvidedService#getOpConstraints <em>Op Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op Constraints</em>'.
   * @see org.smadl.smadl.ProvidedService#getOpConstraints()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_OpConstraints();

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
   * Returns the meta object for enum '{@link org.smadl.smadl.ConstraintType <em>Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Type</em>'.
   * @see org.smadl.smadl.ConstraintType
   * @generated
   */
  EEnum getConstraintType();

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
     * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOCIAL_MACHINE__DEPENDS = eINSTANCE.getSocialMachine_Depends();

    /**
     * The meta object literal for the '<em><b>General Constraints</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOCIAL_MACHINE__GENERAL_CONSTRAINTS = eINSTANCE.getSocialMachine_GeneralConstraints();

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
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__BODY = eINSTANCE.getProvidedService_Body();

    /**
     * The meta object literal for the '<em><b>Op Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__OP_CONSTRAINTS = eINSTANCE.getProvidedService_OpConstraints();

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
     * The meta object literal for the '{@link org.smadl.smadl.ConstraintType <em>Constraint Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.smadl.smadl.ConstraintType
     * @see org.smadl.smadl.impl.SmadlPackageImpl#getConstraintType()
     * @generated
     */
    EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

  }

} //SmadlPackage
