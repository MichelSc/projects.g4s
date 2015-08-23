/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opti Post Solution Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift#getShift <em>Shift</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionShift()
 * @model
 * @generated
 */
public interface OptiPostSolutionShift extends EObject {
	/**
	 * Returns the value of the '<em><b>Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' reference.
	 * @see #setShift(Shift)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionShift_Shift()
	 * @model
	 * @generated
	 */
	Shift getShift();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift#getShift <em>Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' reference.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(Shift value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionShift_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // OptiPostSolutionShift
