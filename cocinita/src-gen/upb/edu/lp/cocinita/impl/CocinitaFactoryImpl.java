/**
 * generated by Xtext 2.35.0
 */
package upb.edu.lp.cocinita.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import upb.edu.lp.cocinita.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CocinitaFactoryImpl extends EFactoryImpl implements CocinitaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CocinitaFactory init()
  {
    try
    {
      CocinitaFactory theCocinitaFactory = (CocinitaFactory)EPackage.Registry.INSTANCE.getEFactory(CocinitaPackage.eNS_URI);
      if (theCocinitaFactory != null)
      {
        return theCocinitaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CocinitaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CocinitaFactoryImpl()
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
      case CocinitaPackage.COCINA: return createCocina();
      case CocinitaPackage.INGREDIENTE: return createIngrediente();
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
  public Cocina createCocina()
  {
    CocinaImpl cocina = new CocinaImpl();
    return cocina;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ingrediente createIngrediente()
  {
    IngredienteImpl ingrediente = new IngredienteImpl();
    return ingrediente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CocinitaPackage getCocinitaPackage()
  {
    return (CocinitaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CocinitaPackage getPackage()
  {
    return CocinitaPackage.eINSTANCE;
  }

} //CocinitaFactoryImpl
