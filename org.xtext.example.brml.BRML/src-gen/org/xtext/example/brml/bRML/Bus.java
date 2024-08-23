/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.bRML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.brml.bRML.Bus#getBus <em>Bus</em>}</li>
 *   <li>{@link org.xtext.example.brml.bRML.Bus#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.xtext.example.brml.bRML.Bus#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.brml.bRML.BRMLPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends Operation
{
  /**
   * Returns the value of the '<em><b>Bus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bus</em>' attribute.
   * @see #setBus(String)
   * @see org.xtext.example.brml.bRML.BRMLPackage#getBus_Bus()
   * @model
   * @generated
   */
  String getBus();

  /**
   * Sets the value of the '{@link org.xtext.example.brml.bRML.Bus#getBus <em>Bus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bus</em>' attribute.
   * @see #getBus()
   * @generated
   */
  void setBus(String value);

  /**
   * Returns the value of the '<em><b>Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver</em>' attribute.
   * @see #setDriver(String)
   * @see org.xtext.example.brml.bRML.BRMLPackage#getBus_Driver()
   * @model
   * @generated
   */
  String getDriver();

  /**
   * Sets the value of the '{@link org.xtext.example.brml.bRML.Bus#getDriver <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver</em>' attribute.
   * @see #getDriver()
   * @generated
   */
  void setDriver(String value);

  /**
   * Returns the value of the '<em><b>Route</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Route</em>' reference.
   * @see #setRoute(Route)
   * @see org.xtext.example.brml.bRML.BRMLPackage#getBus_Route()
   * @model
   * @generated
   */
  Route getRoute();

  /**
   * Sets the value of the '{@link org.xtext.example.brml.bRML.Bus#getRoute <em>Route</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Route</em>' reference.
   * @see #getRoute()
   * @generated
   */
  void setRoute(Route value);

} // Bus
