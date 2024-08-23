/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.bRML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.xtext.example.brml.bRML.BRMLFactory
 * @model kind="package"
 * @generated
 */
public interface BRMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bRML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/brml/BRML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bRML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BRMLPackage eINSTANCE = org.xtext.example.brml.bRML.impl.BRMLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.ModelImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OPERATIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.OperationImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.StopImpl <em>Stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.StopImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getStop()
   * @generated
   */
  int STOP = 2;

  /**
   * The feature id for the '<em><b>Stop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP__STOP = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP__LOCATION = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.DelStopImpl <em>Del Stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.DelStopImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDelStop()
   * @generated
   */
  int DEL_STOP = 3;

  /**
   * The feature id for the '<em><b>Stop</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEL_STOP__STOP = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Del Stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEL_STOP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.RouteImpl <em>Route</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.RouteImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getRoute()
   * @generated
   */
  int ROUTE = 4;

  /**
   * The feature id for the '<em><b>Route</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__ROUTE = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Route Stops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__ROUTE_STOPS = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Route</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.RouteStopImpl <em>Route Stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.RouteStopImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getRouteStop()
   * @generated
   */
  int ROUTE_STOP = 5;

  /**
   * The feature id for the '<em><b>Routestop</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_STOP__ROUTESTOP = 0;

  /**
   * The number of structural features of the '<em>Route Stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_STOP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.BusImpl <em>Bus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.BusImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getBus()
   * @generated
   */
  int BUS = 6;

  /**
   * The feature id for the '<em><b>Bus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUS__BUS = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUS__DRIVER = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Route</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUS__ROUTE = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUS_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.DelRouteImpl <em>Del Route</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.DelRouteImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDelRoute()
   * @generated
   */
  int DEL_ROUTE = 7;

  /**
   * The feature id for the '<em><b>Route</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEL_ROUTE__ROUTE = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Del Route</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEL_ROUTE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.DelBusImpl <em>Del Bus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.DelBusImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDelBus()
   * @generated
   */
  int DEL_BUS = 8;

  /**
   * The feature id for the '<em><b>Bus</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEL_BUS__BUS = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Del Bus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEL_BUS_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.LocationImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 9;

  /**
   * The feature id for the '<em><b>Latitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__LATITUDE = 0;

  /**
   * The feature id for the '<em><b>Longitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__LONGITUDE = 1;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.AddRouteStopImpl <em>Add Route Stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.AddRouteStopImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getAddRouteStop()
   * @generated
   */
  int ADD_ROUTE_STOP = 10;

  /**
   * The feature id for the '<em><b>Route Stop</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ROUTE_STOP__ROUTE_STOP = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Route</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ROUTE_STOP__ROUTE = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Add Route Stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ROUTE_STOP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.DeleteRouteStopImpl <em>Delete Route Stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.DeleteRouteStopImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDeleteRouteStop()
   * @generated
   */
  int DELETE_ROUTE_STOP = 11;

  /**
   * The feature id for the '<em><b>Route Stop</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ROUTE_STOP__ROUTE_STOP = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Route</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ROUTE_STOP__ROUTE = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Delete Route Stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ROUTE_STOP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.PrintRouteImpl <em>Print Route</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.PrintRouteImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getPrintRoute()
   * @generated
   */
  int PRINT_ROUTE = 12;

  /**
   * The feature id for the '<em><b>Route</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ROUTE__ROUTE = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print Route</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ROUTE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.PrintBusImpl <em>Print Bus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.PrintBusImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getPrintBus()
   * @generated
   */
  int PRINT_BUS = 13;

  /**
   * The feature id for the '<em><b>Bus</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_BUS__BUS = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print Bus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_BUS_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.brml.bRML.impl.PrintStopImpl <em>Print Stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.brml.bRML.impl.PrintStopImpl
   * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getPrintStop()
   * @generated
   */
  int PRINT_STOP = 14;

  /**
   * The feature id for the '<em><b>Stop</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_STOP__STOP = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print Stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_STOP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.brml.bRML.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.brml.bRML.Model#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.xtext.example.brml.bRML.Model#getOperations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Operations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.xtext.example.brml.bRML.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.Stop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stop</em>'.
   * @see org.xtext.example.brml.bRML.Stop
   * @generated
   */
  EClass getStop();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.brml.bRML.Stop#getStop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stop</em>'.
   * @see org.xtext.example.brml.bRML.Stop#getStop()
   * @see #getStop()
   * @generated
   */
  EAttribute getStop_Stop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.brml.bRML.Stop#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see org.xtext.example.brml.bRML.Stop#getLocation()
   * @see #getStop()
   * @generated
   */
  EReference getStop_Location();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.DelStop <em>Del Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Del Stop</em>'.
   * @see org.xtext.example.brml.bRML.DelStop
   * @generated
   */
  EClass getDelStop();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.DelStop#getStop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stop</em>'.
   * @see org.xtext.example.brml.bRML.DelStop#getStop()
   * @see #getDelStop()
   * @generated
   */
  EReference getDelStop_Stop();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.Route <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Route</em>'.
   * @see org.xtext.example.brml.bRML.Route
   * @generated
   */
  EClass getRoute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.brml.bRML.Route#getRoute <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Route</em>'.
   * @see org.xtext.example.brml.bRML.Route#getRoute()
   * @see #getRoute()
   * @generated
   */
  EAttribute getRoute_Route();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.brml.bRML.Route#getRouteStops <em>Route Stops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Route Stops</em>'.
   * @see org.xtext.example.brml.bRML.Route#getRouteStops()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_RouteStops();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.RouteStop <em>Route Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Route Stop</em>'.
   * @see org.xtext.example.brml.bRML.RouteStop
   * @generated
   */
  EClass getRouteStop();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.RouteStop#getRoutestop <em>Routestop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Routestop</em>'.
   * @see org.xtext.example.brml.bRML.RouteStop#getRoutestop()
   * @see #getRouteStop()
   * @generated
   */
  EReference getRouteStop_Routestop();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.Bus <em>Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bus</em>'.
   * @see org.xtext.example.brml.bRML.Bus
   * @generated
   */
  EClass getBus();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.brml.bRML.Bus#getBus <em>Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bus</em>'.
   * @see org.xtext.example.brml.bRML.Bus#getBus()
   * @see #getBus()
   * @generated
   */
  EAttribute getBus_Bus();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.brml.bRML.Bus#getDriver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Driver</em>'.
   * @see org.xtext.example.brml.bRML.Bus#getDriver()
   * @see #getBus()
   * @generated
   */
  EAttribute getBus_Driver();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.Bus#getRoute <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Route</em>'.
   * @see org.xtext.example.brml.bRML.Bus#getRoute()
   * @see #getBus()
   * @generated
   */
  EReference getBus_Route();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.DelRoute <em>Del Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Del Route</em>'.
   * @see org.xtext.example.brml.bRML.DelRoute
   * @generated
   */
  EClass getDelRoute();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.DelRoute#getRoute <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Route</em>'.
   * @see org.xtext.example.brml.bRML.DelRoute#getRoute()
   * @see #getDelRoute()
   * @generated
   */
  EReference getDelRoute_Route();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.DelBus <em>Del Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Del Bus</em>'.
   * @see org.xtext.example.brml.bRML.DelBus
   * @generated
   */
  EClass getDelBus();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.DelBus#getBus <em>Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bus</em>'.
   * @see org.xtext.example.brml.bRML.DelBus#getBus()
   * @see #getDelBus()
   * @generated
   */
  EReference getDelBus_Bus();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see org.xtext.example.brml.bRML.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.brml.bRML.Location#getLatitude <em>Latitude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latitude</em>'.
   * @see org.xtext.example.brml.bRML.Location#getLatitude()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Latitude();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.brml.bRML.Location#getLongitude <em>Longitude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longitude</em>'.
   * @see org.xtext.example.brml.bRML.Location#getLongitude()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Longitude();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.AddRouteStop <em>Add Route Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Route Stop</em>'.
   * @see org.xtext.example.brml.bRML.AddRouteStop
   * @generated
   */
  EClass getAddRouteStop();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.AddRouteStop#getRouteStop <em>Route Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Route Stop</em>'.
   * @see org.xtext.example.brml.bRML.AddRouteStop#getRouteStop()
   * @see #getAddRouteStop()
   * @generated
   */
  EReference getAddRouteStop_RouteStop();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.AddRouteStop#getRoute <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Route</em>'.
   * @see org.xtext.example.brml.bRML.AddRouteStop#getRoute()
   * @see #getAddRouteStop()
   * @generated
   */
  EReference getAddRouteStop_Route();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.DeleteRouteStop <em>Delete Route Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Route Stop</em>'.
   * @see org.xtext.example.brml.bRML.DeleteRouteStop
   * @generated
   */
  EClass getDeleteRouteStop();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.DeleteRouteStop#getRouteStop <em>Route Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Route Stop</em>'.
   * @see org.xtext.example.brml.bRML.DeleteRouteStop#getRouteStop()
   * @see #getDeleteRouteStop()
   * @generated
   */
  EReference getDeleteRouteStop_RouteStop();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.DeleteRouteStop#getRoute <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Route</em>'.
   * @see org.xtext.example.brml.bRML.DeleteRouteStop#getRoute()
   * @see #getDeleteRouteStop()
   * @generated
   */
  EReference getDeleteRouteStop_Route();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.PrintRoute <em>Print Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Route</em>'.
   * @see org.xtext.example.brml.bRML.PrintRoute
   * @generated
   */
  EClass getPrintRoute();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.PrintRoute#getRoute <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Route</em>'.
   * @see org.xtext.example.brml.bRML.PrintRoute#getRoute()
   * @see #getPrintRoute()
   * @generated
   */
  EReference getPrintRoute_Route();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.PrintBus <em>Print Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Bus</em>'.
   * @see org.xtext.example.brml.bRML.PrintBus
   * @generated
   */
  EClass getPrintBus();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.PrintBus#getBus <em>Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bus</em>'.
   * @see org.xtext.example.brml.bRML.PrintBus#getBus()
   * @see #getPrintBus()
   * @generated
   */
  EReference getPrintBus_Bus();

  /**
   * Returns the meta object for class '{@link org.xtext.example.brml.bRML.PrintStop <em>Print Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Stop</em>'.
   * @see org.xtext.example.brml.bRML.PrintStop
   * @generated
   */
  EClass getPrintStop();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.brml.bRML.PrintStop#getStop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stop</em>'.
   * @see org.xtext.example.brml.bRML.PrintStop#getStop()
   * @see #getPrintStop()
   * @generated
   */
  EReference getPrintStop_Stop();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BRMLFactory getBRMLFactory();

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
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.ModelImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OPERATIONS = eINSTANCE.getModel_Operations();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.OperationImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.StopImpl <em>Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.StopImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getStop()
     * @generated
     */
    EClass STOP = eINSTANCE.getStop();

    /**
     * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STOP__STOP = eINSTANCE.getStop_Stop();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STOP__LOCATION = eINSTANCE.getStop_Location();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.DelStopImpl <em>Del Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.DelStopImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDelStop()
     * @generated
     */
    EClass DEL_STOP = eINSTANCE.getDelStop();

    /**
     * The meta object literal for the '<em><b>Stop</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEL_STOP__STOP = eINSTANCE.getDelStop_Stop();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.RouteImpl <em>Route</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.RouteImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getRoute()
     * @generated
     */
    EClass ROUTE = eINSTANCE.getRoute();

    /**
     * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUTE__ROUTE = eINSTANCE.getRoute_Route();

    /**
     * The meta object literal for the '<em><b>Route Stops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__ROUTE_STOPS = eINSTANCE.getRoute_RouteStops();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.RouteStopImpl <em>Route Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.RouteStopImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getRouteStop()
     * @generated
     */
    EClass ROUTE_STOP = eINSTANCE.getRouteStop();

    /**
     * The meta object literal for the '<em><b>Routestop</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE_STOP__ROUTESTOP = eINSTANCE.getRouteStop_Routestop();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.BusImpl <em>Bus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.BusImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getBus()
     * @generated
     */
    EClass BUS = eINSTANCE.getBus();

    /**
     * The meta object literal for the '<em><b>Bus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUS__BUS = eINSTANCE.getBus_Bus();

    /**
     * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUS__DRIVER = eINSTANCE.getBus_Driver();

    /**
     * The meta object literal for the '<em><b>Route</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUS__ROUTE = eINSTANCE.getBus_Route();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.DelRouteImpl <em>Del Route</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.DelRouteImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDelRoute()
     * @generated
     */
    EClass DEL_ROUTE = eINSTANCE.getDelRoute();

    /**
     * The meta object literal for the '<em><b>Route</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEL_ROUTE__ROUTE = eINSTANCE.getDelRoute_Route();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.DelBusImpl <em>Del Bus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.DelBusImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDelBus()
     * @generated
     */
    EClass DEL_BUS = eINSTANCE.getDelBus();

    /**
     * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEL_BUS__BUS = eINSTANCE.getDelBus_Bus();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.LocationImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

    /**
     * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.AddRouteStopImpl <em>Add Route Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.AddRouteStopImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getAddRouteStop()
     * @generated
     */
    EClass ADD_ROUTE_STOP = eINSTANCE.getAddRouteStop();

    /**
     * The meta object literal for the '<em><b>Route Stop</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_ROUTE_STOP__ROUTE_STOP = eINSTANCE.getAddRouteStop_RouteStop();

    /**
     * The meta object literal for the '<em><b>Route</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_ROUTE_STOP__ROUTE = eINSTANCE.getAddRouteStop_Route();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.DeleteRouteStopImpl <em>Delete Route Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.DeleteRouteStopImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getDeleteRouteStop()
     * @generated
     */
    EClass DELETE_ROUTE_STOP = eINSTANCE.getDeleteRouteStop();

    /**
     * The meta object literal for the '<em><b>Route Stop</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_ROUTE_STOP__ROUTE_STOP = eINSTANCE.getDeleteRouteStop_RouteStop();

    /**
     * The meta object literal for the '<em><b>Route</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_ROUTE_STOP__ROUTE = eINSTANCE.getDeleteRouteStop_Route();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.PrintRouteImpl <em>Print Route</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.PrintRouteImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getPrintRoute()
     * @generated
     */
    EClass PRINT_ROUTE = eINSTANCE.getPrintRoute();

    /**
     * The meta object literal for the '<em><b>Route</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_ROUTE__ROUTE = eINSTANCE.getPrintRoute_Route();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.PrintBusImpl <em>Print Bus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.PrintBusImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getPrintBus()
     * @generated
     */
    EClass PRINT_BUS = eINSTANCE.getPrintBus();

    /**
     * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_BUS__BUS = eINSTANCE.getPrintBus_Bus();

    /**
     * The meta object literal for the '{@link org.xtext.example.brml.bRML.impl.PrintStopImpl <em>Print Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.brml.bRML.impl.PrintStopImpl
     * @see org.xtext.example.brml.bRML.impl.BRMLPackageImpl#getPrintStop()
     * @generated
     */
    EClass PRINT_STOP = eINSTANCE.getPrintStop();

    /**
     * The meta object literal for the '<em><b>Stop</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_STOP__STOP = eINSTANCE.getPrintStop_Stop();

  }

} //BRMLPackage
