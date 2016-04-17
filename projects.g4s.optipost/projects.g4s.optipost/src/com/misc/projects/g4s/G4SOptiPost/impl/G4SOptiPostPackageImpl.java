/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexPackage;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetpoiPackage;
import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.JobsImporter;
import com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.LpEmployee;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolution;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift;
import com.misc.projects.g4s.G4SOptiPost.Scenario;
import com.misc.projects.g4s.G4SOptiPost.Shift;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class G4SOptiPostPackageImpl extends EPackageImpl implements G4SOptiPostPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpOptiPostFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpPrecedenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpEmployeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobsImporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobsImporterSpreadsheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optiPostSolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optiPostSolutionPostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optiPostSolutionEmployeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optiPostSolutionShiftEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private G4SOptiPostPackageImpl() {
		super(eNS_URI, G4SOptiPostFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link G4SOptiPostPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static G4SOptiPostPackage init() {
		if (isInited) return (G4SOptiPostPackage)EPackage.Registry.INSTANCE.getEPackage(G4SOptiPostPackage.eNS_URI);

		// Obtain or create and register package
		G4SOptiPostPackageImpl theG4SOptiPostPackage = (G4SOptiPostPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof G4SOptiPostPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new G4SOptiPostPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolvercplexPackage.eINSTANCE.eClass();
		SolverglpkPackage.eINSTANCE.eClass();
		SpreadsheetpoiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theG4SOptiPostPackage.createPackageContents();

		// Initialize created meta-data
		theG4SOptiPostPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theG4SOptiPostPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(G4SOptiPostPackage.eNS_URI, theG4SOptiPostPackage);
		return theG4SOptiPostPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_SubDomains() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Shifts() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Employees() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Locations() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Scenarios() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_JobsImporter() {
		return (EReference)domainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Spreadsheets() {
		return (EReference)domainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShift() {
		return shiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShift_Location() {
		return (EReference)shiftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShift_Employee() {
		return (EReference)shiftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_ShiftDate() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_ShiftStart() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_ShiftEnd() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_Description() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_EmployeeID() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Color() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_LocationID() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Description() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_LpOptiPostFlows() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SelectedShifts() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Solutions() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_AbsoluteMinEmployeeNrJob() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_AbsoluteMaxEmployeeNrJobs() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_MaxOverlapPredecessor() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_MaxOverlapSuccessor() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_CplexSolver() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_GLPKSolver() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpOptiPostFlow() {
		return lpOptiPostFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpOptiPostFlow_LpRoot() {
		return (EReference)lpOptiPostFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpOptiPostFlow_Scenario() {
		return (EReference)lpOptiPostFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpOptiPostFlow_GoalNofEmployees() {
		return (EReference)lpOptiPostFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpRoot() {
		return lpRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_Jobs() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_LpOptiPostFlow() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_LpEmployees() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpJob() {
		return lpJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_Shift() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_JobsAfter() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_JobsBefore() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLpJob_StartOfMonth() {
		return (EAttribute)lpJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLpJob_EndOfMonth() {
		return (EAttribute)lpJobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_LpRoot() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_LpEmployee() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_VarInPost() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_ConsIsFollowedInPost() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_ConsIsPrecededInPost() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_VarIsFirstInPost() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpJob_VarIsLastInPost() {
		return (EReference)lpJobEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpPrecedence() {
		return lpPrecedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpPrecedence_JobBefore() {
		return (EReference)lpPrecedenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpPrecedence_JobAfter() {
		return (EReference)lpPrecedenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpPrecedence_VarInPost() {
		return (EReference)lpPrecedenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpEmployee() {
		return lpEmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpEmployee_LpRoot() {
		return (EReference)lpEmployeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpEmployee_LpJobs() {
		return (EReference)lpEmployeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpEmployee_Employee() {
		return (EReference)lpEmployeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLpEmployee_MinNrJobs() {
		return (EAttribute)lpEmployeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpEmployee_VarInPost() {
		return (EReference)lpEmployeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpEmployee_ConsEnoughJobsInPost() {
		return (EReference)lpEmployeeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobsImporter() {
		return jobsImporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobsImporter_Domain() {
		return (EReference)jobsImporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobsImporter__FormatWorkerID__int() {
		return jobsImporterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobsImporter__GetOrCreateEmployee__String() {
		return jobsImporterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobsImporter__GetOrCreateLocation__String_String() {
		return jobsImporterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobsImporter__CreateJob__Employee_Location_Date_Date_Date() {
		return jobsImporterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobsImporter__ImportJobs() {
		return jobsImporterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobsImporterSpreadsheet() {
		return jobsImporterSpreadsheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobsImporterSpreadsheet_Spreadsheet() {
		return (EReference)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_DataSheetNr() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_WorkerIdColNr() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_LocationIdColNr() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_JobDateColNr() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_JobStartColNr() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_JobEndColNr() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_LocationDescriptionColNr() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobsImporterSpreadsheet_Description() {
		return (EAttribute)jobsImporterSpreadsheetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptiPostSolution() {
		return optiPostSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolution_Lp() {
		return (EReference)optiPostSolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolution_Posts() {
		return (EReference)optiPostSolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolution_Employees() {
		return (EReference)optiPostSolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolution_NrEmployees() {
		return (EAttribute)optiPostSolutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolution_Description() {
		return (EAttribute)optiPostSolutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolution_EmployeesInPost() {
		return (EAttribute)optiPostSolutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolution_ShiftsInPost() {
		return (EAttribute)optiPostSolutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolution_Scenario() {
		return (EReference)optiPostSolutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptiPostSolutionPost() {
		return optiPostSolutionPostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolutionPost_Shifts() {
		return (EReference)optiPostSolutionPostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolutionPost_Location() {
		return (EReference)optiPostSolutionPostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolutionPost_NrShifts() {
		return (EAttribute)optiPostSolutionPostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolutionPost_Description() {
		return (EAttribute)optiPostSolutionPostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptiPostSolutionPost__AddShift__Shift() {
		return optiPostSolutionPostEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptiPostSolutionEmployee() {
		return optiPostSolutionEmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolutionEmployee_Shifts() {
		return (EReference)optiPostSolutionEmployeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolutionEmployee_Employee() {
		return (EReference)optiPostSolutionEmployeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolutionEmployee_NrShifts() {
		return (EAttribute)optiPostSolutionEmployeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolutionEmployee_Description() {
		return (EAttribute)optiPostSolutionEmployeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolutionEmployee_InPost() {
		return (EAttribute)optiPostSolutionEmployeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptiPostSolutionShift() {
		return optiPostSolutionShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptiPostSolutionShift_Shift() {
		return (EReference)optiPostSolutionShiftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptiPostSolutionShift_Description() {
		return (EAttribute)optiPostSolutionShiftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G4SOptiPostFactory getG4SOptiPostFactory() {
		return (G4SOptiPostFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__SUB_DOMAINS);
		createEReference(domainEClass, DOMAIN__SHIFTS);
		createEReference(domainEClass, DOMAIN__EMPLOYEES);
		createEReference(domainEClass, DOMAIN__LOCATIONS);
		createEReference(domainEClass, DOMAIN__SCENARIOS);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEReference(domainEClass, DOMAIN__JOBS_IMPORTER);
		createEReference(domainEClass, DOMAIN__SPREADSHEETS);

		shiftEClass = createEClass(SHIFT);
		createEReference(shiftEClass, SHIFT__LOCATION);
		createEReference(shiftEClass, SHIFT__EMPLOYEE);
		createEAttribute(shiftEClass, SHIFT__SHIFT_DATE);
		createEAttribute(shiftEClass, SHIFT__SHIFT_START);
		createEAttribute(shiftEClass, SHIFT__SHIFT_END);
		createEAttribute(shiftEClass, SHIFT__DESCRIPTION);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__EMPLOYEE_ID);
		createEAttribute(employeeEClass, EMPLOYEE__COLOR);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LOCATION_ID);
		createEAttribute(locationEClass, LOCATION__DESCRIPTION);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__LP_OPTI_POST_FLOWS);
		createEReference(scenarioEClass, SCENARIO__SELECTED_SHIFTS);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEReference(scenarioEClass, SCENARIO__SOLUTIONS);
		createEAttribute(scenarioEClass, SCENARIO__ABSOLUTE_MIN_EMPLOYEE_NR_JOB);
		createEAttribute(scenarioEClass, SCENARIO__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS);
		createEAttribute(scenarioEClass, SCENARIO__MAX_OVERLAP_PREDECESSOR);
		createEAttribute(scenarioEClass, SCENARIO__MAX_OVERLAP_SUCCESSOR);
		createEReference(scenarioEClass, SCENARIO__CPLEX_SOLVER);
		createEReference(scenarioEClass, SCENARIO__GLPK_SOLVER);

		lpOptiPostFlowEClass = createEClass(LP_OPTI_POST_FLOW);
		createEReference(lpOptiPostFlowEClass, LP_OPTI_POST_FLOW__LP_ROOT);
		createEReference(lpOptiPostFlowEClass, LP_OPTI_POST_FLOW__SCENARIO);
		createEReference(lpOptiPostFlowEClass, LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES);

		lpRootEClass = createEClass(LP_ROOT);
		createEReference(lpRootEClass, LP_ROOT__JOBS);
		createEReference(lpRootEClass, LP_ROOT__LP_OPTI_POST_FLOW);
		createEReference(lpRootEClass, LP_ROOT__LP_EMPLOYEES);

		lpJobEClass = createEClass(LP_JOB);
		createEReference(lpJobEClass, LP_JOB__SHIFT);
		createEReference(lpJobEClass, LP_JOB__JOBS_AFTER);
		createEReference(lpJobEClass, LP_JOB__JOBS_BEFORE);
		createEAttribute(lpJobEClass, LP_JOB__START_OF_MONTH);
		createEAttribute(lpJobEClass, LP_JOB__END_OF_MONTH);
		createEReference(lpJobEClass, LP_JOB__LP_ROOT);
		createEReference(lpJobEClass, LP_JOB__LP_EMPLOYEE);
		createEReference(lpJobEClass, LP_JOB__VAR_IN_POST);
		createEReference(lpJobEClass, LP_JOB__CONS_IS_FOLLOWED_IN_POST);
		createEReference(lpJobEClass, LP_JOB__CONS_IS_PRECEDED_IN_POST);
		createEReference(lpJobEClass, LP_JOB__VAR_IS_FIRST_IN_POST);
		createEReference(lpJobEClass, LP_JOB__VAR_IS_LAST_IN_POST);

		lpPrecedenceEClass = createEClass(LP_PRECEDENCE);
		createEReference(lpPrecedenceEClass, LP_PRECEDENCE__JOB_BEFORE);
		createEReference(lpPrecedenceEClass, LP_PRECEDENCE__JOB_AFTER);
		createEReference(lpPrecedenceEClass, LP_PRECEDENCE__VAR_IN_POST);

		lpEmployeeEClass = createEClass(LP_EMPLOYEE);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__LP_ROOT);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__LP_JOBS);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__EMPLOYEE);
		createEAttribute(lpEmployeeEClass, LP_EMPLOYEE__MIN_NR_JOBS);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__VAR_IN_POST);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST);

		jobsImporterEClass = createEClass(JOBS_IMPORTER);
		createEReference(jobsImporterEClass, JOBS_IMPORTER__DOMAIN);
		createEOperation(jobsImporterEClass, JOBS_IMPORTER___FORMAT_WORKER_ID__INT);
		createEOperation(jobsImporterEClass, JOBS_IMPORTER___GET_OR_CREATE_EMPLOYEE__STRING);
		createEOperation(jobsImporterEClass, JOBS_IMPORTER___GET_OR_CREATE_LOCATION__STRING_STRING);
		createEOperation(jobsImporterEClass, JOBS_IMPORTER___CREATE_JOB__EMPLOYEE_LOCATION_DATE_DATE_DATE);
		createEOperation(jobsImporterEClass, JOBS_IMPORTER___IMPORT_JOBS);

		jobsImporterSpreadsheetEClass = createEClass(JOBS_IMPORTER_SPREADSHEET);
		createEReference(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__SPREADSHEET);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR);
		createEAttribute(jobsImporterSpreadsheetEClass, JOBS_IMPORTER_SPREADSHEET__DESCRIPTION);

		optiPostSolutionEClass = createEClass(OPTI_POST_SOLUTION);
		createEReference(optiPostSolutionEClass, OPTI_POST_SOLUTION__LP);
		createEReference(optiPostSolutionEClass, OPTI_POST_SOLUTION__POSTS);
		createEReference(optiPostSolutionEClass, OPTI_POST_SOLUTION__EMPLOYEES);
		createEAttribute(optiPostSolutionEClass, OPTI_POST_SOLUTION__NR_EMPLOYEES);
		createEAttribute(optiPostSolutionEClass, OPTI_POST_SOLUTION__DESCRIPTION);
		createEAttribute(optiPostSolutionEClass, OPTI_POST_SOLUTION__EMPLOYEES_IN_POST);
		createEAttribute(optiPostSolutionEClass, OPTI_POST_SOLUTION__SHIFTS_IN_POST);
		createEReference(optiPostSolutionEClass, OPTI_POST_SOLUTION__SCENARIO);

		optiPostSolutionPostEClass = createEClass(OPTI_POST_SOLUTION_POST);
		createEReference(optiPostSolutionPostEClass, OPTI_POST_SOLUTION_POST__SHIFTS);
		createEReference(optiPostSolutionPostEClass, OPTI_POST_SOLUTION_POST__LOCATION);
		createEAttribute(optiPostSolutionPostEClass, OPTI_POST_SOLUTION_POST__NR_SHIFTS);
		createEAttribute(optiPostSolutionPostEClass, OPTI_POST_SOLUTION_POST__DESCRIPTION);
		createEOperation(optiPostSolutionPostEClass, OPTI_POST_SOLUTION_POST___ADD_SHIFT__SHIFT);

		optiPostSolutionEmployeeEClass = createEClass(OPTI_POST_SOLUTION_EMPLOYEE);
		createEReference(optiPostSolutionEmployeeEClass, OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS);
		createEReference(optiPostSolutionEmployeeEClass, OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE);
		createEAttribute(optiPostSolutionEmployeeEClass, OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS);
		createEAttribute(optiPostSolutionEmployeeEClass, OPTI_POST_SOLUTION_EMPLOYEE__DESCRIPTION);
		createEAttribute(optiPostSolutionEmployeeEClass, OPTI_POST_SOLUTION_EMPLOYEE__IN_POST);

		optiPostSolutionShiftEClass = createEClass(OPTI_POST_SOLUTION_SHIFT);
		createEReference(optiPostSolutionShiftEClass, OPTI_POST_SOLUTION_SHIFT__SHIFT);
		createEAttribute(optiPostSolutionShiftEClass, OPTI_POST_SOLUTION_SHIFT__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpreadsheetpoiPackage theSpreadsheetpoiPackage = (SpreadsheetpoiPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetpoiPackage.eNS_URI);
		SolvercplexPackage theSolvercplexPackage = (SolvercplexPackage)EPackage.Registry.INSTANCE.getEPackage(SolvercplexPackage.eNS_URI);
		SolverglpkPackage theSolverglpkPackage = (SolverglpkPackage)EPackage.Registry.INSTANCE.getEPackage(SolverglpkPackage.eNS_URI);
		SolverPackage theSolverPackage = (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);
		SpreadsheetPackage theSpreadsheetPackage = (SpreadsheetPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lpOptiPostFlowEClass.getESuperTypes().add(theSolverPackage.getGenerator());
		lpRootEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpJobEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpPrecedenceEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpEmployeeEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		jobsImporterSpreadsheetEClass.getESuperTypes().add(this.getJobsImporter());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_SubDomains(), this.getDomain(), null, "SubDomains", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Shifts(), this.getShift(), null, "Shifts", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Employees(), this.getEmployee(), null, "Employees", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Locations(), this.getLocation(), null, "Locations", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Scenarios(), this.getScenario(), null, "Scenarios", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_JobsImporter(), this.getJobsImporter(), this.getJobsImporter_Domain(), "JobsImporter", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Spreadsheets(), theSpreadsheetpoiPackage.getSpreadsheetPOI(), null, "Spreadsheets", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftEClass, Shift.class, "Shift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShift_Location(), this.getLocation(), null, "Location", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShift_Employee(), this.getEmployee(), null, "Employee", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_ShiftDate(), ecorePackage.getEDate(), "ShiftDate", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_ShiftStart(), ecorePackage.getEDate(), "ShiftStart", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_ShiftEnd(), ecorePackage.getEDate(), "ShiftEnd", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Shift.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_EmployeeID(), ecorePackage.getEString(), "EmployeeID", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Color(), ecorePackage.getEInt(), "Color", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_LocationID(), ecorePackage.getEString(), "LocationID", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_LpOptiPostFlows(), this.getLpOptiPostFlow(), this.getLpOptiPostFlow_Scenario(), "LpOptiPostFlows", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedShifts(), this.getShift(), null, "SelectedShifts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Solutions(), this.getOptiPostSolution(), this.getOptiPostSolution_Scenario(), "Solutions", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_AbsoluteMinEmployeeNrJob(), ecorePackage.getEInt(), "AbsoluteMinEmployeeNrJob", "2", 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_AbsoluteMaxEmployeeNrJobs(), ecorePackage.getEInt(), "AbsoluteMaxEmployeeNrJobs", "15", 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_MaxOverlapPredecessor(), ecorePackage.getEFloat(), "MaxOverlapPredecessor", "0.25", 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_MaxOverlapSuccessor(), ecorePackage.getEFloat(), "MaxOverlapSuccessor", "0.25", 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_CplexSolver(), theSolvercplexPackage.getSolverCplex(), null, "CplexSolver", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_GLPKSolver(), theSolverglpkPackage.getSolverGLPK(), null, "GLPKSolver", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpOptiPostFlowEClass, LpOptiPostFlow.class, "LpOptiPostFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpOptiPostFlow_LpRoot(), this.getLpRoot(), this.getLpRoot_LpOptiPostFlow(), "LpRoot", null, 0, 1, LpOptiPostFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpOptiPostFlow_Scenario(), this.getScenario(), this.getScenario_LpOptiPostFlows(), "Scenario", null, 0, 1, LpOptiPostFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpOptiPostFlow_GoalNofEmployees(), theSolverPackage.getGeneratorLpGoal(), null, "GoalNofEmployees", null, 0, 1, LpOptiPostFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRootEClass, LpRoot.class, "LpRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpRoot_Jobs(), this.getLpJob(), this.getLpJob_LpRoot(), "Jobs", null, 0, -1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpRoot_LpOptiPostFlow(), this.getLpOptiPostFlow(), this.getLpOptiPostFlow_LpRoot(), "LpOptiPostFlow", null, 0, 1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpRoot_LpEmployees(), this.getLpEmployee(), this.getLpEmployee_LpRoot(), "LpEmployees", null, 0, -1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpJobEClass, LpJob.class, "LpJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpJob_Shift(), this.getShift(), null, "Shift", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_JobsAfter(), this.getLpPrecedence(), this.getLpPrecedence_JobBefore(), "JobsAfter", null, 0, -1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_JobsBefore(), this.getLpPrecedence(), this.getLpPrecedence_JobAfter(), "JobsBefore", null, 0, -1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLpJob_StartOfMonth(), ecorePackage.getEBoolean(), "StartOfMonth", null, 0, 1, LpJob.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLpJob_EndOfMonth(), ecorePackage.getEBoolean(), "EndOfMonth", null, 0, 1, LpJob.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_LpRoot(), this.getLpRoot(), this.getLpRoot_Jobs(), "LpRoot", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_LpEmployee(), this.getLpEmployee(), this.getLpEmployee_LpJobs(), "LpEmployee", null, 1, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_VarInPost(), theSolverPackage.getGeneratorLpVar(), null, "VarInPost", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_ConsIsFollowedInPost(), theSolverPackage.getGeneratorLpCons(), null, "ConsIsFollowedInPost", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_ConsIsPrecededInPost(), theSolverPackage.getGeneratorLpCons(), null, "ConsIsPrecededInPost", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_VarIsFirstInPost(), theSolverPackage.getGeneratorLpVar(), null, "VarIsFirstInPost", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_VarIsLastInPost(), theSolverPackage.getGeneratorLpVar(), null, "VarIsLastInPost", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpPrecedenceEClass, LpPrecedence.class, "LpPrecedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpPrecedence_JobBefore(), this.getLpJob(), this.getLpJob_JobsAfter(), "JobBefore", null, 1, 1, LpPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpPrecedence_JobAfter(), this.getLpJob(), this.getLpJob_JobsBefore(), "JobAfter", null, 1, 1, LpPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpPrecedence_VarInPost(), theSolverPackage.getGeneratorLpVar(), null, "VarInPost", null, 0, 1, LpPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpEmployeeEClass, LpEmployee.class, "LpEmployee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpEmployee_LpRoot(), this.getLpRoot(), this.getLpRoot_LpEmployees(), "LpRoot", null, 0, 1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpEmployee_LpJobs(), this.getLpJob(), this.getLpJob_LpEmployee(), "LpJobs", null, 0, -1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpEmployee_Employee(), this.getEmployee(), null, "Employee", null, 1, 1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLpEmployee_MinNrJobs(), ecorePackage.getEInt(), "MinNrJobs", "5", 0, 1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpEmployee_VarInPost(), theSolverPackage.getGeneratorLpVar(), null, "VarInPost", null, 0, 1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpEmployee_ConsEnoughJobsInPost(), theSolverPackage.getGeneratorLpCons(), null, "ConsEnoughJobsInPost", null, 0, 1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobsImporterEClass, JobsImporter.class, "JobsImporter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobsImporter_Domain(), this.getDomain(), this.getDomain_JobsImporter(), "Domain", null, 0, 1, JobsImporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJobsImporter__FormatWorkerID__int(), ecorePackage.getEString(), "formatWorkerID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "idAsInt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobsImporter__GetOrCreateEmployee__String(), this.getEmployee(), "getOrCreateEmployee", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobsImporter__GetOrCreateLocation__String_String(), this.getLocation(), "getOrCreateLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobsImporter__CreateJob__Employee_Location_Date_Date_Date(), this.getShift(), "createJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployee(), "employee", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "shiftDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "shiftStart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "shiftEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobsImporter__ImportJobs(), null, "importJobs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobsImporterSpreadsheetEClass, JobsImporterSpreadsheet.class, "JobsImporterSpreadsheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobsImporterSpreadsheet_Spreadsheet(), theSpreadsheetPackage.getSpreadsheet(), null, "Spreadsheet", null, 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_DataSheetNr(), ecorePackage.getEInt(), "DataSheetNr", "0", 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_WorkerIdColNr(), ecorePackage.getEInt(), "WorkerIdColNr", null, 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_LocationIdColNr(), ecorePackage.getEInt(), "LocationIdColNr", "10", 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_JobDateColNr(), ecorePackage.getEInt(), "JobDateColNr", "12", 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_JobStartColNr(), ecorePackage.getEInt(), "JobStartColNr", "3", 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_JobEndColNr(), ecorePackage.getEInt(), "JobEndColNr", "4", 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_LocationDescriptionColNr(), ecorePackage.getEInt(), "LocationDescriptionColNr", "9", 0, 1, JobsImporterSpreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobsImporterSpreadsheet_Description(), ecorePackage.getEString(), "Description", null, 0, 1, JobsImporterSpreadsheet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(optiPostSolutionEClass, OptiPostSolution.class, "OptiPostSolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptiPostSolution_Lp(), this.getLpOptiPostFlow(), null, "Lp", null, 0, 1, OptiPostSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptiPostSolution_Posts(), this.getOptiPostSolutionPost(), null, "Posts", null, 0, -1, OptiPostSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptiPostSolution_Employees(), this.getOptiPostSolutionEmployee(), null, "Employees", null, 0, -1, OptiPostSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolution_NrEmployees(), ecorePackage.getEInt(), "NrEmployees", null, 0, 1, OptiPostSolution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolution_Description(), ecorePackage.getEString(), "Description", null, 0, 1, OptiPostSolution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolution_EmployeesInPost(), ecorePackage.getEInt(), "EmployeesInPost", null, 0, 1, OptiPostSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolution_ShiftsInPost(), ecorePackage.getEInt(), "ShiftsInPost", null, 0, 1, OptiPostSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptiPostSolution_Scenario(), this.getScenario(), this.getScenario_Solutions(), "Scenario", null, 0, 1, OptiPostSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optiPostSolutionPostEClass, OptiPostSolutionPost.class, "OptiPostSolutionPost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptiPostSolutionPost_Shifts(), this.getOptiPostSolutionShift(), null, "Shifts", null, 0, -1, OptiPostSolutionPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptiPostSolutionPost_Location(), this.getLocation(), null, "Location", null, 0, 1, OptiPostSolutionPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolutionPost_NrShifts(), ecorePackage.getEInt(), "NrShifts", null, 0, 1, OptiPostSolutionPost.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolutionPost_Description(), ecorePackage.getEString(), "Description", null, 0, 1, OptiPostSolutionPost.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOptiPostSolutionPost__AddShift__Shift(), this.getOptiPostSolutionShift(), "addShift", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getShift(), "shift", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optiPostSolutionEmployeeEClass, OptiPostSolutionEmployee.class, "OptiPostSolutionEmployee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptiPostSolutionEmployee_Shifts(), this.getOptiPostSolutionShift(), null, "Shifts", null, 0, -1, OptiPostSolutionEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptiPostSolutionEmployee_Employee(), this.getEmployee(), null, "Employee", null, 0, 1, OptiPostSolutionEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolutionEmployee_NrShifts(), ecorePackage.getEInt(), "NrShifts", null, 0, 1, OptiPostSolutionEmployee.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolutionEmployee_Description(), ecorePackage.getEString(), "Description", null, 0, 1, OptiPostSolutionEmployee.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolutionEmployee_InPost(), ecorePackage.getEBoolean(), "InPost", null, 0, 1, OptiPostSolutionEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optiPostSolutionShiftEClass, OptiPostSolutionShift.class, "OptiPostSolutionShift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptiPostSolutionShift_Shift(), this.getShift(), null, "Shift", null, 0, 1, OptiPostSolutionShift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptiPostSolutionShift_Description(), ecorePackage.getEString(), "Description", null, 0, 1, OptiPostSolutionShift.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //G4SOptiPostPackageImpl
