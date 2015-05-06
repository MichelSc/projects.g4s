/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.Shift;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl#getShiftStart <em>Shift Start</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl#getShiftEnd <em>Shift End</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ShiftImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShiftImpl extends MinimalEObjectImpl.Container implements Shift {
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
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected Employee employee;

	/**
	 * The default value of the '{@link #getShiftStart() <em>Shift Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIFT_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShiftStart() <em>Shift Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftStart()
	 * @generated
	 * @ordered
	 */
	protected Date shiftStart = SHIFT_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getShiftEnd() <em>Shift End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIFT_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShiftEnd() <em>Shift End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftEnd()
	 * @generated
	 * @ordered
	 */
	protected Date shiftEnd = SHIFT_END_EDEFAULT;

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
	protected ShiftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.SHIFT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.SHIFT__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SHIFT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getEmployee() {
		if (employee != null && employee.eIsProxy()) {
			InternalEObject oldEmployee = (InternalEObject)employee;
			employee = (Employee)eResolveProxy(oldEmployee);
			if (employee != oldEmployee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.SHIFT__EMPLOYEE, oldEmployee, employee));
			}
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetEmployee() {
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployee(Employee newEmployee) {
		Employee oldEmployee = employee;
		employee = newEmployee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SHIFT__EMPLOYEE, oldEmployee, employee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getShiftStart() {
		return shiftStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftStart(Date newShiftStart) {
		Date oldShiftStart = shiftStart;
		shiftStart = newShiftStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SHIFT__SHIFT_START, oldShiftStart, shiftStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getShiftEnd() {
		return shiftEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftEnd(Date newShiftEnd) {
		Date oldShiftEnd = shiftEnd;
		shiftEnd = newShiftEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SHIFT__SHIFT_END, oldShiftEnd, shiftEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String employeeid = this.getEmployee()==null ? null : this.getEmployee().getEmployeeID();
		String startasstring = this.getShiftStart()==null ? null : String.format("%1$tm", this.getShiftStart());
		String description = String.format("shift_%1$s_%2$s", startasstring, employeeid);
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.SHIFT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case G4SOptiPostPackage.SHIFT__EMPLOYEE:
				if (resolve) return getEmployee();
				return basicGetEmployee();
			case G4SOptiPostPackage.SHIFT__SHIFT_START:
				return getShiftStart();
			case G4SOptiPostPackage.SHIFT__SHIFT_END:
				return getShiftEnd();
			case G4SOptiPostPackage.SHIFT__DESCRIPTION:
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
			case G4SOptiPostPackage.SHIFT__LOCATION:
				setLocation((Location)newValue);
				return;
			case G4SOptiPostPackage.SHIFT__EMPLOYEE:
				setEmployee((Employee)newValue);
				return;
			case G4SOptiPostPackage.SHIFT__SHIFT_START:
				setShiftStart((Date)newValue);
				return;
			case G4SOptiPostPackage.SHIFT__SHIFT_END:
				setShiftEnd((Date)newValue);
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
			case G4SOptiPostPackage.SHIFT__LOCATION:
				setLocation((Location)null);
				return;
			case G4SOptiPostPackage.SHIFT__EMPLOYEE:
				setEmployee((Employee)null);
				return;
			case G4SOptiPostPackage.SHIFT__SHIFT_START:
				setShiftStart(SHIFT_START_EDEFAULT);
				return;
			case G4SOptiPostPackage.SHIFT__SHIFT_END:
				setShiftEnd(SHIFT_END_EDEFAULT);
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
			case G4SOptiPostPackage.SHIFT__LOCATION:
				return location != null;
			case G4SOptiPostPackage.SHIFT__EMPLOYEE:
				return employee != null;
			case G4SOptiPostPackage.SHIFT__SHIFT_START:
				return SHIFT_START_EDEFAULT == null ? shiftStart != null : !SHIFT_START_EDEFAULT.equals(shiftStart);
			case G4SOptiPostPackage.SHIFT__SHIFT_END:
				return SHIFT_END_EDEFAULT == null ? shiftEnd != null : !SHIFT_END_EDEFAULT.equals(shiftEnd);
			case G4SOptiPostPackage.SHIFT__DESCRIPTION:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ShiftStart: ");
		result.append(shiftStart);
		result.append(", ShiftEnd: ");
		result.append(shiftEnd);
		result.append(')');
		return result.toString();
	}

} //ShiftImpl
