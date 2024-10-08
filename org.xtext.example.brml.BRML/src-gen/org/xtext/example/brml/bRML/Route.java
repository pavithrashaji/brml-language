/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.bRML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.brml.bRML.Route#getRoute <em>Route</em>}</li>
 *   <li>{@link org.xtext.example.brml.bRML.Route#getRouteStops <em>Route Stops</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.brml.bRML.BRMLPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends Operation
{
  /**
   * Returns the value of the '<em><b>Route</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Route</em>' attribute.
   * @see #setRoute(int)
   * @see org.xtext.example.brml.bRML.BRMLPackage#getRoute_Route()
   * @model
   * @generated
   */
  int getRoute();

  /**
   * Sets the value of the '{@link org.xtext.example.brml.bRML.Route#getRoute <em>Route</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Route</em>' attribute.
   * @see #getRoute()
   * @generated
   */
  void setRoute(int value);

  /**
   * Returns the value of the '<em><b>Route Stops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.brml.bRML.RouteStop}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Route Stops</em>' containment reference list.
   * @see org.xtext.example.brml.bRML.BRMLPackage#getRoute_RouteStops()
   * @model containment="true"
   * @generated
   */
  EList<RouteStop> getRouteStops();

} // Route
