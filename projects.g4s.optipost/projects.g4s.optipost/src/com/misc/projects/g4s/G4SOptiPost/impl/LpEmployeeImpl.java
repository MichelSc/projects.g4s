/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpEmployee;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getLpJobs <em>Lp Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getMinNrJobs <em>Min Nr Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LpEmployeeImpl extends GeneratorTupleImpl implements LpEmployee {
	/**
	 * The cached value of the '{@link #getLpJobs() <em>Lp Jobs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<LpJob> lpJobs;

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
	 * The default value of the '{@link #getMinNrJobs() <em>Min Nr Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNrJobs()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_NR_JOBS_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getMinNrJobs() <em>Min Nr Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNrJobs()
	 * @generated
	 * @ordered
	 */
	protected int minNrJobs = MIN_NR_JOBS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpEmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.LP_EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpRoot getLpRoot() {
		if (eContainerFeatureID() != G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT) return null;
		return (LpRoot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpRoot(LpRoot newLpRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLpRoot, G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpRoot(LpRoot newLpRoot) {
		if (newLpRoot != eInternalContainer() || (eContainerFeatureID() != G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT && newLpRoot != null)) {
			if (EcoreUtil.isAncestor(this, newLpRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLpRoot != null)
				msgs = ((InternalEObject)newLpRoot).eInverseAdd(this, G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES, LpRoot.class, msgs);
			msgs = basicSetLpRoot(newLpRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT, newLpRoot, newLpRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpJob> getLpJobs() {
		if (lpJobs == null) {
			lpJobs = new EObjectWithInverseResolvingEList<LpJob>(LpJob.class, this, G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS, G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE);
		}
		return lpJobs;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.LP_EMPLOYEE__EMPLOYEE, oldEmployee, employee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_EMPLOYEE__EMPLOYEE, oldEmployee, employee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinNrJobs() {
		return minNrJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinNrJobs(int newMinNrJobs) {
		int oldMinNrJobs = minNrJobs;
		minNrJobs = newMinNrJobs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_EMPLOYEE__MIN_NR_JOBS, oldMinNrJobs, minNrJobs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLpRoot((LpRoot)otherEnd, msgs);
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLpJobs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT:
				return basicSetLpRoot(null, msgs);
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS:
				return ((InternalEList<?>)getLpJobs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT:
				return eInternalContainer().eInverseRemove(this, G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES, LpRoot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT:
				return getLpRoot();
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS:
				return getLpJobs();
			case G4SOptiPostPackage.LP_EMPLOYEE__EMPLOYEE:
				if (resolve) return getEmployee();
				return basicGetEmployee();
			case G4SOptiPostPackage.LP_EMPLOYEE__MIN_NR_JOBS:
				return getMinNrJobs();
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
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT:
				setLpRoot((LpRoot)newValue);
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS:
				getLpJobs().clear();
				getLpJobs().addAll((Collection<? extends LpJob>)newValue);
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__EMPLOYEE:
				setEmployee((Employee)newValue);
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__MIN_NR_JOBS:
				setMinNrJobs((Integer)newValue);
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
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT:
				setLpRoot((LpRoot)null);
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS:
				getLpJobs().clear();
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__EMPLOYEE:
				setEmployee((Employee)null);
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__MIN_NR_JOBS:
				setMinNrJobs(MIN_NR_JOBS_EDEFAULT);
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
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT:
				return getLpRoot() != null;
			case G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS:
				return lpJobs != null && !lpJobs.isEmpty();
			case G4SOptiPostPackage.LP_EMPLOYEE__EMPLOYEE:
				return employee != null;
			case G4SOptiPostPackage.LP_EMPLOYEE__MIN_NR_JOBS:
				return minNrJobs != MIN_NR_JOBS_EDEFAULT;
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
		result.append(" (MinNrJobs: ");
		result.append(minNrJobs);
		result.append(')');
		return result.toString();
	}

} //LpEmployeeImpl
