/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet;
import com.misc.projects.g4s.G4SOptiPost.Location;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jobs Importer Spreadsheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getDataSheetNr <em>Data Sheet Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getWorkerIdColNr <em>Worker Id Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getLocationIdColNr <em>Location Id Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getJobDateColNr <em>Job Date Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getJobStartColNr <em>Job Start Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getJobEndColNr <em>Job End Col Nr</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterSpreadsheetImpl#getLocationDescriptionColNr <em>Location Description Col Nr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobsImporterSpreadsheetImpl extends JobsImporterImpl implements JobsImporterSpreadsheet {
	/**
	 * The cached value of the '{@link #getSpreadsheet() <em>Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected Spreadsheet spreadsheet;

	/**
	 * The default value of the '{@link #getDataSheetNr() <em>Data Sheet Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSheetNr()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_SHEET_NR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDataSheetNr() <em>Data Sheet Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSheetNr()
	 * @generated
	 * @ordered
	 */
	protected int dataSheetNr = DATA_SHEET_NR_EDEFAULT;
	/**
	 * The default value of the '{@link #getWorkerIdColNr() <em>Worker Id Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerIdColNr()
	 * @generated
	 * @ordered
	 */
	protected static final int WORKER_ID_COL_NR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getWorkerIdColNr() <em>Worker Id Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerIdColNr()
	 * @generated
	 * @ordered
	 */
	protected int workerIdColNr = WORKER_ID_COL_NR_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocationIdColNr() <em>Location Id Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIdColNr()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCATION_ID_COL_NR_EDEFAULT = 10;
	/**
	 * The cached value of the '{@link #getLocationIdColNr() <em>Location Id Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIdColNr()
	 * @generated
	 * @ordered
	 */
	protected int locationIdColNr = LOCATION_ID_COL_NR_EDEFAULT;
	/**
	 * The default value of the '{@link #getJobDateColNr() <em>Job Date Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDateColNr()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_DATE_COL_NR_EDEFAULT = 12;
	/**
	 * The cached value of the '{@link #getJobDateColNr() <em>Job Date Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDateColNr()
	 * @generated
	 * @ordered
	 */
	protected int jobDateColNr = JOB_DATE_COL_NR_EDEFAULT;
	/**
	 * The default value of the '{@link #getJobStartColNr() <em>Job Start Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobStartColNr()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_START_COL_NR_EDEFAULT = 3;
	/**
	 * The cached value of the '{@link #getJobStartColNr() <em>Job Start Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobStartColNr()
	 * @generated
	 * @ordered
	 */
	protected int jobStartColNr = JOB_START_COL_NR_EDEFAULT;
	/**
	 * The default value of the '{@link #getJobEndColNr() <em>Job End Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobEndColNr()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_END_COL_NR_EDEFAULT = 4;
	/**
	 * The cached value of the '{@link #getJobEndColNr() <em>Job End Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobEndColNr()
	 * @generated
	 * @ordered
	 */
	protected int jobEndColNr = JOB_END_COL_NR_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocationDescriptionColNr() <em>Location Description Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDescriptionColNr()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCATION_DESCRIPTION_COL_NR_EDEFAULT = 9;
	/**
	 * The cached value of the '{@link #getLocationDescriptionColNr() <em>Location Description Col Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDescriptionColNr()
	 * @generated
	 * @ordered
	 */
	protected int locationDescriptionColNr = LOCATION_DESCRIPTION_COL_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobsImporterSpreadsheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spreadsheet getSpreadsheet() {
		if (spreadsheet != null && spreadsheet.eIsProxy()) {
			InternalEObject oldSpreadsheet = (InternalEObject)spreadsheet;
			spreadsheet = (Spreadsheet)eResolveProxy(oldSpreadsheet);
			if (spreadsheet != oldSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET, oldSpreadsheet, spreadsheet));
			}
		}
		return spreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spreadsheet basicGetSpreadsheet() {
		return spreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheet(Spreadsheet newSpreadsheet) {
		Spreadsheet oldSpreadsheet = spreadsheet;
		spreadsheet = newSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET, oldSpreadsheet, spreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataSheetNr() {
		return dataSheetNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSheetNr(int newDataSheetNr) {
		int oldDataSheetNr = dataSheetNr;
		dataSheetNr = newDataSheetNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR, oldDataSheetNr, dataSheetNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorkerIdColNr() {
		return workerIdColNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerIdColNr(int newWorkerIdColNr) {
		int oldWorkerIdColNr = workerIdColNr;
		workerIdColNr = newWorkerIdColNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR, oldWorkerIdColNr, workerIdColNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocationIdColNr() {
		return locationIdColNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationIdColNr(int newLocationIdColNr) {
		int oldLocationIdColNr = locationIdColNr;
		locationIdColNr = newLocationIdColNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR, oldLocationIdColNr, locationIdColNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobDateColNr() {
		return jobDateColNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobDateColNr(int newJobDateColNr) {
		int oldJobDateColNr = jobDateColNr;
		jobDateColNr = newJobDateColNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR, oldJobDateColNr, jobDateColNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobStartColNr() {
		return jobStartColNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobStartColNr(int newJobStartColNr) {
		int oldJobStartColNr = jobStartColNr;
		jobStartColNr = newJobStartColNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR, oldJobStartColNr, jobStartColNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobEndColNr() {
		return jobEndColNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobEndColNr(int newJobEndColNr) {
		int oldJobEndColNr = jobEndColNr;
		jobEndColNr = newJobEndColNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR, oldJobEndColNr, jobEndColNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocationDescriptionColNr() {
		return locationDescriptionColNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationDescriptionColNr(int newLocationDescriptionColNr) {
		int oldLocationDescriptionColNr = locationDescriptionColNr;
		locationDescriptionColNr = newLocationDescriptionColNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR, oldLocationDescriptionColNr, locationDescriptionColNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET:
				if (resolve) return getSpreadsheet();
				return basicGetSpreadsheet();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR:
				return getDataSheetNr();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR:
				return getWorkerIdColNr();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR:
				return getLocationIdColNr();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR:
				return getJobDateColNr();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR:
				return getJobStartColNr();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR:
				return getJobEndColNr();
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR:
				return getLocationDescriptionColNr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET:
				setSpreadsheet((Spreadsheet)newValue);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR:
				setDataSheetNr((Integer)newValue);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR:
				setWorkerIdColNr((Integer)newValue);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR:
				setLocationIdColNr((Integer)newValue);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR:
				setJobDateColNr((Integer)newValue);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR:
				setJobStartColNr((Integer)newValue);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR:
				setJobEndColNr((Integer)newValue);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR:
				setLocationDescriptionColNr((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET:
				setSpreadsheet((Spreadsheet)null);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR:
				setDataSheetNr(DATA_SHEET_NR_EDEFAULT);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR:
				setWorkerIdColNr(WORKER_ID_COL_NR_EDEFAULT);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR:
				setLocationIdColNr(LOCATION_ID_COL_NR_EDEFAULT);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR:
				setJobDateColNr(JOB_DATE_COL_NR_EDEFAULT);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR:
				setJobStartColNr(JOB_START_COL_NR_EDEFAULT);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR:
				setJobEndColNr(JOB_END_COL_NR_EDEFAULT);
				return;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR:
				setLocationDescriptionColNr(LOCATION_DESCRIPTION_COL_NR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET:
				return spreadsheet != null;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR:
				return dataSheetNr != DATA_SHEET_NR_EDEFAULT;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR:
				return workerIdColNr != WORKER_ID_COL_NR_EDEFAULT;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR:
				return locationIdColNr != LOCATION_ID_COL_NR_EDEFAULT;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR:
				return jobDateColNr != JOB_DATE_COL_NR_EDEFAULT;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR:
				return jobStartColNr != JOB_START_COL_NR_EDEFAULT;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR:
				return jobEndColNr != JOB_END_COL_NR_EDEFAULT;
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR:
				return locationDescriptionColNr != LOCATION_DESCRIPTION_COL_NR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DataSheetNr: ");
		result.append(dataSheetNr);
		result.append(", WorkerIdColNr: ");
		result.append(workerIdColNr);
		result.append(", LocationIdColNr: ");
		result.append(locationIdColNr);
		result.append(", JobDateColNr: ");
		result.append(jobDateColNr);
		result.append(", JobStartColNr: ");
		result.append(jobStartColNr);
		result.append(", JobEndColNr: ");
		result.append(jobEndColNr);
		result.append(", LocationDescriptionColNr: ");
		result.append(locationDescriptionColNr);
		result.append(')');
		return result.toString();
	}

	@Override
	public void importJobs() {
		Spreadsheet spreadsheet = this.getSpreadsheet();
		if ( spreadsheet == null) { return; }

		spreadsheet.readFile();
		
		Sheet sheet = spreadsheet.getSheet(this.getDataSheetNr());
		if ( sheet == null ) { return; }
		
		Column columnWorkerId    = sheet.getColumn(this.getWorkerIdColNr());
		Column columnLocationId  = sheet.getColumn(this.getLocationIdColNr());
		Column columnLocationDes = sheet.getColumn(this.getLocationDescriptionColNr());
		Column columnJobDate     = sheet.getColumn(this.getJobDateColNr());
		Column columnJobStart    = sheet.getColumn(this.getJobStartColNr());
		Column columnJobEnd      = sheet.getColumn(this.getJobEndColNr());
		
		for ( Row row : sheet.getRow() ){
			if ( row.getRowIndex()>0 ){
				// skip the first row
				
				int    workerid   = (int) row.getCell(columnWorkerId)   .getDoubleValue();
				String workerId = this.formatWorkerID(workerid);
				Employee employee = this.getOrCreateEmployee(workerId);
				
				String locationid = row.getCell(columnLocationId) .getStringValue();
				String locationde = row.getCell(columnLocationDes).getStringValue();
				Location location = this.getOrCreateLocation(locationid, locationde);
				
				String jobdateS    = row.getCell(columnJobDate).getStringValue();
				Date jobdate = this.stringToDate(jobdateS);
				
				String jobstartD   = row.getCell(columnJobStart).getStringValue();
				Date jobstart = this.stringToDate(jobstartD);
				
				String jobendS = row.getCell(columnJobEnd).getStringValue();
				Date jobend = this.stringToDate(jobendS);
				
				this.createJob(employee, location, jobdate, jobstart, jobend);
			}  // skip first row
		}  // traverse the rows
	}  // method import
	
	private static SimpleDateFormat formatterFromStringToDate= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	private Date stringToDate(String string){
		try {
			 
			Date date = formatterFromStringToDate.parse(string);
			return date;
	 
		} catch (ParseException e) {
			return null;
		}		
	}
	

} //JobsImporterSpreadsheetImpl
