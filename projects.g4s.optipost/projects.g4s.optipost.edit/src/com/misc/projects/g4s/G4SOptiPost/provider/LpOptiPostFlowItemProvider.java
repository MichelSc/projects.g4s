/**
 */
package com.misc.projects.g4s.G4SOptiPost.provider;


import com.misc.common.moplaf.solver.provider.GeneratorItemProvider;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
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
 * This is the item provider adapter for a {@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LpOptiPostFlowItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpOptiPostFlowItemProvider(AdapterFactory adapterFactory) {
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

			addMaxOverlapPredecessorPropertyDescriptor(object);
			addMaxOverlapSuccessorPropertyDescriptor(object);
			addAbsoluteMinEmployeeNrJobPropertyDescriptor(object);
			addAbsoluteMaxEmployeeNrJobsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Overlap Predecessor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOverlapPredecessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpOptiPostFlow_MaxOverlapPredecessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpOptiPostFlow_MaxOverlapPredecessor_feature", "_UI_LpOptiPostFlow_type"),
				 G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__MAX_OVERLAP_PREDECESSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__40G4SPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Overlap Successor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOverlapSuccessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpOptiPostFlow_MaxOverlapSuccessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpOptiPostFlow_MaxOverlapSuccessor_feature", "_UI_LpOptiPostFlow_type"),
				 G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__MAX_OVERLAP_SUCCESSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__40G4SPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Absolute Min Employee Nr Job feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbsoluteMinEmployeeNrJobPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpOptiPostFlow_AbsoluteMinEmployeeNrJob_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpOptiPostFlow_AbsoluteMinEmployeeNrJob_feature", "_UI_LpOptiPostFlow_type"),
				 G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__ABSOLUTE_MIN_EMPLOYEE_NR_JOB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__40G4SPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Absolute Max Employee Nr Jobs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbsoluteMaxEmployeeNrJobsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LpOptiPostFlow_AbsoluteMaxEmployeeNrJobs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LpOptiPostFlow_AbsoluteMaxEmployeeNrJobs_feature", "_UI_LpOptiPostFlow_type"),
				 G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__40G4SPropertyCategory"),
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
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__LP_ROOT);
			childrenFeatures.add(G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__CPLEX_SOLVER);
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
	 * This returns LpOptiPostFlow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LpOptiPostFlow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LpOptiPostFlow)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_LpOptiPostFlow_type") :
			getString("_UI_LpOptiPostFlow_type") + " " + label;
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

		switch (notification.getFeatureID(LpOptiPostFlow.class)) {
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MAX_OVERLAP_PREDECESSOR:
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MAX_OVERLAP_SUCCESSOR:
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__ABSOLUTE_MIN_EMPLOYEE_NR_JOB:
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
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
				(G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__LP_ROOT,
				 G4SOptiPostFactory.eINSTANCE.createLpRoot()));

		newChildDescriptors.add
			(createChildParameter
				(G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW__CPLEX_SOLVER,
				 SolvercplexFactory.eINSTANCE.createSolverCplex()));
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
