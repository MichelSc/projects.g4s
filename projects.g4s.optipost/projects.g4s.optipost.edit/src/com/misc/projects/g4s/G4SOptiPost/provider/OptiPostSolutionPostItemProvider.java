/**
 */
package com.misc.projects.g4s.G4SOptiPost.provider;



import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesProvider;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
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
 * This is the item provider adapter for a {@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimeLinesProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class OptiPostSolutionPostItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemTimeLinesProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptiPostSolutionPostItemProvider(AdapterFactory adapterFactory) {
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

			addLocationPropertyDescriptor(object);
			addNrShiftsPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptiPostSolutionPost_Location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionPost_Location_feature", "_UI_OptiPostSolutionPost_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_POST__LOCATION,
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
				 getString("_UI_OptiPostSolutionPost_NrShifts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionPost_NrShifts_feature", "_UI_OptiPostSolutionPost_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_POST__NR_SHIFTS,
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
				 getString("_UI_OptiPostSolutionPost_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptiPostSolutionPost_Description_feature", "_UI_OptiPostSolutionPost_type"),
				 G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_POST__DESCRIPTION,
				 false,
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
			childrenFeatures.add(G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_POST__SHIFTS);
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
	 * This returns OptiPostSolutionPost.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/pin56.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OptiPostSolutionPost)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_OptiPostSolutionPost_type") :
			getString("_UI_OptiPostSolutionPost_type") + " " + label;
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

		switch (notification.getFeatureID(OptiPostSolutionPost.class)) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__NR_SHIFTS:
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__SHIFTS:
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
				(G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_POST__SHIFTS,
				 G4SOptiPostFactory.eINSTANCE.createOptiPostSolutionShift()));
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

	@Override
	public Collection<?> getTimeLines(Object element) {
		// one timeLine for this Post
		return null;
	}

	@Override
	public String getText(Object element, Object timeline) {
		return this.getText(element);
	}

	@Override
	public Collection<?> getEvents(Object element, Object timeline) {
		OptiPostSolutionPost post = (OptiPostSolutionPost)element;
		return post.getShifts(); 
	}

	@Override
	public Date getStart(Object element, Object timeline, Object event, Object interval) {
		OptiPostSolutionShift shift = (OptiPostSolutionShift) event;
		return shift.getShift().getShiftStart();
	}

	@Override
	public Date getEnd(Object element, Object timeline, Object event, Object interval) {
		OptiPostSolutionShift shift = (OptiPostSolutionShift) event;
		return shift.getShift().getShiftEnd();
	}

	
	/**
	 * 
	 */
	private URI SOLUTION_SHIFT_FOREGROUND = Color.COLOR_BLACK.toURI();
	
	@Override
	public Object getForeground(Object element, Object timeline, Object event, Object interval) {
		return SOLUTION_SHIFT_FOREGROUND;
	}

	@Override
	public Object getBackground(Object element, Object timeline, Object event, Object interval) {
		OptiPostSolutionShift shift = (OptiPostSolutionShift) event;
		int rgb = shift.getShift().getEmployee().getColor();
		Color color = new Color(rgb);
		return color.toURI();
	}

	@Override
	public String getText(Object element, Object timeline, Object event, Object interval) {
		OptiPostSolutionShift shift = (OptiPostSolutionShift) event;
		return shift.getDescription();
	}
}
