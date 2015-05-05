/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.Scenario;
import com.misc.projects.g4s.G4SOptiPost.Shift;

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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl#getSubDomains <em>Sub Domains</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl#getShifts <em>Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.DomainImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getSubDomains() <em>Sub Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> subDomains;

	/**
	 * The cached value of the '{@link #getShifts() <em>Shifts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<Shift> shifts;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getSubDomains() {
		if (subDomains == null) {
			subDomains = new EObjectContainmentEList<Domain>(Domain.class, this, G4SOptiPostPackage.DOMAIN__SUB_DOMAINS);
		}
		return subDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shift> getShifts() {
		if (shifts == null) {
			shifts = new EObjectContainmentEList<Shift>(Shift.class, this, G4SOptiPostPackage.DOMAIN__SHIFTS);
		}
		return shifts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, G4SOptiPostPackage.DOMAIN__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, G4SOptiPostPackage.DOMAIN__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, G4SOptiPostPackage.DOMAIN__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.DOMAIN__SUB_DOMAINS:
				return ((InternalEList<?>)getSubDomains()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.DOMAIN__SHIFTS:
				return ((InternalEList<?>)getShifts()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.DOMAIN__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.DOMAIN__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.DOMAIN__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case G4SOptiPostPackage.DOMAIN__SUB_DOMAINS:
				return getSubDomains();
			case G4SOptiPostPackage.DOMAIN__SHIFTS:
				return getShifts();
			case G4SOptiPostPackage.DOMAIN__EMPLOYEES:
				return getEmployees();
			case G4SOptiPostPackage.DOMAIN__LOCATIONS:
				return getLocations();
			case G4SOptiPostPackage.DOMAIN__SCENARIOS:
				return getScenarios();
			case G4SOptiPostPackage.DOMAIN__NAME:
				return getName();
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
			case G4SOptiPostPackage.DOMAIN__SUB_DOMAINS:
				getSubDomains().clear();
				getSubDomains().addAll((Collection<? extends Domain>)newValue);
				return;
			case G4SOptiPostPackage.DOMAIN__SHIFTS:
				getShifts().clear();
				getShifts().addAll((Collection<? extends Shift>)newValue);
				return;
			case G4SOptiPostPackage.DOMAIN__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case G4SOptiPostPackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case G4SOptiPostPackage.DOMAIN__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case G4SOptiPostPackage.DOMAIN__NAME:
				setName((String)newValue);
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
			case G4SOptiPostPackage.DOMAIN__SUB_DOMAINS:
				getSubDomains().clear();
				return;
			case G4SOptiPostPackage.DOMAIN__SHIFTS:
				getShifts().clear();
				return;
			case G4SOptiPostPackage.DOMAIN__EMPLOYEES:
				getEmployees().clear();
				return;
			case G4SOptiPostPackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				return;
			case G4SOptiPostPackage.DOMAIN__SCENARIOS:
				getScenarios().clear();
				return;
			case G4SOptiPostPackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
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
			case G4SOptiPostPackage.DOMAIN__SUB_DOMAINS:
				return subDomains != null && !subDomains.isEmpty();
			case G4SOptiPostPackage.DOMAIN__SHIFTS:
				return shifts != null && !shifts.isEmpty();
			case G4SOptiPostPackage.DOMAIN__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case G4SOptiPostPackage.DOMAIN__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case G4SOptiPostPackage.DOMAIN__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case G4SOptiPostPackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
