/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Opti Post Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getCplexSolver <em>Cplex Solver</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getGoalNofEmployees <em>Goal Nof Employees</em>}</li>
 * </ul>
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
	 * Returns the value of the '<em><b>Goal Nof Employees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Nof Employees</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Nof Employees</em>' containment reference.
	 * @see #setGoalNofEmployees(GeneratorLpGoal)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_GoalNofEmployees()
	 * @model containment="true"
	 * @generated
	 */
	GeneratorLpGoal getGoalNofEmployees();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getGoalNofEmployees <em>Goal Nof Employees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Nof Employees</em>' containment reference.
	 * @see #getGoalNofEmployees()
	 * @generated
	 */
	void setGoalNofEmployees(GeneratorLpGoal value);

} // LpOptiPostFlow
