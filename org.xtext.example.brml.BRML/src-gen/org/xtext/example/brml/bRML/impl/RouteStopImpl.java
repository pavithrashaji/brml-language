/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.bRML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.brml.bRML.BRMLPackage;
import org.xtext.example.brml.bRML.RouteStop;
import org.xtext.example.brml.bRML.Stop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.brml.bRML.impl.RouteStopImpl#getRoutestop <em>Routestop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteStopImpl extends MinimalEObjectImpl.Container implements RouteStop
{
  /**
   * The cached value of the '{@link #getRoutestop() <em>Routestop</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoutestop()
   * @generated
   * @ordered
   */
  protected Stop routestop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RouteStopImpl()
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
    return BRMLPackage.Literals.ROUTE_STOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stop getRoutestop()
  {
    if (routestop != null && routestop.eIsProxy())
    {
      InternalEObject oldRoutestop = (InternalEObject)routestop;
      routestop = (Stop)eResolveProxy(oldRoutestop);
      if (routestop != oldRoutestop)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BRMLPackage.ROUTE_STOP__ROUTESTOP, oldRoutestop, routestop));
      }
    }
    return routestop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stop basicGetRoutestop()
  {
    return routestop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoutestop(Stop newRoutestop)
  {
    Stop oldRoutestop = routestop;
    routestop = newRoutestop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BRMLPackage.ROUTE_STOP__ROUTESTOP, oldRoutestop, routestop));
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
      case BRMLPackage.ROUTE_STOP__ROUTESTOP:
        if (resolve) return getRoutestop();
        return basicGetRoutestop();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BRMLPackage.ROUTE_STOP__ROUTESTOP:
        setRoutestop((Stop)newValue);
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
      case BRMLPackage.ROUTE_STOP__ROUTESTOP:
        setRoutestop((Stop)null);
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
      case BRMLPackage.ROUTE_STOP__ROUTESTOP:
        return routestop != null;
    }
    return super.eIsSet(featureID);
  }

} //RouteStopImpl
