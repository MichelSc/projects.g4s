/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory
 * @model kind="package"
 * @generated
 */
public interface G4SOptiPostPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "G4SOptiPost";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/projects/g4s/optipost/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "g4sop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	G4SOptiPostPackage eINSTANCE = com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Sub Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SUB_DOMAINS = 0;

	/**
	 * The feature id for the '<em><b>Shifts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SHIFTS = 1;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__EMPLOYEES = 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LOCATIONS = 3;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SCENARIOS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 5;

	/**
	 * The feature id for the '<em><b>Jobs Importer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__JOBS_IMPORTER = 6;

	/**
	 * The feature id for the '<em><b>Spreadsheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SPREADSHEETS = 7;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl <em>Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getShift()
	 * @generated
	 */
	int SHIFT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__EMPLOYEE = 1;

	/**
	 * The feature id for the '<em><b>Shift Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__SHIFT_DATE = 2;

	/**
	 * The feature id for the '<em><b>Shift Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__SHIFT_START = 3;

	/**
	 * The feature id for the '<em><b>Shift End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__SHIFT_END = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.EmployeeImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 2;

	/**
	 * The feature id for the '<em><b>Employee ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMPLOYEE_ID = 0;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.LocationImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 4;

	/**
	 * The feature id for the '<em><b>Lp Opti Post Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__LP_OPTI_POST_FLOWS = 0;

	/**
	 * The feature id for the '<em><b>Selected Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTED_SHIFTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl <em>Lp Opti Post Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpOptiPostFlow()
	 * @generated
	 */
	int LP_OPTI_POST_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__TUPLE_ROOT = SolverPackage.GENERATOR__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__GENERATOR_FEATURE_MODES = SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES;

	/**
	 * The feature id for the '<em><b>Objective Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__OBJECTIVE_TYPE = SolverPackage.GENERATOR__OBJECTIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__REMARKS = SolverPackage.GENERATOR__REMARKS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__FOOTPRINT_NOF_VARS = SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__FOOTPRINT_NOF_CONS = SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__FOOTPRINT_NOF_TERMS = SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__COUNT_CONS = SolverPackage.GENERATOR__COUNT_CONS;

	/**
	 * The feature id for the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__COUNT_VARS = SolverPackage.GENERATOR__COUNT_VARS;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__ELP_VAR_COUNT = SolverPackage.GENERATOR__ELP_VAR_COUNT;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__ELP_CONS_COUNT = SolverPackage.GENERATOR__ELP_CONS_COUNT;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__CODE = SolverPackage.GENERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__SOLUTION_PROVIDER = SolverPackage.GENERATOR__SOLUTION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__SELECTED = SolverPackage.GENERATOR__SELECTED;

	/**
	 * The feature id for the '<em><b>Lp Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__LP_ROOT = SolverPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Overlap Predecessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR = SolverPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Overlap Successor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR = SolverPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__SCENARIO = SolverPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cplex Solver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW__CPLEX_SOLVER = SolverPackage.GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lp Opti Post Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW_FEATURE_COUNT = SolverPackage.GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___GENERATE = SolverPackage.GENERATOR___GENERATE;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___GENERATE_ROOT_TUPLES = SolverPackage.GENERATOR___GENERATE_ROOT_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___GENERATE_TUPLES = SolverPackage.GENERATOR___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___GENERATE_VARS = SolverPackage.GENERATOR___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___GENERATE_CONS = SolverPackage.GENERATOR___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___ACCEPT_SOLUTION__SOLUTION = SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Select Feature Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE = SolverPackage.GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Opti Post Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_OPTI_POST_FLOW_OPERATION_COUNT = SolverPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl <em>Lp Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpRoot()
	 * @generated
	 */
	int LP_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__JOBS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lp Opti Post Flow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__LP_OPTI_POST_FLOW = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lp Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__LP_EMPLOYEES = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lp Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl <em>Lp Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpJob()
	 * @generated
	 */
	int LP_JOB = 7;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__SHIFT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jobs After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__JOBS_AFTER = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jobs Before</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__JOBS_BEFORE = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__START_OF_MONTH = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__END_OF_MONTH = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lp Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__LP_ROOT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lp Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__LP_EMPLOYEE = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Var In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__VAR_IN_POST = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cons Is Followed In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__CONS_IS_FOLLOWED_IN_POST = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cons Is Preceded In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB__CONS_IS_PRECEDED_IN_POST = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Lp Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_JOB_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpPrecedenceImpl <em>Lp Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpPrecedenceImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpPrecedence()
	 * @generated
	 */
	int LP_PRECEDENCE = 8;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Job Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__JOB_BEFORE = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job After</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__JOB_AFTER = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE__VAR_IN_POST = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lp Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRECEDENCE_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl <em>Lp Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpEmployee()
	 * @generated
	 */
	int LP_EMPLOYEE = 9;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Lp Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__LP_ROOT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lp Jobs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__LP_JOBS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__EMPLOYEE = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Nr Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__MIN_NR_JOBS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Var In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__VAR_IN_POST = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cons Enough Jobs In Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Lp Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_EMPLOYEE_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterImpl <em>Jobs Importer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getJobsImporter()
	 * @generated
	 */
	int JOBS_IMPORTER = 10;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER__DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Jobs Importer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Format Worker ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER___FORMAT_WORKER_ID__INT = 0;

	/**
	 * The operation id for the '<em>Get Or Create Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER___GET_OR_CREATE_EMPLOYEE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Or Create Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER___GET_OR_CREATE_LOCATION__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Create Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER___CREATE_JOB__EMPLOYEE_LOCATION_DATE_DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Import Jobs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER___IMPORT_JOBS = 4;

	/**
	 * The number of operations of the '<em>Jobs Importer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl <em>Jobs Importer Spreadsheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl
	 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getJobsImporterSpreadsheet()
	 * @generated
	 */
	int JOBS_IMPORTER_SPREADSHEET = 11;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__DOMAIN = JOBS_IMPORTER__DOMAIN;

	/**
	 * The feature id for the '<em><b>Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__SPREADSHEET = JOBS_IMPORTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Sheet Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR = JOBS_IMPORTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Worker Id Col Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR = JOBS_IMPORTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location Id Col Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR = JOBS_IMPORTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Job Date Col Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR = JOBS_IMPORTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Job Start Col Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR = JOBS_IMPORTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Job End Col Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR = JOBS_IMPORTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Location Description Col Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR = JOBS_IMPORTER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Jobs Importer Spreadsheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET_FEATURE_COUNT = JOBS_IMPORTER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Format Worker ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET___FORMAT_WORKER_ID__INT = JOBS_IMPORTER___FORMAT_WORKER_ID__INT;

	/**
	 * The operation id for the '<em>Get Or Create Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET___GET_OR_CREATE_EMPLOYEE__STRING = JOBS_IMPORTER___GET_OR_CREATE_EMPLOYEE__STRING;

	/**
	 * The operation id for the '<em>Get Or Create Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET___GET_OR_CREATE_LOCATION__STRING_STRING = JOBS_IMPORTER___GET_OR_CREATE_LOCATION__STRING_STRING;

	/**
	 * The operation id for the '<em>Create Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET___CREATE_JOB__EMPLOYEE_LOCATION_DATE_DATE_DATE = JOBS_IMPORTER___CREATE_JOB__EMPLOYEE_LOCATION_DATE_DATE_DATE;

	/**
	 * The operation id for the '<em>Import Jobs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET___IMPORT_JOBS = JOBS_IMPORTER___IMPORT_JOBS;

	/**
	 * The number of operations of the '<em>Jobs Importer Spreadsheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_IMPORTER_SPREADSHEET_OPERATION_COUNT = JOBS_IMPORTER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getSubDomains <em>Sub Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Domains</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getSubDomains()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_SubDomains();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getShifts <em>Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shifts</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getShifts()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Shifts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getEmployees()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getLocations()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getScenarios()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Scenarios();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getJobsImporter <em>Jobs Importer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs Importer</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getJobsImporter()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_JobsImporter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getSpreadsheets <em>Spreadsheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spreadsheets</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getSpreadsheets()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Spreadsheets();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift
	 * @generated
	 */
	EClass getShift();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift#getLocation()
	 * @see #getShift()
	 * @generated
	 */
	EReference getShift_Location();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift#getEmployee()
	 * @see #getShift()
	 * @generated
	 */
	EReference getShift_Employee();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftDate <em>Shift Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift Date</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift#getShiftDate()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_ShiftDate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftStart <em>Shift Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift Start</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift#getShiftStart()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_ShiftStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getShiftEnd <em>Shift End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift End</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift#getShiftEnd()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_ShiftEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Shift#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift#getDescription()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Employee#getEmployeeID <em>Employee ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee ID</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Employee#getEmployeeID()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmployeeID();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Location#getLocationID <em>Location ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location ID</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Location#getLocationID()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LocationID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Location#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Location#getDescription()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getLpOptiPostFlows <em>Lp Opti Post Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lp Opti Post Flows</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Scenario#getLpOptiPostFlows()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_LpOptiPostFlows();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getSelectedShifts <em>Selected Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Shifts</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Scenario#getSelectedShifts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SelectedShifts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow <em>Lp Opti Post Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Opti Post Flow</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow
	 * @generated
	 */
	EClass getLpOptiPostFlow();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lp Root</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot()
	 * @see #getLpOptiPostFlow()
	 * @generated
	 */
	EReference getLpOptiPostFlow_LpRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapPredecessor <em>Min Overlap Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Overlap Predecessor</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapPredecessor()
	 * @see #getLpOptiPostFlow()
	 * @generated
	 */
	EAttribute getLpOptiPostFlow_MinOverlapPredecessor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapSuccessor <em>Min Overlap Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Overlap Successor</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapSuccessor()
	 * @see #getLpOptiPostFlow()
	 * @generated
	 */
	EAttribute getLpOptiPostFlow_MinOverlapSuccessor();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getScenario()
	 * @see #getLpOptiPostFlow()
	 * @generated
	 */
	EReference getLpOptiPostFlow_Scenario();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getCplexSolver <em>Cplex Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cplex Solver</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getCplexSolver()
	 * @see #getLpOptiPostFlow()
	 * @generated
	 */
	EReference getLpOptiPostFlow_CplexSolver();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Root</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot
	 * @generated
	 */
	EClass getLpRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot#getJobs()
	 * @see #getLpRoot()
	 * @generated
	 */
	EReference getLpRoot_Jobs();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpOptiPostFlow <em>Lp Opti Post Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lp Opti Post Flow</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpOptiPostFlow()
	 * @see #getLpRoot()
	 * @generated
	 */
	EReference getLpRoot_LpOptiPostFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpEmployees <em>Lp Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lp Employees</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot#getLpEmployees()
	 * @see #getLpRoot()
	 * @generated
	 */
	EReference getLpRoot_LpEmployees();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.LpJob <em>Lp Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Job</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob
	 * @generated
	 */
	EClass getLpJob();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shift</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getShift()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_Shift();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsAfter <em>Jobs After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jobs After</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsAfter()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_JobsAfter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsBefore <em>Jobs Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs Before</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getJobsBefore()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_JobsBefore();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#isStartOfMonth <em>Start Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Of Month</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#isStartOfMonth()
	 * @see #getLpJob()
	 * @generated
	 */
	EAttribute getLpJob_StartOfMonth();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#isEndOfMonth <em>End Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Month</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#isEndOfMonth()
	 * @see #getLpJob()
	 * @generated
	 */
	EAttribute getLpJob_EndOfMonth();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lp Root</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getLpRoot()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_LpRoot();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getLpEmployee <em>Lp Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lp Employee</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getLpEmployee()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_LpEmployee();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getVarInPost <em>Var In Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var In Post</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getVarInPost()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_VarInPost();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsFollowedInPost <em>Cons Is Followed In Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cons Is Followed In Post</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsFollowedInPost()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_ConsIsFollowedInPost();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsPrecededInPost <em>Cons Is Preceded In Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cons Is Preceded In Post</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob#getConsIsPrecededInPost()
	 * @see #getLpJob()
	 * @generated
	 */
	EReference getLpJob_ConsIsPrecededInPost();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence <em>Lp Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Precedence</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence
	 * @generated
	 */
	EClass getLpPrecedence();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobBefore <em>Job Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Before</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobBefore()
	 * @see #getLpPrecedence()
	 * @generated
	 */
	EReference getLpPrecedence_JobBefore();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter <em>Job After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Job After</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getJobAfter()
	 * @see #getLpPrecedence()
	 * @generated
	 */
	EReference getLpPrecedence_JobAfter();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getVarInPost <em>Var In Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var In Post</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence#getVarInPost()
	 * @see #getLpPrecedence()
	 * @generated
	 */
	EReference getLpPrecedence_VarInPost();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee <em>Lp Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Employee</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee
	 * @generated
	 */
	EClass getLpEmployee();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lp Root</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpRoot()
	 * @see #getLpEmployee()
	 * @generated
	 */
	EReference getLpEmployee_LpRoot();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpJobs <em>Lp Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lp Jobs</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getLpJobs()
	 * @see #getLpEmployee()
	 * @generated
	 */
	EReference getLpEmployee_LpJobs();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getEmployee()
	 * @see #getLpEmployee()
	 * @generated
	 */
	EReference getLpEmployee_Employee();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getMinNrJobs <em>Min Nr Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Nr Jobs</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getMinNrJobs()
	 * @see #getLpEmployee()
	 * @generated
	 */
	EAttribute getLpEmployee_MinNrJobs();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getVarInPost <em>Var In Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var In Post</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getVarInPost()
	 * @see #getLpEmployee()
	 * @generated
	 */
	EReference getLpEmployee_VarInPost();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee#getConsEnoughJobsInPost <em>Cons Enough Jobs In Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cons Enough Jobs In Post</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee#getConsEnoughJobsInPost()
	 * @see #getLpEmployee()
	 * @generated
	 */
	EReference getLpEmployee_ConsEnoughJobsInPost();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter <em>Jobs Importer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jobs Importer</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter
	 * @generated
	 */
	EClass getJobsImporter();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter#getDomain()
	 * @see #getJobsImporter()
	 * @generated
	 */
	EReference getJobsImporter_Domain();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#formatWorkerID(int) <em>Format Worker ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Format Worker ID</em>' operation.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter#formatWorkerID(int)
	 * @generated
	 */
	EOperation getJobsImporter__FormatWorkerID__int();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#getOrCreateEmployee(java.lang.String) <em>Get Or Create Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Employee</em>' operation.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter#getOrCreateEmployee(java.lang.String)
	 * @generated
	 */
	EOperation getJobsImporter__GetOrCreateEmployee__String();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#getOrCreateLocation(java.lang.String, java.lang.String) <em>Get Or Create Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Location</em>' operation.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter#getOrCreateLocation(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getJobsImporter__GetOrCreateLocation__String_String();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#createJob(com.misc.projects.g4s.G4SOptiPost.Employee, com.misc.projects.g4s.G4SOptiPost.Location, java.util.Date, java.util.Date, java.util.Date) <em>Create Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Job</em>' operation.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter#createJob(com.misc.projects.g4s.G4SOptiPost.Employee, com.misc.projects.g4s.G4SOptiPost.Location, java.util.Date, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getJobsImporter__CreateJob__Employee_Location_Date_Date_Date();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#importJobs() <em>Import Jobs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Jobs</em>' operation.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter#importJobs()
	 * @generated
	 */
	EOperation getJobsImporter__ImportJobs();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet <em>Jobs Importer Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jobs Importer Spreadsheet</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet
	 * @generated
	 */
	EClass getJobsImporterSpreadsheet();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spreadsheet</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getSpreadsheet()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EReference getJobsImporterSpreadsheet_Spreadsheet();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getDataSheetNr <em>Data Sheet Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Sheet Nr</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getDataSheetNr()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EAttribute getJobsImporterSpreadsheet_DataSheetNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getWorkerIdColNr <em>Worker Id Col Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id Col Nr</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getWorkerIdColNr()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EAttribute getJobsImporterSpreadsheet_WorkerIdColNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationIdColNr <em>Location Id Col Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Id Col Nr</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationIdColNr()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EAttribute getJobsImporterSpreadsheet_LocationIdColNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobDateColNr <em>Job Date Col Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Date Col Nr</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobDateColNr()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EAttribute getJobsImporterSpreadsheet_JobDateColNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobStartColNr <em>Job Start Col Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Start Col Nr</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobStartColNr()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EAttribute getJobsImporterSpreadsheet_JobStartColNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobEndColNr <em>Job End Col Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job End Col Nr</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobEndColNr()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EAttribute getJobsImporterSpreadsheet_JobEndColNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationDescriptionColNr <em>Location Description Col Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Description Col Nr</em>'.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationDescriptionColNr()
	 * @see #getJobsImporterSpreadsheet()
	 * @generated
	 */
	EAttribute getJobsImporterSpreadsheet_LocationDescriptionColNr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	G4SOptiPostFactory getG4SOptiPostFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Sub Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SUB_DOMAINS = eINSTANCE.getDomain_SubDomains();

		/**
		 * The meta object literal for the '<em><b>Shifts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SHIFTS = eINSTANCE.getDomain_Shifts();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__EMPLOYEES = eINSTANCE.getDomain_Employees();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LOCATIONS = eINSTANCE.getDomain_Locations();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SCENARIOS = eINSTANCE.getDomain_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Jobs Importer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__JOBS_IMPORTER = eINSTANCE.getDomain_JobsImporter();

		/**
		 * The meta object literal for the '<em><b>Spreadsheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SPREADSHEETS = eINSTANCE.getDomain_Spreadsheets();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl <em>Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getShift()
		 * @generated
		 */
		EClass SHIFT = eINSTANCE.getShift();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT__LOCATION = eINSTANCE.getShift_Location();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT__EMPLOYEE = eINSTANCE.getShift_Employee();

		/**
		 * The meta object literal for the '<em><b>Shift Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__SHIFT_DATE = eINSTANCE.getShift_ShiftDate();

		/**
		 * The meta object literal for the '<em><b>Shift Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__SHIFT_START = eINSTANCE.getShift_ShiftStart();

		/**
		 * The meta object literal for the '<em><b>Shift End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__SHIFT_END = eINSTANCE.getShift_ShiftEnd();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__DESCRIPTION = eINSTANCE.getShift_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.EmployeeImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Employee ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMPLOYEE_ID = eINSTANCE.getEmployee_EmployeeID();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.LocationImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Location ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCATION_ID = eINSTANCE.getLocation_LocationID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DESCRIPTION = eINSTANCE.getLocation_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Lp Opti Post Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__LP_OPTI_POST_FLOWS = eINSTANCE.getScenario_LpOptiPostFlows();

		/**
		 * The meta object literal for the '<em><b>Selected Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTED_SHIFTS = eINSTANCE.getScenario_SelectedShifts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl <em>Lp Opti Post Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpOptiPostFlow()
		 * @generated
		 */
		EClass LP_OPTI_POST_FLOW = eINSTANCE.getLpOptiPostFlow();

		/**
		 * The meta object literal for the '<em><b>Lp Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_OPTI_POST_FLOW__LP_ROOT = eINSTANCE.getLpOptiPostFlow_LpRoot();

		/**
		 * The meta object literal for the '<em><b>Min Overlap Predecessor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR = eINSTANCE.getLpOptiPostFlow_MinOverlapPredecessor();

		/**
		 * The meta object literal for the '<em><b>Min Overlap Successor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR = eINSTANCE.getLpOptiPostFlow_MinOverlapSuccessor();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_OPTI_POST_FLOW__SCENARIO = eINSTANCE.getLpOptiPostFlow_Scenario();

		/**
		 * The meta object literal for the '<em><b>Cplex Solver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_OPTI_POST_FLOW__CPLEX_SOLVER = eINSTANCE.getLpOptiPostFlow_CplexSolver();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl <em>Lp Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpRoot()
		 * @generated
		 */
		EClass LP_ROOT = eINSTANCE.getLpRoot();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROOT__JOBS = eINSTANCE.getLpRoot_Jobs();

		/**
		 * The meta object literal for the '<em><b>Lp Opti Post Flow</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROOT__LP_OPTI_POST_FLOW = eINSTANCE.getLpRoot_LpOptiPostFlow();

		/**
		 * The meta object literal for the '<em><b>Lp Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROOT__LP_EMPLOYEES = eINSTANCE.getLpRoot_LpEmployees();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl <em>Lp Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpJob()
		 * @generated
		 */
		EClass LP_JOB = eINSTANCE.getLpJob();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__SHIFT = eINSTANCE.getLpJob_Shift();

		/**
		 * The meta object literal for the '<em><b>Jobs After</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__JOBS_AFTER = eINSTANCE.getLpJob_JobsAfter();

		/**
		 * The meta object literal for the '<em><b>Jobs Before</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__JOBS_BEFORE = eINSTANCE.getLpJob_JobsBefore();

		/**
		 * The meta object literal for the '<em><b>Start Of Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LP_JOB__START_OF_MONTH = eINSTANCE.getLpJob_StartOfMonth();

		/**
		 * The meta object literal for the '<em><b>End Of Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LP_JOB__END_OF_MONTH = eINSTANCE.getLpJob_EndOfMonth();

		/**
		 * The meta object literal for the '<em><b>Lp Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__LP_ROOT = eINSTANCE.getLpJob_LpRoot();

		/**
		 * The meta object literal for the '<em><b>Lp Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__LP_EMPLOYEE = eINSTANCE.getLpJob_LpEmployee();

		/**
		 * The meta object literal for the '<em><b>Var In Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__VAR_IN_POST = eINSTANCE.getLpJob_VarInPost();

		/**
		 * The meta object literal for the '<em><b>Cons Is Followed In Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__CONS_IS_FOLLOWED_IN_POST = eINSTANCE.getLpJob_ConsIsFollowedInPost();

		/**
		 * The meta object literal for the '<em><b>Cons Is Preceded In Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_JOB__CONS_IS_PRECEDED_IN_POST = eINSTANCE.getLpJob_ConsIsPrecededInPost();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpPrecedenceImpl <em>Lp Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpPrecedenceImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpPrecedence()
		 * @generated
		 */
		EClass LP_PRECEDENCE = eINSTANCE.getLpPrecedence();

		/**
		 * The meta object literal for the '<em><b>Job Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRECEDENCE__JOB_BEFORE = eINSTANCE.getLpPrecedence_JobBefore();

		/**
		 * The meta object literal for the '<em><b>Job After</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRECEDENCE__JOB_AFTER = eINSTANCE.getLpPrecedence_JobAfter();

		/**
		 * The meta object literal for the '<em><b>Var In Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRECEDENCE__VAR_IN_POST = eINSTANCE.getLpPrecedence_VarInPost();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl <em>Lp Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getLpEmployee()
		 * @generated
		 */
		EClass LP_EMPLOYEE = eINSTANCE.getLpEmployee();

		/**
		 * The meta object literal for the '<em><b>Lp Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_EMPLOYEE__LP_ROOT = eINSTANCE.getLpEmployee_LpRoot();

		/**
		 * The meta object literal for the '<em><b>Lp Jobs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_EMPLOYEE__LP_JOBS = eINSTANCE.getLpEmployee_LpJobs();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_EMPLOYEE__EMPLOYEE = eINSTANCE.getLpEmployee_Employee();

		/**
		 * The meta object literal for the '<em><b>Min Nr Jobs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LP_EMPLOYEE__MIN_NR_JOBS = eINSTANCE.getLpEmployee_MinNrJobs();

		/**
		 * The meta object literal for the '<em><b>Var In Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_EMPLOYEE__VAR_IN_POST = eINSTANCE.getLpEmployee_VarInPost();

		/**
		 * The meta object literal for the '<em><b>Cons Enough Jobs In Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST = eINSTANCE.getLpEmployee_ConsEnoughJobsInPost();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterImpl <em>Jobs Importer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getJobsImporter()
		 * @generated
		 */
		EClass JOBS_IMPORTER = eINSTANCE.getJobsImporter();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOBS_IMPORTER__DOMAIN = eINSTANCE.getJobsImporter_Domain();

		/**
		 * The meta object literal for the '<em><b>Format Worker ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOBS_IMPORTER___FORMAT_WORKER_ID__INT = eINSTANCE.getJobsImporter__FormatWorkerID__int();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOBS_IMPORTER___GET_OR_CREATE_EMPLOYEE__STRING = eINSTANCE.getJobsImporter__GetOrCreateEmployee__String();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOBS_IMPORTER___GET_OR_CREATE_LOCATION__STRING_STRING = eINSTANCE.getJobsImporter__GetOrCreateLocation__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOBS_IMPORTER___CREATE_JOB__EMPLOYEE_LOCATION_DATE_DATE_DATE = eINSTANCE.getJobsImporter__CreateJob__Employee_Location_Date_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Import Jobs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOBS_IMPORTER___IMPORT_JOBS = eINSTANCE.getJobsImporter__ImportJobs();

		/**
		 * The meta object literal for the '{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl <em>Jobs Importer Spreadsheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl
		 * @see com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostPackageImpl#getJobsImporterSpreadsheet()
		 * @generated
		 */
		EClass JOBS_IMPORTER_SPREADSHEET = eINSTANCE.getJobsImporterSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>Spreadsheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOBS_IMPORTER_SPREADSHEET__SPREADSHEET = eINSTANCE.getJobsImporterSpreadsheet_Spreadsheet();

		/**
		 * The meta object literal for the '<em><b>Data Sheet Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR = eINSTANCE.getJobsImporterSpreadsheet_DataSheetNr();

		/**
		 * The meta object literal for the '<em><b>Worker Id Col Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR = eINSTANCE.getJobsImporterSpreadsheet_WorkerIdColNr();

		/**
		 * The meta object literal for the '<em><b>Location Id Col Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR = eINSTANCE.getJobsImporterSpreadsheet_LocationIdColNr();

		/**
		 * The meta object literal for the '<em><b>Job Date Col Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR = eINSTANCE.getJobsImporterSpreadsheet_JobDateColNr();

		/**
		 * The meta object literal for the '<em><b>Job Start Col Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR = eINSTANCE.getJobsImporterSpreadsheet_JobStartColNr();

		/**
		 * The meta object literal for the '<em><b>Job End Col Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR = eINSTANCE.getJobsImporterSpreadsheet_JobEndColNr();

		/**
		 * The meta object literal for the '<em><b>Location Description Col Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR = eINSTANCE.getJobsImporterSpreadsheet_LocationDescriptionColNr();

	}

} //G4SOptiPostPackage
