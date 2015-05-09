/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Opti Post Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMaxOverlapPredecessor <em>Max Overlap Predecessor</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMaxOverlapSuccessor <em>Max Overlap Successor</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getCplexSolver <em>Cplex Solver</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getAbsoluteMinEmployeeNrJob <em>Absolute Min Employee Nr Job</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getAbsoluteMaxEmployeeNrJobs <em>Absolute Max Employee Nr Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow()
 * @model
 * @generated
 */
public interface LpOptiPostFlow extends Generator {
	/**
	 * Returns the value of the '<em><b>Lp Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpOptiPostFlow <em>Lp Opti Post Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Root</em>' containment reference.
	 * @see #setLpRoot(LpRoot)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_LpRoot()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpOptiPostFlow
	 * @model opposite="LpOptiPostFlow" containment="true"
	 * @generated
	 */
	LpRoot getLpRoot();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot <em>Lp Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Root</em>' containment reference.
	 * @see #getLpRoot()
	 * @generated
	 */
	void setLpRoot(LpRoot value);

	/**
	 * Returns the value of the '<em><b>Max Overlap Predecessor</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Overlap Predecessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Overlap Predecessor</em>' attribute.
	 * @see #setMaxOverlapPredecessor(float)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_MaxOverlapPredecessor()
	 * @model default="0.25"
	 * @generated
	 */
	float getMaxOverlapPredecessor();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMaxOverlapPredecessor <em>Max Overlap Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Overlap Predecessor</em>' attribute.
	 * @see #getMaxOverlapPredecessor()
	 * @generated
	 */
	void setMaxOverlapPredecessor(float value);

	/**
	 * Returns the value of the '<em><b>Max Overlap Successor</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Overlap Successor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Overlap Successor</em>' attribute.
	 * @see #setMaxOverlapSuccessor(float)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_MaxOverlapSuccessor()
	 * @model default="0.25"
	 * @generated
	 */
	float getMaxOverlapSuccessor();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMaxOverlapSuccessor <em>Max Overlap Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Overlap Successor</em>' attribute.
	 * @see #getMaxOverlapSuccessor()
	 * @generated
	 */
	void setMaxOverlapSuccessor(float value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getLpOptiPostFlows <em>Lp Opti Post Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_Scenario()
	 * @see com.misc.projects.g4s.G4SOptiPost.Scenario#getLpOptiPostFlows
	 * @model opposite="LpOptiPostFlows" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Cplex Solver</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.solvercplex.SolverCplex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cplex Solver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cplex Solver</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_CplexSolver()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolverCplex> getCplexSolver();

	/**
	 * Returns the value of the '<em><b>Absolute Min Employee Nr Job</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Min Employee Nr Job</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Min Employee Nr Job</em>' attribute.
	 * @see #setAbsoluteMinEmployeeNrJob(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_AbsoluteMinEmployeeNrJob()
	 * @model default="10"
	 * @generated
	 */
	int getAbsoluteMinEmployeeNrJob();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getAbsoluteMinEmployeeNrJob <em>Absolute Min Employee Nr Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Min Employee Nr Job</em>' attribute.
	 * @see #getAbsoluteMinEmployeeNrJob()
	 * @generated
	 */
	void setAbsoluteMinEmployeeNrJob(int value);

	/**
	 * Returns the value of the '<em><b>Absolute Max Employee Nr Jobs</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Max Employee Nr Jobs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Max Employee Nr Jobs</em>' attribute.
	 * @see #setAbsoluteMaxEmployeeNrJobs(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_AbsoluteMaxEmployeeNrJobs()
	 * @model default="50"
	 * @generated
	 */
	int getAbsoluteMaxEmployeeNrJobs();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getAbsoluteMaxEmployeeNrJobs <em>Absolute Max Employee Nr Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Max Employee Nr Jobs</em>' attribute.
	 * @see #getAbsoluteMaxEmployeeNrJobs()
	 * @generated
	 */
	void setAbsoluteMaxEmployeeNrJobs(int value);

} // LpOptiPostFlow
