/**
 */
package com.misc.projects.g4s.G4SOptiPost.provider;


import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee;

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
 * This is the item provider adapter for a {@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OptiPostSolutionEmployeeItemProvider 
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
	public OptiPostSolutionEmployeeItemProvider(AdapterFactory adapterFactory) {
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

			addShiftsPropertyDescriptor(object);
			addEmployeePropertyDescriptor(object);
			addNrShiftsPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addInPostPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Shifts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShiftsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptiPostSolutionEmployee_Shifts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionEmployee_Shifts_feature", "_UI_OptiPostSolutionEmployee_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Employee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmployeePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptiPostSolutionEmployee_Employee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionEmployee_Employee_feature", "_UI_OptiPostSolutionEmployee_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Shifts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrShiftsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptiPostSolutionEmployee_NrShifts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionEmployee_NrShifts_feature", "_UI_OptiPostSolutionEmployee_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptiPostSolutionEmployee_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionEmployee_Description_feature", "_UI_OptiPostSolutionEmployee_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Post feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInPostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptiPostSolutionEmployee_InPost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionEmployee_InPost_feature", "_UI_OptiPostSolutionEmployee_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE__IN_POST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS);
			childrenFeatures.add(G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE);
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
	 * This returns OptiPostSolutionEmployee.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/worker18.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OptiPostSolutionEmployee)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_OptiPostSolutionEmployee_type") :
			getString("_UI_OptiPostSolutionEmployee_type") + " " + label;
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

		switch (notification.getFeatureID(OptiPostSolutionEmployee.class)) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS:
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__DESCRIPTION:
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__IN_POST:
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

}
