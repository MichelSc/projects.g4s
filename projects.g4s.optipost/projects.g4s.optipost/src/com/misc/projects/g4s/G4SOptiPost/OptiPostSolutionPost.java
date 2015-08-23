/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opti Post Solution Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost#getShifts <em>Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost#getNrShifts <em>Nr Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionPost()
 * @model
 * @generated
 */
public interface OptiPostSolutionPost extends EObject {
	/**
	 * Returns the value of the '<em><b>Shifts</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shifts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shifts</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionPost_Shifts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptiPostSolutionShift> getShifts();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionPost_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Nr Shifts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Shifts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Shifts</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionPost_NrShifts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNrShifts();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionPost_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptiPostSolutionShift addShift(Shift shift);

} // OptiPostSolutionPost
