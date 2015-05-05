/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getLpOptiPostFlows <em>Lp Opti Post Flows</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getSelectedShifts <em>Selected Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Lp Opti Post Flows</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Opti Post Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Opti Post Flows</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_LpOptiPostFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<LpOptiPostFlow> getLpOptiPostFlows();

	/**
	 * Returns the value of the '<em><b>Selected Shifts</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.Shift}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Shifts</em>' reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_SelectedShifts()
	 * @model
	 * @generated
	 */
	EList<Shift> getSelectedShifts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Scenario
