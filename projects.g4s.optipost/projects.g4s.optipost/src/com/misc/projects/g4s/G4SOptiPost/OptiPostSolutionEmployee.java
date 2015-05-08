/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opti Post Solution Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee#getShifts <em>Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee#getEmployee <em>Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee#getNrShifts <em>Nr Shifts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionEmployee()
 * @model
 * @generated
 */
public interface OptiPostSolutionEmployee extends EObject {
	/**
	 * Returns the value of the '<em><b>Shifts</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shifts</em>' reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionEmployee_Shifts()
	 * @model
	 * @generated
	 */
	EList<OptiPostSolutionShift> getShifts();

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
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionEmployee_Employee()
	 * @model
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

	/**
	 * Returns the value of the '<em><b>Nr Shifts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Shifts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Shifts</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolutionEmployee_NrShifts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNrShifts();

} // OptiPostSolutionEmployee
