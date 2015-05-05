/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.GeneratorTuple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobBefore <em>Job Before</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter <em>Job After</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getLpRoot <em>Lp Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpPrecedence()
 * @model
 * @generated
 */
public interface LpPrecedence extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Job Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsAfter <em>Jobs After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Before</em>' reference.
	 * @see #setJobBefore(LpJob)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpPrecedence_JobBefore()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsAfter
	 * @model opposite="JobsAfter" required="true"
	 * @generated
	 */
	LpJob getJobBefore();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobBefore <em>Job Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Before</em>' reference.
	 * @see #getJobBefore()
	 * @generated
	 */
	void setJobBefore(LpJob value);

	/**
	 * Returns the value of the '<em><b>Job After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsBefore <em>Jobs Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job After</em>' reference.
	 * @see #setJobAfter(LpJob)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpPrecedence_JobAfter()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsBefore
	 * @model opposite="JobsBefore" required="true"
	 * @generated
	 */
	LpJob getJobAfter();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter <em>Job After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job After</em>' reference.
	 * @see #getJobAfter()
	 * @generated
	 */
	void setJobAfter(LpJob value);

	/**
	 * Returns the value of the '<em><b>Lp Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getPrecedences <em>Precedences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Root</em>' container reference.
	 * @see #setLpRoot(LpRoot)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpPrecedence_LpRoot()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot#getPrecedences
	 * @model opposite="Precedences" transient="false"
	 * @generated
	 */
	LpRoot getLpRoot();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getLpRoot <em>Lp Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Root</em>' container reference.
	 * @see #getLpRoot()
	 * @generated
	 */
	void setLpRoot(LpRoot value);

} // LpPrecedence
