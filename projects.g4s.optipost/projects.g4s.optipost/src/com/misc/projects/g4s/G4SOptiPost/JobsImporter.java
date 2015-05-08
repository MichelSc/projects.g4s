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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporter()
 * @model abstract="true"
 * @generated
 */
public interface JobsImporter extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.Domain#getJobsImporter <em>Jobs Importer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporter_Domain()
	 * @see com.misc.projects.g4s.G4SOptiPost.Domain#getJobsImporter
	 * @model opposite="JobsImporter" transient="false"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporter#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

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
	void importJobs();

} // JobsImporter
