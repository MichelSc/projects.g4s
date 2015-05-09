/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift;
import com.misc.projects.g4s.G4SOptiPost.Shift;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opti Post Solution Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionPostImpl#getShifts <em>Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionPostImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionPostImpl#getNrShifts <em>Nr Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionPostImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptiPostSolutionPostImpl extends MinimalEObjectImpl.Container implements OptiPostSolutionPost {
	/**
	 * The cached value of the '{@link #getShifts() <em>Shifts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<OptiPostSolutionShift> shifts;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getNrShifts() <em>Nr Shifts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrShifts()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_SHIFTS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptiPostSolutionPostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_POST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptiPostSolutionShift> getShifts() {
		if (shifts == null) {
			shifts = new EObjectContainmentEList<OptiPostSolutionShift>(OptiPostSolutionShift.class, this, G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__SHIFTS);
		}
		return shifts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNrShifts() {
		return this.getShifts()==null ? 0 : this.getShifts().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%s (%d)", 
				                          this.getLocation().getLocationID(),
				                          this.getNrShifts());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public OptiPostSolutionShift addShift(Shift shift) {
		OptiPostSolutionShift newshift= G4SOptiPostFactory.eINSTANCE.createOptiPostSolutionShift();
		newshift.setShift(shift);
		this.getShifts().add(newshift);
		return newshift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__SHIFTS:
				return ((InternalEList<?>)getShifts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__SHIFTS:
				return getShifts();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__NR_SHIFTS:
				return getNrShifts();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__SHIFTS:
				getShifts().clear();
				getShifts().addAll((Collection<? extends OptiPostSolutionShift>)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__LOCATION:
				setLocation((Location)newValue);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__SHIFTS:
				getShifts().clear();
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__LOCATION:
				setLocation((Location)null);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__SHIFTS:
				return shifts != null && !shifts.isEmpty();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__LOCATION:
				return location != null;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__NR_SHIFTS:
				return getNrShifts() != NR_SHIFTS_EDEFAULT;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_POST___ADD_SHIFT__SHIFT:
				return addShift((Shift)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OptiPostSolutionPostImpl
