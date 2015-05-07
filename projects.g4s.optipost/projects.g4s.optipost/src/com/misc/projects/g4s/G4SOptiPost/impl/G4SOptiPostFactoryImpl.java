/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class G4SOptiPostFactoryImpl extends EFactoryImpl implements G4SOptiPostFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static G4SOptiPostFactory init() {
		try {
			G4SOptiPostFactory theG4SOptiPostFactory = (G4SOptiPostFactory)EPackage.Registry.INSTANCE.getEFactory(G4SOptiPostPackage.eNS_URI);
			if (theG4SOptiPostFactory != null) {
				return theG4SOptiPostFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new G4SOptiPostFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G4SOptiPostFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case G4SOptiPostPackage.DOMAIN: return createDomain();
			case G4SOptiPostPackage.SHIFT: return createShift();
			case G4SOptiPostPackage.EMPLOYEE: return createEmployee();
			case G4SOptiPostPackage.LOCATION: return createLocation();
			case G4SOptiPostPackage.SCENARIO: return createScenario();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW: return createLpOptiPostFlow();
			case G4SOptiPostPackage.LP_ROOT: return createLpRoot();
			case G4SOptiPostPackage.LP_JOB: return createLpJob();
			case G4SOptiPostPackage.LP_PRECEDENCE: return createLpPrecedence();
			case G4SOptiPostPackage.LP_EMPLOYEE: return createLpEmployee();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET: return createJobsImporterSpreadsheet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift createShift() {
		ShiftImpl shift = new ShiftImpl();
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpOptiPostFlow createLpOptiPostFlow() {
		LpOptiPostFlowImpl lpOptiPostFlow = new LpOptiPostFlowImpl();
		return lpOptiPostFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpRoot createLpRoot() {
		LpRootImpl lpRoot = new LpRootImpl();
		return lpRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpJob createLpJob() {
		LpJobImpl lpJob = new LpJobImpl();
		return lpJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpPrecedence createLpPrecedence() {
		LpPrecedenceImpl lpPrecedence = new LpPrecedenceImpl();
		return lpPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpEmployee createLpEmployee() {
		LpEmployeeImpl lpEmployee = new LpEmployeeImpl();
		return lpEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobsImporterSpreadsheet createJobsImporterSpreadsheet() {
		JobsImporterSpreadsheetImpl jobsImporterSpreadsheet = new JobsImporterSpreadsheetImpl();
		return jobsImporterSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G4SOptiPostPackage getG4SOptiPostPackage() {
		return (G4SOptiPostPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static G4SOptiPostPackage getPackage() {
		return G4SOptiPostPackage.eINSTANCE;
	}

} //G4SOptiPostFactoryImpl
