/**
 */
package com.misc.projects.g4s.G4SOptiPost.util;

import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunParams;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorTuple;

import com.misc.projects.g4s.G4SOptiPost.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage
 * @generated
 */
public class G4SOptiPostAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static G4SOptiPostPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G4SOptiPostAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = G4SOptiPostPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected G4SOptiPostSwitch<Adapter> modelSwitch =
		new G4SOptiPostSwitch<Adapter>() {
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseShift(Shift object) {
				return createShiftAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseLpOptiPostFlow(LpOptiPostFlow object) {
				return createLpOptiPostFlowAdapter();
			}
			@Override
			public Adapter caseLpRoot(LpRoot object) {
				return createLpRootAdapter();
			}
			@Override
			public Adapter caseLpJob(LpJob object) {
				return createLpJobAdapter();
			}
			@Override
			public Adapter caseLpPrecedence(LpPrecedence object) {
				return createLpPrecedenceAdapter();
			}
			@Override
			public Adapter caseLpEmployee(LpEmployee object) {
				return createLpEmployeeAdapter();
			}
			@Override
			public Adapter caseJobsImporter(JobsImporter object) {
				return createJobsImporterAdapter();
			}
			@Override
			public Adapter caseJobsImporterSpreadsheet(JobsImporterSpreadsheet object) {
				return createJobsImporterSpreadsheetAdapter();
			}
			@Override
			public Adapter caseOptiPostSolution(OptiPostSolution object) {
				return createOptiPostSolutionAdapter();
			}
			@Override
			public Adapter caseOptiPostSolutionPost(OptiPostSolutionPost object) {
				return createOptiPostSolutionPostAdapter();
			}
			@Override
			public Adapter caseOptiPostSolutionEmployee(OptiPostSolutionEmployee object) {
				return createOptiPostSolutionEmployeeAdapter();
			}
			@Override
			public Adapter caseOptiPostSolutionShift(OptiPostSolutionShift object) {
				return createOptiPostSolutionShiftAdapter();
			}
			@Override
			public Adapter caseRunParams(RunParams object) {
				return createRunParamsAdapter();
			}
			@Override
			public Adapter caseRun(Run object) {
				return createRunAdapter();
			}
			@Override
			public Adapter caseGenerator(Generator object) {
				return createGeneratorAdapter();
			}
			@Override
			public Adapter caseGeneratorElement(GeneratorElement object) {
				return createGeneratorElementAdapter();
			}
			@Override
			public Adapter caseGeneratorTuple(GeneratorTuple object) {
				return createGeneratorTupleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.Shift
	 * @generated
	 */
	public Adapter createShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow <em>Lp Opti Post Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow
	 * @generated
	 */
	public Adapter createLpOptiPostFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.LpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpRoot
	 * @generated
	 */
	public Adapter createLpRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.LpJob <em>Lp Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpJob
	 * @generated
	 */
	public Adapter createLpJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence <em>Lp Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpPrecedence
	 * @generated
	 */
	public Adapter createLpPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.LpEmployee <em>Lp Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.LpEmployee
	 * @generated
	 */
	public Adapter createLpEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter <em>Jobs Importer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporter
	 * @generated
	 */
	public Adapter createJobsImporterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet <em>Jobs Importer Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet
	 * @generated
	 */
	public Adapter createJobsImporterSpreadsheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution <em>Opti Post Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.OptiPostSolution
	 * @generated
	 */
	public Adapter createOptiPostSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost <em>Opti Post Solution Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost
	 * @generated
	 */
	public Adapter createOptiPostSolutionPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee <em>Opti Post Solution Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee
	 * @generated
	 */
	public Adapter createOptiPostSolutionEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift <em>Opti Post Solution Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift
	 * @generated
	 */
	public Adapter createOptiPostSolutionShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.RunParams <em>Run Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.RunParams
	 * @generated
	 */
	public Adapter createRunParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.Run
	 * @generated
	 */
	public Adapter createRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorElement <em>Generator Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorElement
	 * @generated
	 */
	public Adapter createGeneratorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorTuple <em>Generator Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple
	 * @generated
	 */
	public Adapter createGeneratorTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //G4SOptiPostAdapterFactory
