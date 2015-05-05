/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.GeneratorTuple;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getShift <em>Shift</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsAfter <em>Jobs After</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsBefore <em>Jobs Before</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#isStartOfMonth <em>Start Of Month</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#isEndOfMonth <em>End Of Month</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob()
 * @model
 * @generated
 */
public interface LpJob extends GeneratorTuple {
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
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_Shift()
	 * @model
	 * @generated
	 */
	Shift getShift();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getShift <em>Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' reference.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(Shift value);

	/**
	 * Returns the value of the '<em><b>Jobs After</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobBefore <em>Job Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs After</em>' reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_JobsAfter()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobBefore
	 * @model opposite="JobBefore"
	 * @generated
	 */
	EList<LpPrecedence> getJobsAfter();

	/**
	 * Returns the value of the '<em><b>Jobs Before</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter <em>Job After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs Before</em>' reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_JobsBefore()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter
	 * @model opposite="JobAfter"
	 * @generated
	 */
	EList<LpPrecedence> getJobsBefore();

	/**
	 * Returns the value of the '<em><b>Start Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Of Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Of Month</em>' attribute.
	 * @see #setStartOfMonth(boolean)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_StartOfMonth()
	 * @model
	 * @generated
	 */
	boolean isStartOfMonth();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#isStartOfMonth <em>Start Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Of Month</em>' attribute.
	 * @see #isStartOfMonth()
	 * @generated
	 */
	void setStartOfMonth(boolean value);

	/**
	 * Returns the value of the '<em><b>End Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Month</em>' attribute.
	 * @see #setEndOfMonth(boolean)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_EndOfMonth()
	 * @model
	 * @generated
	 */
	boolean isEndOfMonth();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#isEndOfMonth <em>End Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Month</em>' attribute.
	 * @see #isEndOfMonth()
	 * @generated
	 */
	void setEndOfMonth(boolean value);

} // LpJob
