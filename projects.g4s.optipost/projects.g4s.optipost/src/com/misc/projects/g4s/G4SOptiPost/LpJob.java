/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
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
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpEmployee <em>Lp Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getVarInPost <em>Var In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsFollowedInPost <em>Cons Is Followed In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsPrecededInPost <em>Cons Is Preceded In Post</em>}</li>
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
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_StartOfMonth()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStartOfMonth();

	/**
	 * Returns the value of the '<em><b>End Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Month</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_EndOfMonth()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isEndOfMonth();

	/**
	 * Returns the value of the '<em><b>Lp Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Root</em>' container reference.
	 * @see #setLpRoot(LpRoot)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_LpRoot()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot#getJobs
	 * @model opposite="Jobs" transient="false"
	 * @generated
	 */
	LpRoot getLpRoot();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpRoot <em>Lp Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Root</em>' container reference.
	 * @see #getLpRoot()
	 * @generated
	 */
	void setLpRoot(LpRoot value);

	/**
	 * Returns the value of the '<em><b>Lp Employee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpJobs <em>Lp Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Employee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Employee</em>' reference.
	 * @see #setLpEmployee(LpEmployee)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_LpEmployee()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpJobs
	 * @model opposite="LpJobs" required="true"
	 * @generated
	 */
	LpEmployee getLpEmployee();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpEmployee <em>Lp Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Employee</em>' reference.
	 * @see #getLpEmployee()
	 * @generated
	 */
	void setLpEmployee(LpEmployee value);

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
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_VarInPost()
	 * @model containment="true"
	 * @generated
	 */
	GeneratorLpVar getVarInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getVarInPost <em>Var In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var In Post</em>' containment reference.
	 * @see #getVarInPost()
	 * @generated
	 */
	void setVarInPost(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Cons Is Followed In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons Is Followed In Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons Is Followed In Post</em>' containment reference.
	 * @see #setConsIsFollowedInPost(GeneratorLpCons)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_ConsIsFollowedInPost()
	 * @model containment="true"
	 * @generated
	 */
	GeneratorLpCons getConsIsFollowedInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsFollowedInPost <em>Cons Is Followed In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons Is Followed In Post</em>' containment reference.
	 * @see #getConsIsFollowedInPost()
	 * @generated
	 */
	void setConsIsFollowedInPost(GeneratorLpCons value);

	/**
	 * Returns the value of the '<em><b>Cons Is Preceded In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons Is Preceded In Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons Is Preceded In Post</em>' containment reference.
	 * @see #setConsIsPrecededInPost(GeneratorLpCons)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpJob_ConsIsPrecededInPost()
	 * @model containment="true"
	 * @generated
	 */
	GeneratorLpCons getConsIsPrecededInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsPrecededInPost <em>Cons Is Preceded In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons Is Preceded In Post</em>' containment reference.
	 * @see #getConsIsPrecededInPost()
	 * @generated
	 */
	void setConsIsPrecededInPost(GeneratorLpCons value);

} // LpJob
