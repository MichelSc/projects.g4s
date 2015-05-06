/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.LpEmployee;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import com.misc.projects.g4s.G4SOptiPost.Scenario;
import com.misc.projects.g4s.G4SOptiPost.Shift;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
		SolverPackage.eINSTANCE.eClass();

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
	public EAttribute getShift_ShiftStart() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_ShiftEnd() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getLpOptiPostFlow_MinOverlapPredecessor() {
		return (EAttribute)lpOptiPostFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLpOptiPostFlow_MinOverlapSuccessor() {
		return (EAttribute)lpOptiPostFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpOptiPostFlow_Scenario() {
		return (EReference)lpOptiPostFlowEClass.getEStructuralFeatures().get(3);
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
	public EReference getLpRoot_Precedences() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_Jobs() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_LpOptiPostFlow() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_LpEmployee() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(3);
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
	public EReference getLpPrecedence_LpRoot() {
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

		shiftEClass = createEClass(SHIFT);
		createEReference(shiftEClass, SHIFT__LOCATION);
		createEReference(shiftEClass, SHIFT__EMPLOYEE);
		createEAttribute(shiftEClass, SHIFT__SHIFT_START);
		createEAttribute(shiftEClass, SHIFT__SHIFT_END);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__EMPLOYEE_ID);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LOCATION_ID);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__LP_OPTI_POST_FLOWS);
		createEReference(scenarioEClass, SCENARIO__SELECTED_SHIFTS);
		createEAttribute(scenarioEClass, SCENARIO__NAME);

		lpOptiPostFlowEClass = createEClass(LP_OPTI_POST_FLOW);
		createEReference(lpOptiPostFlowEClass, LP_OPTI_POST_FLOW__LP_ROOT);
		createEAttribute(lpOptiPostFlowEClass, LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR);
		createEAttribute(lpOptiPostFlowEClass, LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR);
		createEReference(lpOptiPostFlowEClass, LP_OPTI_POST_FLOW__SCENARIO);

		lpRootEClass = createEClass(LP_ROOT);
		createEReference(lpRootEClass, LP_ROOT__PRECEDENCES);
		createEReference(lpRootEClass, LP_ROOT__JOBS);
		createEReference(lpRootEClass, LP_ROOT__LP_OPTI_POST_FLOW);
		createEReference(lpRootEClass, LP_ROOT__LP_EMPLOYEE);

		lpJobEClass = createEClass(LP_JOB);
		createEReference(lpJobEClass, LP_JOB__SHIFT);
		createEReference(lpJobEClass, LP_JOB__JOBS_AFTER);
		createEReference(lpJobEClass, LP_JOB__JOBS_BEFORE);
		createEAttribute(lpJobEClass, LP_JOB__START_OF_MONTH);
		createEAttribute(lpJobEClass, LP_JOB__END_OF_MONTH);
		createEReference(lpJobEClass, LP_JOB__LP_ROOT);
		createEReference(lpJobEClass, LP_JOB__LP_EMPLOYEE);

		lpPrecedenceEClass = createEClass(LP_PRECEDENCE);
		createEReference(lpPrecedenceEClass, LP_PRECEDENCE__JOB_BEFORE);
		createEReference(lpPrecedenceEClass, LP_PRECEDENCE__JOB_AFTER);
		createEReference(lpPrecedenceEClass, LP_PRECEDENCE__LP_ROOT);

		lpEmployeeEClass = createEClass(LP_EMPLOYEE);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__LP_ROOT);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__LP_JOBS);
		createEReference(lpEmployeeEClass, LP_EMPLOYEE__EMPLOYEE);
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
		SolverPackage theSolverPackage = (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lpOptiPostFlowEClass.getESuperTypes().add(theSolverPackage.getGenerator());
		lpRootEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpJobEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpPrecedenceEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_SubDomains(), this.getDomain(), null, "SubDomains", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Shifts(), this.getShift(), null, "Shifts", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Employees(), this.getEmployee(), null, "Employees", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Locations(), this.getLocation(), null, "Locations", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Scenarios(), this.getScenario(), null, "Scenarios", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftEClass, Shift.class, "Shift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShift_Location(), this.getLocation(), null, "Location", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShift_Employee(), this.getEmployee(), null, "Employee", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_ShiftStart(), ecorePackage.getEDate(), "ShiftStart", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_ShiftEnd(), ecorePackage.getEDate(), "ShiftEnd", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_EmployeeID(), ecorePackage.getEString(), "EmployeeID", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_LocationID(), ecorePackage.getEString(), "LocationID", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_LpOptiPostFlows(), this.getLpOptiPostFlow(), this.getLpOptiPostFlow_Scenario(), "LpOptiPostFlows", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedShifts(), this.getShift(), null, "SelectedShifts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpOptiPostFlowEClass, LpOptiPostFlow.class, "LpOptiPostFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpOptiPostFlow_LpRoot(), this.getLpRoot(), this.getLpRoot_LpOptiPostFlow(), "LpRoot", null, 0, 1, LpOptiPostFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLpOptiPostFlow_MinOverlapPredecessor(), ecorePackage.getEFloat(), "MinOverlapPredecessor", "0.25", 0, 1, LpOptiPostFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLpOptiPostFlow_MinOverlapSuccessor(), ecorePackage.getEFloat(), "MinOverlapSuccessor", "0.25", 0, 1, LpOptiPostFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpOptiPostFlow_Scenario(), this.getScenario(), this.getScenario_LpOptiPostFlows(), "Scenario", null, 0, 1, LpOptiPostFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRootEClass, LpRoot.class, "LpRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpRoot_Precedences(), this.getLpPrecedence(), this.getLpPrecedence_LpRoot(), "Precedences", null, 0, -1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpRoot_Jobs(), this.getLpJob(), this.getLpJob_LpRoot(), "Jobs", null, 0, -1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpRoot_LpOptiPostFlow(), this.getLpOptiPostFlow(), this.getLpOptiPostFlow_LpRoot(), "LpOptiPostFlow", null, 0, 1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpRoot_LpEmployee(), this.getLpEmployee(), this.getLpEmployee_LpRoot(), "LpEmployee", null, 0, -1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpJobEClass, LpJob.class, "LpJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpJob_Shift(), this.getShift(), null, "Shift", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_JobsAfter(), this.getLpPrecedence(), this.getLpPrecedence_JobBefore(), "JobsAfter", null, 0, -1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_JobsBefore(), this.getLpPrecedence(), this.getLpPrecedence_JobAfter(), "JobsBefore", null, 0, -1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLpJob_StartOfMonth(), ecorePackage.getEBoolean(), "StartOfMonth", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLpJob_EndOfMonth(), ecorePackage.getEBoolean(), "EndOfMonth", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_LpRoot(), this.getLpRoot(), this.getLpRoot_Jobs(), "LpRoot", null, 0, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpJob_LpEmployee(), this.getLpEmployee(), this.getLpEmployee_LpJobs(), "LpEmployee", null, 1, 1, LpJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpPrecedenceEClass, LpPrecedence.class, "LpPrecedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpPrecedence_JobBefore(), this.getLpJob(), this.getLpJob_JobsAfter(), "JobBefore", null, 1, 1, LpPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpPrecedence_JobAfter(), this.getLpJob(), this.getLpJob_JobsBefore(), "JobAfter", null, 1, 1, LpPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpPrecedence_LpRoot(), this.getLpRoot(), this.getLpRoot_Precedences(), "LpRoot", null, 0, 1, LpPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpEmployeeEClass, LpEmployee.class, "LpEmployee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpEmployee_LpRoot(), this.getLpRoot(), this.getLpRoot_LpEmployee(), "LpRoot", null, 0, 1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpEmployee_LpJobs(), this.getLpJob(), this.getLpJob_LpEmployee(), "LpJobs", null, 0, -1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpEmployee_Employee(), this.getEmployee(), null, "Employee", null, 1, 1, LpEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //G4SOptiPostPackageImpl
