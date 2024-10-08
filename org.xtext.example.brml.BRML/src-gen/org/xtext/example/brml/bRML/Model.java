/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.bRML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.brml.bRML.Model#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.brml.bRML.BRMLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.brml.bRML.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.example.brml.bRML.BRMLPackage#getModel_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // Model
