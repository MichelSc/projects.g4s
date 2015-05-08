/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opti Post Solution Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionEmployeeImpl#getShifts <em>Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionEmployeeImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionEmployeeImpl#getNrShifts <em>Nr Shifts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptiPostSolutionEmployeeImpl extends MinimalEObjectImpl.Container implements OptiPostSolutionEmployee {
	/**
	 * The cached value of the '{@link #getShifts() <em>Shifts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<OptiPostSolutionShift> shifts;

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
	 * The default value of the '{@link #getNrShifts() <em>Nr Shifts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrShifts()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_SHIFTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrShifts() <em>Nr Shifts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrShifts()
	 * @generated
	 * @ordered
	 */
	protected int nrShifts = NR_SHIFTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptiPostSolutionEmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION_EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptiPostSolutionShift> getShifts() {
		if (shifts == null) {
			shifts = new EObjectResolvingEList<OptiPostSolutionShift>(OptiPostSolutionShift.class, this, G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS);
		}
		return shifts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE, oldEmployee, employee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE, oldEmployee, employee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrShifts() {
		return nrShifts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrShifts(int newNrShifts) {
		int oldNrShifts = nrShifts;
		nrShifts = newNrShifts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS, oldNrShifts, nrShifts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS:
				return getShifts();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE:
				if (resolve) return getEmployee();
				return basicGetEmployee();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS:
				return getNrShifts();
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS:
				getShifts().clear();
				getShifts().addAll((Collection<? extends OptiPostSolutionShift>)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE:
				setEmployee((Employee)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS:
				setNrShifts((Integer)newValue);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS:
				getShifts().clear();
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE:
				setEmployee((Employee)null);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS:
				setNrShifts(NR_SHIFTS_EDEFAULT);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__SHIFTS:
				return shifts != null && !shifts.isEmpty();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__EMPLOYEE:
				return employee != null;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION_EMPLOYEE__NR_SHIFTS:
				return nrShifts != NR_SHIFTS_EDEFAULT;
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
		result.append(" (NrShifts: ");
		result.append(nrShifts);
		result.append(')');
		return result.toString();
	}

} //OptiPostSolutionEmployeeImpl
