/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.JobsImporter;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.Shift;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jobs Importer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class JobsImporterImpl extends MinimalEObjectImpl.Container implements JobsImporter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobsImporterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.JOBS_IMPORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatWorkerID(int idAsInt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getOrCreateEmployee(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getOrCreateLocation(String id, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift createJob(Employee employee, Location location, Date shiftDate, Date shiftStart, Date shiftEnd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void import_() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case G4SOptiPostPackage.JOBS_IMPORTER___FORMAT_WORKER_ID__INT:
				return formatWorkerID((Integer)arguments.get(0));
			case G4SOptiPostPackage.JOBS_IMPORTER___GET_OR_CREATE_EMPLOYEE__STRING:
				return getOrCreateEmployee((String)arguments.get(0));
			case G4SOptiPostPackage.JOBS_IMPORTER___GET_OR_CREATE_LOCATION__STRING_STRING:
				return getOrCreateLocation((String)arguments.get(0), (String)arguments.get(1));
			case G4SOptiPostPackage.JOBS_IMPORTER___CREATE_JOB__EMPLOYEE_LOCATION_DATE_DATE_DATE:
				return createJob((Employee)arguments.get(0), (Location)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3), (Date)arguments.get(4));
			case G4SOptiPostPackage.JOBS_IMPORTER___IMPORT_:
				import_();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //JobsImporterImpl
