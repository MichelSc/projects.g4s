/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.GeneratorTuple;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getPrecedences <em>Precedences</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getJobs <em>Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpOptiPostFlow <em>Lp Opti Post Flow</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpEmployee <em>Lp Employee</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot()
 * @model
 * @generated
 */
public interface LpRoot extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Precedences</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getLpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedences</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot_Precedences()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getLpRoot
	 * @model opposite="LpRoot" containment="true"
	 * @generated
	 */
	EList<LpPrecedence> getPrecedences();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpJob}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot_Jobs()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getLpRoot
	 * @model opposite="LpRoot" containment="true"
	 * @generated
	 */
	EList<LpJob> getJobs();

	/**
	 * Returns the value of the '<em><b>Lp Opti Post Flow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Opti Post Flow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Opti Post Flow</em>' container reference.
	 * @see #setLpOptiPostFlow(LpOptiPostFlow)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot_LpOptiPostFlow()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot
	 * @model opposite="LpRoot" transient="false"
	 * @generated
	 */
	LpOptiPostFlow getLpOptiPostFlow();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpOptiPostFlow <em>Lp Opti Post Flow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Opti Post Flow</em>' container reference.
	 * @see #getLpOptiPostFlow()
	 * @generated
	 */
	void setLpOptiPostFlow(LpOptiPostFlow value);

	/**
	 * Returns the value of the '<em><b>Lp Employee</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpEmployee}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Employee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Employee</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot_LpEmployee()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpRoot
	 * @model opposite="LpRoot" containment="true"
	 * @generated
	 */
	EList<LpEmployee> getLpEmployee();

} // LpRoot
