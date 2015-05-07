/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.Location;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LocationImpl#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LocationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getLocationID() <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationID() <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected String locationID = LOCATION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationID() {
		return locationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationID(String newLocationID) {
		String oldLocationID = locationID;
		locationID = newLocationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LOCATION__LOCATION_ID, oldLocationID, locationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LOCATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.LOCATION__LOCATION_ID:
				return getLocationID();
			case G4SOptiPostPackage.LOCATION__DESCRIPTION:
				return getDescription();
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
			case G4SOptiPostPackage.LOCATION__LOCATION_ID:
				setLocationID((String)newValue);
				return;
			case G4SOptiPostPackage.LOCATION__DESCRIPTION:
				setDescription((String)newValue);
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
			case G4SOptiPostPackage.LOCATION__LOCATION_ID:
				setLocationID(LOCATION_ID_EDEFAULT);
				return;
			case G4SOptiPostPackage.LOCATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case G4SOptiPostPackage.LOCATION__LOCATION_ID:
				return LOCATION_ID_EDEFAULT == null ? locationID != null : !LOCATION_ID_EDEFAULT.equals(locationID);
			case G4SOptiPostPackage.LOCATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (LocationID: ");
		result.append(locationID);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
