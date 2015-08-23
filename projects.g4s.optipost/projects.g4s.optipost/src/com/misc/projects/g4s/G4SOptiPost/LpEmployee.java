/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpJobs <em>Lp Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getEmployee <em>Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getMinNrJobs <em>Min Nr Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getVarInPost <em>Var In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getConsEnoughJobsInPost <em>Cons Enough Jobs In Post</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpEmployee()
 * @model
 * @generated
 */
public interface LpEmployee extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Lp Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpEmployees <em>Lp Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Root</em>' container reference.
	 * @see #setLpRoot(LpRoot)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpEmployee_LpRoot()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpEmployees
	 * @model opposite="LpEmployees" transient="false"
	 * @generated
	 */
	LpRoot getLpRoot();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpRoot <em>Lp Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Root</em>' container reference.
	 * @see #getLpRoot()
	 * @generated
	 */
	void setLpRoot(LpRoot value);

	/**
	 * Returns the value of the '<em><b>Lp Jobs</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpJob}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpEmployee <em>Lp Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Jobs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Jobs</em>' reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpEmployee_LpJobs()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getLpEmployee
	 * @model opposite="LpEmployee"
	 * @generated
	 */
	EList<LpJob> getLpJobs();

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
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpEmployee_Employee()
	 * @model required="true"
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

	/**
	 * Returns the value of the '<em><b>Min Nr Jobs</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Nr Jobs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinNrJobs is the numbers of jobs the employee has to do in the month to qualify for the benefit
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Nr Jobs</em>' attribute.
	 * @see #setMinNrJobs(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpEmployee_MinNrJobs()
	 * @model default="5"
	 * @generated
	 */
	int getMinNrJobs();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getMinNrJobs <em>Min Nr Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Nr Jobs</em>' attribute.
	 * @see #getMinNrJobs()
	 * @generated
	 */
	void setMinNrJobs(int value);

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
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpEmployee_VarInPost()
	 * @model containment="true"
	 * @generated
	 */
	GeneratorLpVar getVarInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getVarInPost <em>Var In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var In Post</em>' containment reference.
	 * @see #getVarInPost()
	 * @generated
	 */
	void setVarInPost(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Cons Enough Jobs In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons Enough Jobs In Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons Enough Jobs In Post</em>' containment reference.
	 * @see #setConsEnoughJobsInPost(GeneratorLpCons)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpEmployee_ConsEnoughJobsInPost()
	 * @model containment="true"
	 * @generated
	 */
	GeneratorLpCons getConsEnoughJobsInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getConsEnoughJobsInPost <em>Cons Enough Jobs In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons Enough Jobs In Post</em>' containment reference.
	 * @see #getConsEnoughJobsInPost()
	 * @generated
	 */
	void setConsEnoughJobsInPost(GeneratorLpCons value);

} // LpEmployee
