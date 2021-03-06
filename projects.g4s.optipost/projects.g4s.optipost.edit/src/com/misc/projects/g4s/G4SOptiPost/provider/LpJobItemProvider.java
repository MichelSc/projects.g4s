/**
 */
package com.misc.projects.g4s.G4SOptiPost.provider;


import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.provider.GeneratorTupleItemProvider;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpJob;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.projects.g4s.G4SOptiPost.LpJob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LpJobItemProvider extends GeneratorTupleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpJobItemProvider(AdapterFactory adapterFactory) {
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

			addShiftPropertyDescriptor(object);
			addJobsAfterPropertyDescriptor(object);
			addJobsBeforePropertyDescriptor(object);
			addStartOfMonthPropertyDescriptor(object);
			addEndOfMonthPropertyDescriptor(object);
			addLpEmployeePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Shift feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShiftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpJob_Shift_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpJob_Shift_feature", "_UI_LpJob_type"),
				 G4SOptiPostPackage.Literals.LP_JOB__SHIFT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jobs After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobsAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpJob_JobsAfter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpJob_JobsAfter_feature", "_UI_LpJob_type"),
				 G4SOptiPostPackage.Literals.LP_JOB__JOBS_AFTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jobs Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobsBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpJob_JobsBefore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpJob_JobsBefore_feature", "_UI_LpJob_type"),
				 G4SOptiPostPackage.Literals.LP_JOB__JOBS_BEFORE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Of Month feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartOfMonthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpJob_StartOfMonth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpJob_StartOfMonth_feature", "_UI_LpJob_type"),
				 G4SOptiPostPackage.Literals.LP_JOB__START_OF_MONTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Of Month feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndOfMonthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpJob_EndOfMonth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpJob_EndOfMonth_feature", "_UI_LpJob_type"),
				 G4SOptiPostPackage.Literals.LP_JOB__END_OF_MONTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lp Employee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLpEmployeePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpJob_LpEmployee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpJob_LpEmployee_feature", "_UI_LpJob_type"),
				 G4SOptiPostPackage.Literals.LP_JOB__LP_EMPLOYEE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__SHIFT);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__JOBS_AFTER);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__JOBS_BEFORE);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__VAR_IN_POST);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__CONS_IS_FOLLOWED_IN_POST);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__CONS_IS_PRECEDED_IN_POST);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__VAR_IS_FIRST_IN_POST);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_JOB__VAR_IS_LAST_IN_POST);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LpJob)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LpJob_type") :
			getString("_UI_LpJob_type") + " " + label;
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

		switch (notification.getFeatureID(LpJob.class)) {
			case G4SOptiPostPackage.LP_JOB__START_OF_MONTH:
			case G4SOptiPostPackage.LP_JOB__END_OF_MONTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case G4SOptiPostPackage.LP_JOB__VAR_IN_POST:
			case G4SOptiPostPackage.LP_JOB__CONS_IS_FOLLOWED_IN_POST:
			case G4SOptiPostPackage.LP_JOB__CONS_IS_PRECEDED_IN_POST:
			case G4SOptiPostPackage.LP_JOB__VAR_IS_FIRST_IN_POST:
			case G4SOptiPostPackage.LP_JOB__VAR_IS_LAST_IN_POST:
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
				(G4SOptiPostPackage.Literals.LP_JOB__JOBS_BEFORE,
				 G4SOptiPostFactory.eINSTANCE.createLpPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.LP_JOB__VAR_IN_POST,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.LP_JOB__CONS_IS_FOLLOWED_IN_POST,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.LP_JOB__CONS_IS_PRECEDED_IN_POST,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.LP_JOB__VAR_IS_FIRST_IN_POST,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.LP_JOB__VAR_IS_LAST_IN_POST,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == G4SOptiPostPackage.Literals.LP_JOB__VAR_IN_POST ||
			childFeature == G4SOptiPostPackage.Literals.LP_JOB__VAR_IS_FIRST_IN_POST ||
			childFeature == G4SOptiPostPackage.Literals.LP_JOB__VAR_IS_LAST_IN_POST ||
			childFeature == G4SOptiPostPackage.Literals.LP_JOB__CONS_IS_FOLLOWED_IN_POST ||
			childFeature == G4SOptiPostPackage.Literals.LP_JOB__CONS_IS_PRECEDED_IN_POST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
