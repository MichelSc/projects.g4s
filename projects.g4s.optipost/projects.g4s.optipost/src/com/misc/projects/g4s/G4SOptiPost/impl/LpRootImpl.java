/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpEmployee;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import com.misc.projects.g4s.G4SOptiPost.Scenario;
import com.misc.projects.g4s.G4SOptiPost.Shift;
import java.util.Collection;
import java.util.HashMap;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl#getPrecedences <em>Precedences</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl#getLpOptiPostFlow <em>Lp Opti Post Flow</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpRootImpl#getLpEmployees <em>Lp Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LpRootImpl extends GeneratorTupleImpl implements LpRoot {
	/**
	 * The cached value of the '{@link #getPrecedences() <em>Precedences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedences()
	 * @generated
	 * @ordered
	 */
	protected EList<LpPrecedence> precedences;

	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<LpJob> jobs;

	/**
	 * The cached value of the '{@link #getLpEmployees() <em>Lp Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<LpEmployee> lpEmployees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.LP_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpPrecedence> getPrecedences() {
		if (precedences == null) {
			precedences = new EObjectContainmentWithInverseEList<LpPrecedence>(LpPrecedence.class, this, G4SOptiPostPackage.LP_ROOT__PRECEDENCES, G4SOptiPostPackage.LP_PRECEDENCE__LP_ROOT);
		}
		return precedences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpJob> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentWithInverseEList<LpJob>(LpJob.class, this, G4SOptiPostPackage.LP_ROOT__JOBS, G4SOptiPostPackage.LP_JOB__LP_ROOT);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpOptiPostFlow getLpOptiPostFlow() {
		if (eContainerFeatureID() != G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW) return null;
		return (LpOptiPostFlow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpOptiPostFlow(LpOptiPostFlow newLpOptiPostFlow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLpOptiPostFlow, G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpOptiPostFlow(LpOptiPostFlow newLpOptiPostFlow) {
		if (newLpOptiPostFlow != eInternalContainer() || (eContainerFeatureID() != G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW && newLpOptiPostFlow != null)) {
			if (EcoreUtil.isAncestor(this, newLpOptiPostFlow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLpOptiPostFlow != null)
				msgs = ((InternalEObject)newLpOptiPostFlow).eInverseAdd(this, G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT, LpOptiPostFlow.class, msgs);
			msgs = basicSetLpOptiPostFlow(newLpOptiPostFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW, newLpOptiPostFlow, newLpOptiPostFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpEmployee> getLpEmployees() {
		if (lpEmployees == null) {
			lpEmployees = new EObjectContainmentWithInverseEList<LpEmployee>(LpEmployee.class, this, G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES, G4SOptiPostPackage.LP_EMPLOYEE__LP_ROOT);
		}
		return lpEmployees;
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
			case G4SOptiPostPackage.LP_ROOT__PRECEDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrecedences()).basicAdd(otherEnd, msgs);
			case G4SOptiPostPackage.LP_ROOT__JOBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobs()).basicAdd(otherEnd, msgs);
			case G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLpOptiPostFlow((LpOptiPostFlow)otherEnd, msgs);
			case G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLpEmployees()).basicAdd(otherEnd, msgs);
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
			case G4SOptiPostPackage.LP_ROOT__PRECEDENCES:
				return ((InternalEList<?>)getPrecedences()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.LP_ROOT__JOBS:
				return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW:
				return basicSetLpOptiPostFlow(null, msgs);
			case G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES:
				return ((InternalEList<?>)getLpEmployees()).basicRemove(otherEnd, msgs);
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
			case G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW:
				return eInternalContainer().eInverseRemove(this, G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT, LpOptiPostFlow.class, msgs);
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
			case G4SOptiPostPackage.LP_ROOT__PRECEDENCES:
				return getPrecedences();
			case G4SOptiPostPackage.LP_ROOT__JOBS:
				return getJobs();
			case G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW:
				return getLpOptiPostFlow();
			case G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES:
				return getLpEmployees();
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
			case G4SOptiPostPackage.LP_ROOT__PRECEDENCES:
				getPrecedences().clear();
				getPrecedences().addAll((Collection<? extends LpPrecedence>)newValue);
				return;
			case G4SOptiPostPackage.LP_ROOT__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends LpJob>)newValue);
				return;
			case G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW:
				setLpOptiPostFlow((LpOptiPostFlow)newValue);
				return;
			case G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES:
				getLpEmployees().clear();
				getLpEmployees().addAll((Collection<? extends LpEmployee>)newValue);
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
			case G4SOptiPostPackage.LP_ROOT__PRECEDENCES:
				getPrecedences().clear();
				return;
			case G4SOptiPostPackage.LP_ROOT__JOBS:
				getJobs().clear();
				return;
			case G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW:
				setLpOptiPostFlow((LpOptiPostFlow)null);
				return;
			case G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES:
				getLpEmployees().clear();
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
			case G4SOptiPostPackage.LP_ROOT__PRECEDENCES:
				return precedences != null && !precedences.isEmpty();
			case G4SOptiPostPackage.LP_ROOT__JOBS:
				return jobs != null && !jobs.isEmpty();
			case G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW:
				return getLpOptiPostFlow() != null;
			case G4SOptiPostPackage.LP_ROOT__LP_EMPLOYEES:
				return lpEmployees != null && !lpEmployees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void generateTuples() {
		super.generateTuples();
		HashMap<Employee, LpEmployee> employees = new HashMap<Employee, LpEmployee>();
		// Jobs
		LpRoot root = this;
		LpOptiPostFlow generator = root.getLpOptiPostFlow();
		Scenario scenario = generator.getScenario();
        for (Shift shift: scenario.getSelectedShifts()){
        	LpJob lpjob = G4SOptiPostFactory.eINSTANCE.createLpJob();
        	lpjob.setShift(shift);
        	lpjob.setCode(shift.getDescription());
        	Employee employee = shift.getEmployee();
        	LpEmployee lpemployee = employees.get(employee);
        	if ( lpemployee == null){
            	lpemployee = G4SOptiPostFactory.eINSTANCE.createLpEmployee();
            	lpemployee.setEmployee(employee);
            	lpemployee.setCode(employee.getEmployeeID());
            	employees.put(employee, lpemployee);
            	this.getLpEmployees().add(lpemployee);
        	}
        	lpjob.setLpEmployee(lpemployee);
        	this.getJobs().add(lpjob);  // owning
        }  // traverse the selected shifts
	}  // generateTuples
} //LpRootImpl
