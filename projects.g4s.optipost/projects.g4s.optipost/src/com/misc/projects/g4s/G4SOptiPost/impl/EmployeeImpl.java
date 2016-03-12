/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.EmployeeImpl#getEmployeeID <em>Employee ID</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.EmployeeImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getEmployeeID() <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeID()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeID() <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeID()
	 * @generated
	 * @ordered
	 */
	protected String employeeID = EMPLOYEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeID() {
		return employeeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeID(String newEmployeeID) {
		String oldEmployeeID = employeeID;
		employeeID = newEmployeeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.EMPLOYEE__EMPLOYEE_ID, oldEmployeeID, employeeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.EMPLOYEE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.EMPLOYEE__EMPLOYEE_ID:
				return getEmployeeID();
			case G4SOptiPostPackage.EMPLOYEE__COLOR:
				return getColor();
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
			case G4SOptiPostPackage.EMPLOYEE__EMPLOYEE_ID:
				setEmployeeID((String)newValue);
				return;
			case G4SOptiPostPackage.EMPLOYEE__COLOR:
				setColor((Integer)newValue);
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
			case G4SOptiPostPackage.EMPLOYEE__EMPLOYEE_ID:
				setEmployeeID(EMPLOYEE_ID_EDEFAULT);
				return;
			case G4SOptiPostPackage.EMPLOYEE__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case G4SOptiPostPackage.EMPLOYEE__EMPLOYEE_ID:
				return EMPLOYEE_ID_EDEFAULT == null ? employeeID != null : !EMPLOYEE_ID_EDEFAULT.equals(employeeID);
			case G4SOptiPostPackage.EMPLOYEE__COLOR:
				return color != COLOR_EDEFAULT;
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
		result.append(" (EmployeeID: ");
		result.append(employeeID);
		result.append(", Color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
