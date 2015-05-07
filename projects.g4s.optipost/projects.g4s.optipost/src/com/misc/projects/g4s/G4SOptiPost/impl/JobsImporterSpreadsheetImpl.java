/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.spreadsheet.Spreadsheet;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet;

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET:
				if (resolve) return getSpreadsheet();
				return basicGetSpreadsheet();
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
		}
		return super.eIsSet(featureID);
	}

} //JobsImporterSpreadsheetImpl
