/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Shift#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Shift#getEmployee <em>Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftDate <em>Shift Date</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftStart <em>Shift Start</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftEnd <em>Shift End</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Shift#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getShift()
 * @model
 * @generated
 */
public interface Shift extends EObject {
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
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getShift_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference.
	 * @see #setEmployee(Employee)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getShift_Employee()
	 * @model
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

	/**
	 * Returns the value of the '<em><b>Shift Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Date</em>' attribute.
	 * @see #setShiftDate(Date)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getShift_ShiftDate()
	 * @model
	 * @generated
	 */
	Date getShiftDate();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftDate <em>Shift Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Date</em>' attribute.
	 * @see #getShiftDate()
	 * @generated
	 */
	void setShiftDate(Date value);

	/**
	 * Returns the value of the '<em><b>Shift Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Start</em>' attribute.
	 * @see #setShiftStart(Date)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getShift_ShiftStart()
	 * @model
	 * @generated
	 */
	Date getShiftStart();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftStart <em>Shift Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Start</em>' attribute.
	 * @see #getShiftStart()
	 * @generated
	 */
	void setShiftStart(Date value);

	/**
	 * Returns the value of the '<em><b>Shift End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift End</em>' attribute.
	 * @see #setShiftEnd(Date)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getShift_ShiftEnd()
	 * @model
	 * @generated
	 */
	Date getShiftEnd();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftEnd <em>Shift End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift End</em>' attribute.
	 * @see #getShiftEnd()
	 * @generated
	 */
	void setShiftEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getShift_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // Shift
