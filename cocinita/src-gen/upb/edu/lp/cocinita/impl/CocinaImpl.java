/**
 * generated by Xtext 2.35.0
 */
package upb.edu.lp.cocinita.impl;

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

import upb.edu.lp.cocinita.Cocina;
import upb.edu.lp.cocinita.CocinitaPackage;
import upb.edu.lp.cocinita.ListaIngredientes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cocina</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upb.edu.lp.cocinita.impl.CocinaImpl#getName <em>Name</em>}</li>
 *   <li>{@link upb.edu.lp.cocinita.impl.CocinaImpl#getIngrediente <em>Ingrediente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CocinaImpl extends MinimalEObjectImpl.Container implements Cocina
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
   * The cached value of the '{@link #getIngrediente() <em>Ingrediente</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngrediente()
   * @generated
   * @ordered
   */
  protected EList<ListaIngredientes> ingrediente;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CocinaImpl()
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
    return CocinitaPackage.Literals.COCINA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CocinitaPackage.COCINA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ListaIngredientes> getIngrediente()
  {
    if (ingrediente == null)
    {
      ingrediente = new EObjectContainmentEList<ListaIngredientes>(ListaIngredientes.class, this, CocinitaPackage.COCINA__INGREDIENTE);
    }
    return ingrediente;
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
      case CocinitaPackage.COCINA__INGREDIENTE:
        return ((InternalEList<?>)getIngrediente()).basicRemove(otherEnd, msgs);
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
      case CocinitaPackage.COCINA__NAME:
        return getName();
      case CocinitaPackage.COCINA__INGREDIENTE:
        return getIngrediente();
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
      case CocinitaPackage.COCINA__NAME:
        setName((String)newValue);
        return;
      case CocinitaPackage.COCINA__INGREDIENTE:
        getIngrediente().clear();
        getIngrediente().addAll((Collection<? extends ListaIngredientes>)newValue);
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
      case CocinitaPackage.COCINA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CocinitaPackage.COCINA__INGREDIENTE:
        getIngrediente().clear();
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
      case CocinitaPackage.COCINA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CocinitaPackage.COCINA__INGREDIENTE:
        return ingrediente != null && !ingrediente.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CocinaImpl
