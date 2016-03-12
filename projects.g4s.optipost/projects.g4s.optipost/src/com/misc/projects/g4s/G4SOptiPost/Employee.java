/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Employee#getEmployeeID <em>Employee ID</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Employee#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Employee ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee ID</em>' attribute.
	 * @see #setEmployeeID(String)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getEmployee_EmployeeID()
	 * @model
	 * @generated
	 */
	String getEmployeeID();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Employee#getEmployeeID <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee ID</em>' attribute.
	 * @see #getEmployeeID()
	 * @generated
	 */
	void setEmployeeID(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getEmployee_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Employee#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

} // Employee
