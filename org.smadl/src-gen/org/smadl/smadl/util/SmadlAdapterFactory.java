/**
 */
package org.smadl.smadl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.smadl.smadl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.smadl.smadl.SmadlPackage
 * @generated
 */
public class SmadlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmadlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmadlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SmadlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmadlSwitch<Adapter> modelSwitch =
    new SmadlSwitch<Adapter>()
    {
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseSocialMachine(SocialMachine object)
      {
        return createSocialMachineAdapter();
      }
      @Override
      public Adapter caseRelationshipGroup(RelationshipGroup object)
      {
        return createRelationshipGroupAdapter();
      }
      @Override
      public Adapter caseOAuthRelationship(OAuthRelationship object)
      {
        return createOAuthRelationshipAdapter();
      }
      @Override
      public Adapter caseGeneralRelationship(GeneralRelationship object)
      {
        return createGeneralRelationshipAdapter();
      }
      @Override
      public Adapter caseGeneralConfigParameter(GeneralConfigParameter object)
      {
        return createGeneralConfigParameterAdapter();
      }
      @Override
      public Adapter caseRelationshipConstraint(RelationshipConstraint object)
      {
        return createRelationshipConstraintAdapter();
      }
      @Override
      public Adapter caseRelationshipConstraintFullAccess(RelationshipConstraintFullAccess object)
      {
        return createRelationshipConstraintFullAccessAdapter();
      }
      @Override
      public Adapter caseRelationshipConstraintListOfOps(RelationshipConstraintListOfOps object)
      {
        return createRelationshipConstraintListOfOpsAdapter();
      }
      @Override
      public Adapter caseComputationalUnit(ComputationalUnit object)
      {
        return createComputationalUnitAdapter();
      }
      @Override
      public Adapter caseProvidedService(ProvidedService object)
      {
        return createProvidedServiceAdapter();
      }
      @Override
      public Adapter caseOperationConstraint(OperationConstraint object)
      {
        return createOperationConstraintAdapter();
      }
      @Override
      public Adapter caseGeneralConstraint(GeneralConstraint object)
      {
        return createGeneralConstraintAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.SocialMachine <em>Social Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.SocialMachine
   * @generated
   */
  public Adapter createSocialMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.RelationshipGroup <em>Relationship Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.RelationshipGroup
   * @generated
   */
  public Adapter createRelationshipGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.OAuthRelationship <em>OAuth Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.OAuthRelationship
   * @generated
   */
  public Adapter createOAuthRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.GeneralRelationship <em>General Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.GeneralRelationship
   * @generated
   */
  public Adapter createGeneralRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.GeneralConfigParameter <em>General Config Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.GeneralConfigParameter
   * @generated
   */
  public Adapter createGeneralConfigParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.RelationshipConstraint <em>Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.RelationshipConstraint
   * @generated
   */
  public Adapter createRelationshipConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.RelationshipConstraintFullAccess <em>Relationship Constraint Full Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.RelationshipConstraintFullAccess
   * @generated
   */
  public Adapter createRelationshipConstraintFullAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.RelationshipConstraintListOfOps <em>Relationship Constraint List Of Ops</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.RelationshipConstraintListOfOps
   * @generated
   */
  public Adapter createRelationshipConstraintListOfOpsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.ComputationalUnit <em>Computational Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.ComputationalUnit
   * @generated
   */
  public Adapter createComputationalUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.ProvidedService <em>Provided Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.ProvidedService
   * @generated
   */
  public Adapter createProvidedServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.OperationConstraint <em>Operation Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.OperationConstraint
   * @generated
   */
  public Adapter createOperationConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.smadl.smadl.GeneralConstraint <em>General Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.smadl.smadl.GeneralConstraint
   * @generated
   */
  public Adapter createGeneralConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SmadlAdapterFactory
