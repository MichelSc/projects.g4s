/**
 */
package com.misc.projects.g4s.G4SOptiPost.provider;


import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;

import com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.projects.g4s.G4SOptiPost.JobsImporterSpreadsheet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobsImporterSpreadsheetItemProvider extends JobsImporterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobsImporterSpreadsheetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSpreadsheetPropertyDescriptor(object);
			addDataSheetNrPropertyDescriptor(object);
			addWorkerIdColNrPropertyDescriptor(object);
			addLocationIdColNrPropertyDescriptor(object);
			addJobDateColNrPropertyDescriptor(object);
			addJobStartColNrPropertyDescriptor(object);
			addJobEndColNrPropertyDescriptor(object);
			addLocationDescriptionColNrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Spreadsheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpreadsheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_Spreadsheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_Spreadsheet_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__SPREADSHEET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Sheet Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSheetNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_DataSheetNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_DataSheetNr_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Worker Id Col Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkerIdColNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_WorkerIdColNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_WorkerIdColNr_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location Id Col Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationIdColNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_LocationIdColNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_LocationIdColNr_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Date Col Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobDateColNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_JobDateColNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_JobDateColNr_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Start Col Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobStartColNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_JobStartColNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_JobStartColNr_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Job End Col Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobEndColNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_JobEndColNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_JobEndColNr_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location Description Col Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationDescriptionColNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobsImporterSpreadsheet_LocationDescriptionColNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobsImporterSpreadsheet_LocationDescriptionColNr_feature", "_UI_JobsImporterSpreadsheet_type"),
				 G4SOptiPostPackage.Literals.JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		JobsImporterSpreadsheet jobsImporterSpreadsheet = (JobsImporterSpreadsheet)object;
		return getString("_UI_JobsImporterSpreadsheet_type") + " " + jobsImporterSpreadsheet.getDataSheetNr();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(JobsImporterSpreadsheet.class)) {
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__DATA_SHEET_NR:
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__WORKER_ID_COL_NR:
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_ID_COL_NR:
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_DATE_COL_NR:
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_START_COL_NR:
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__JOB_END_COL_NR:
			case G4SOptiPostPackage.JOBS_IMPORTER_SPREADSHEET__LOCATION_DESCRIPTION_COL_NR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
