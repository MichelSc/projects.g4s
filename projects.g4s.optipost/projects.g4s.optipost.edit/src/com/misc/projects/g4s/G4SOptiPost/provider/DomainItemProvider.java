/**
 */
package com.misc.projects.g4s.G4SOptiPost.provider;


import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIFactory;
import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.projects.g4s.G4SOptiPost.Domain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Domain_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Domain_Name_feature", "_UI_Domain_type"),
				 G4SOptiPostPackage.Literals.DOMAIN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(G4SOptiPostPackage.Literals.DOMAIN__SUB_DOMAINS);
			childrenFeatures.add(G4SOptiPostPackage.Literals.DOMAIN__SCENARIOS);
			childrenFeatures.add(G4SOptiPostPackage.Literals.DOMAIN__JOBS_IMPORTER);
			childrenFeatures.add(G4SOptiPostPackage.Literals.DOMAIN__SPREADSHEETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Domain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/folder265.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Domain)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Domain_type") :
			getString("_UI_Domain_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Domain.class)) {
				// label refresh
			case G4SOptiPostPackage.DOMAIN__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
				// content refresh
			case G4SOptiPostPackage.DOMAIN__SHIFTS:
			case G4SOptiPostPackage.DOMAIN__EMPLOYEES:
			case G4SOptiPostPackage.DOMAIN__LOCATIONS:
			case G4SOptiPostPackage.DOMAIN__SUB_DOMAINS:
			case G4SOptiPostPackage.DOMAIN__SCENARIOS:
			case G4SOptiPostPackage.DOMAIN__JOBS_IMPORTER:
			case G4SOptiPostPackage.DOMAIN__SPREADSHEETS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.DOMAIN__SUB_DOMAINS,
				 G4SOptiPostFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.DOMAIN__SHIFTS,
				 G4SOptiPostFactory.eINSTANCE.createShift()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.DOMAIN__EMPLOYEES,
				 G4SOptiPostFactory.eINSTANCE.createEmployee()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.DOMAIN__LOCATIONS,
				 G4SOptiPostFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.DOMAIN__SCENARIOS,
				 G4SOptiPostFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.DOMAIN__JOBS_IMPORTER,
				 G4SOptiPostFactory.eINSTANCE.createJobsImporterSpreadsheet()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.DOMAIN__SPREADSHEETS,
				 SpreadsheetPOIFactory.eINSTANCE.createSpreadsheetPOI()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return G4SOptiPostEditPlugin.INSTANCE;
	}

	
	/* (non-Javadoc)
	 * Manage the children nodes 
	 * @see com.misc.common.moplaf.emf.edit.ui.provider.TransientItemProviderAdapter
	 */
	protected List<Object> children = null;
	
	protected void initChildren(){
		if ( children == null){
			Domain domain = (Domain) this.getTarget();
			children = new ArrayList<Object>();
			children.add(new DomainLocationsItemProvider(adapterFactory, domain));
			children.add(new DomainEmployeesItemProvider(adapterFactory, domain));
			children.add(new DomainShiftsItemProvider   (adapterFactory, domain));
		}
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		this.initChildren();
		Collection<Object> superchildren = (Collection<Object>) super.getChildren(object);
		superchildren.addAll(children);
		return superchildren;
	}
	
	public Object getLocations(){
		this.initChildren();
		return this.children.get(0);
	}

	public Object getEmployees(){
		this.initChildren();
		return this.children.get(1);
	}

	public Object getShifts(){
		this.initChildren();
		return this.children.get(2);
	}
}
