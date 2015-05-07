/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jobs Importer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporter()
 * @model abstract="true"
 * @generated
 */
public interface JobsImporter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String formatWorkerID(int idAsInt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Employee getOrCreateEmployee(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Location getOrCreateLocation(String id, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Shift createJob(Employee employee, Location location, Date shiftDate, Date shiftStart, Date shiftEnd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void import_();

} // JobsImporter
