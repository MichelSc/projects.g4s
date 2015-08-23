/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobBefore <em>Job Before</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter <em>Job After</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getVarInPost <em>Var In Post</em>}</li>
 * </ul>
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
	 * Returns the value of the '<em><b>Job After</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsBefore <em>Jobs Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job After</em>' container reference.
	 * @see #setJobAfter(LpJob)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpPrecedence_JobAfter()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsBefore
	 * @model opposite="JobsBefore" required="true" transient="false"
	 * @generated
	 */
	LpJob getJobAfter();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter <em>Job After</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job After</em>' container reference.
	 * @see #getJobAfter()
	 * @generated
	 */
	void setJobAfter(LpJob value);

	/**
	 * Returns the value of the '<em><b>Var In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var In Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var In Post</em>' containment reference.
	 * @see #setVarInPost(GeneratorLpVar)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpPrecedence_VarInPost()
	 * @model containment="true"
	 * @generated
	 */
	GeneratorLpVar getVarInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getVarInPost <em>Var In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var In Post</em>' containment reference.
	 * @see #getVarInPost()
	 * @generated
	 */
	void setVarInPost(GeneratorLpVar value);

} // LpPrecedence
