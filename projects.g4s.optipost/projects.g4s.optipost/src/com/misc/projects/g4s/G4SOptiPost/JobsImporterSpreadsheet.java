/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.spreadsheet.Spreadsheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jobs Importer Spreadsheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getDataSheetNr <em>Data Sheet Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getWorkerIdColNr <em>Worker Id Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationIdColNr <em>Location Id Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobDateColNr <em>Job Date Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobStartColNr <em>Job Start Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobEndColNr <em>Job End Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationDescriptionColNr <em>Location Description Col Nr</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet()
 * @model
 * @generated
 */
public interface JobsImporterSpreadsheet extends JobsImporter {
	/**
	 * Returns the value of the '<em><b>Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet</em>' reference.
	 * @see #setSpreadsheet(Spreadsheet)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_Spreadsheet()
	 * @model
	 * @generated
	 */
	Spreadsheet getSpreadsheet();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getSpreadsheet <em>Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet</em>' reference.
	 * @see #getSpreadsheet()
	 * @generated
	 */
	void setSpreadsheet(Spreadsheet value);

	/**
	 * Returns the value of the '<em><b>Data Sheet Nr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sheet Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sheet Nr</em>' attribute.
	 * @see #setDataSheetNr(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_DataSheetNr()
	 * @model default="0"
	 * @generated
	 */
	int getDataSheetNr();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getDataSheetNr <em>Data Sheet Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sheet Nr</em>' attribute.
	 * @see #getDataSheetNr()
	 * @generated
	 */
	void setDataSheetNr(int value);

	/**
	 * Returns the value of the '<em><b>Worker Id Col Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Id Col Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Id Col Nr</em>' attribute.
	 * @see #setWorkerIdColNr(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_WorkerIdColNr()
	 * @model
	 * @generated
	 */
	int getWorkerIdColNr();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getWorkerIdColNr <em>Worker Id Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Id Col Nr</em>' attribute.
	 * @see #getWorkerIdColNr()
	 * @generated
	 */
	void setWorkerIdColNr(int value);

	/**
	 * Returns the value of the '<em><b>Location Id Col Nr</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Id Col Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Id Col Nr</em>' attribute.
	 * @see #setLocationIdColNr(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_LocationIdColNr()
	 * @model default="10"
	 * @generated
	 */
	int getLocationIdColNr();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationIdColNr <em>Location Id Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Id Col Nr</em>' attribute.
	 * @see #getLocationIdColNr()
	 * @generated
	 */
	void setLocationIdColNr(int value);

	/**
	 * Returns the value of the '<em><b>Job Date Col Nr</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Date Col Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Date Col Nr</em>' attribute.
	 * @see #setJobDateColNr(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_JobDateColNr()
	 * @model default="12"
	 * @generated
	 */
	int getJobDateColNr();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobDateColNr <em>Job Date Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Date Col Nr</em>' attribute.
	 * @see #getJobDateColNr()
	 * @generated
	 */
	void setJobDateColNr(int value);

	/**
	 * Returns the value of the '<em><b>Job Start Col Nr</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Start Col Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Start Col Nr</em>' attribute.
	 * @see #setJobStartColNr(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_JobStartColNr()
	 * @model default="3"
	 * @generated
	 */
	int getJobStartColNr();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobStartColNr <em>Job Start Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Start Col Nr</em>' attribute.
	 * @see #getJobStartColNr()
	 * @generated
	 */
	void setJobStartColNr(int value);

	/**
	 * Returns the value of the '<em><b>Job End Col Nr</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job End Col Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job End Col Nr</em>' attribute.
	 * @see #setJobEndColNr(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_JobEndColNr()
	 * @model default="4"
	 * @generated
	 */
	int getJobEndColNr();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getJobEndColNr <em>Job End Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job End Col Nr</em>' attribute.
	 * @see #getJobEndColNr()
	 * @generated
	 */
	void setJobEndColNr(int value);

	/**
	 * Returns the value of the '<em><b>Location Description Col Nr</b></em>' attribute.
	 * The default value is <code>"9"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Description Col Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Description Col Nr</em>' attribute.
	 * @see #setLocationDescriptionColNr(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getJobsImporterSpreadsheet_LocationDescriptionColNr()
	 * @model default="9"
	 * @generated
	 */
	int getLocationDescriptionColNr();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet#getLocationDescriptionColNr <em>Location Description Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Description Col Nr</em>' attribute.
	 * @see #getLocationDescriptionColNr()
	 * @generated
	 */
	void setLocationDescriptionColNr(int value);

} // JobsImporterSpreadsheet
