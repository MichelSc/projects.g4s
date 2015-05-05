/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Location#getLocationID <em>Location ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location ID</em>' attribute.
	 * @see #setLocationID(String)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLocation_LocationID()
	 * @model
	 * @generated
	 */
	String getLocationID();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Location#getLocationID <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location ID</em>' attribute.
	 * @see #getLocationID()
	 * @generated
	 */
	void setLocationID(String value);

} // Location
