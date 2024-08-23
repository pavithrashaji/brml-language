/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.bRML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.brml.bRML.BRMLPackage;
import org.xtext.example.brml.bRML.PrintStop;
import org.xtext.example.brml.bRML.Stop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.brml.bRML.impl.PrintStopImpl#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrintStopImpl extends OperationImpl implements PrintStop
{
  /**
   * The cached value of the '{@link #getStop() <em>Stop</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStop()
   * @generated
   * @ordered
   */
  protected Stop stop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrintStopImpl()
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
    return BRMLPackage.Literals.PRINT_STOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stop getStop()
  {
    if (stop != null && stop.eIsProxy())
    {
      InternalEObject oldStop = (InternalEObject)stop;
      stop = (Stop)eResolveProxy(oldStop);
      if (stop != oldStop)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BRMLPackage.PRINT_STOP__STOP, oldStop, stop));
      }
    }
    return stop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stop basicGetStop()
  {
    return stop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStop(Stop newStop)
  {
    Stop oldStop = stop;
    stop = newStop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BRMLPackage.PRINT_STOP__STOP, oldStop, stop));
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
      case BRMLPackage.PRINT_STOP__STOP:
        if (resolve) return getStop();
        return basicGetStop();
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
      case BRMLPackage.PRINT_STOP__STOP:
        setStop((Stop)newValue);
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
      case BRMLPackage.PRINT_STOP__STOP:
        setStop((Stop)null);
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
      case BRMLPackage.PRINT_STOP__STOP:
        return stop != null;
    }
    return super.eIsSet(featureID);
  }

} //PrintStopImpl
