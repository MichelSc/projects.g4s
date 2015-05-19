/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolution;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getLpOptiPostFlows <em>Lp Opti Post Flows</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getSelectedShifts <em>Selected Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getAbsoluteMinEmployeeNrJob <em>Absolute Min Employee Nr Job</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getAbsoluteMaxEmployeeNrJobs <em>Absolute Max Employee Nr Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getMaxOverlapPredecessor <em>Max Overlap Predecessor</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.ScenarioImpl#getMaxOverlapSuccessor <em>Max Overlap Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getLpOptiPostFlows() <em>Lp Opti Post Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpOptiPostFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<LpOptiPostFlow> lpOptiPostFlows;

	/**
	 * The cached value of the '{@link #getSelectedShifts() <em>Selected Shifts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<Shift> selectedShifts;

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
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<OptiPostSolution> solutions;

	/**
	 * The default value of the '{@link #getAbsoluteMinEmployeeNrJob() <em>Absolute Min Employee Nr Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteMinEmployeeNrJob()
	 * @generated
	 * @ordered
	 */
	protected static final int ABSOLUTE_MIN_EMPLOYEE_NR_JOB_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getAbsoluteMinEmployeeNrJob() <em>Absolute Min Employee Nr Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteMinEmployeeNrJob()
	 * @generated
	 * @ordered
	 */
	protected int absoluteMinEmployeeNrJob = ABSOLUTE_MIN_EMPLOYEE_NR_JOB_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteMaxEmployeeNrJobs() <em>Absolute Max Employee Nr Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteMaxEmployeeNrJobs()
	 * @generated
	 * @ordered
	 */
	protected static final int ABSOLUTE_MAX_EMPLOYEE_NR_JOBS_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getAbsoluteMaxEmployeeNrJobs() <em>Absolute Max Employee Nr Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteMaxEmployeeNrJobs()
	 * @generated
	 * @ordered
	 */
	protected int absoluteMaxEmployeeNrJobs = ABSOLUTE_MAX_EMPLOYEE_NR_JOBS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOverlapPredecessor() <em>Max Overlap Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOverlapPredecessor()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_OVERLAP_PREDECESSOR_EDEFAULT = 0.25F;

	/**
	 * The cached value of the '{@link #getMaxOverlapPredecessor() <em>Max Overlap Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOverlapPredecessor()
	 * @generated
	 * @ordered
	 */
	protected float maxOverlapPredecessor = MAX_OVERLAP_PREDECESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOverlapSuccessor() <em>Max Overlap Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOverlapSuccessor()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_OVERLAP_SUCCESSOR_EDEFAULT = 0.25F;

	/**
	 * The cached value of the '{@link #getMaxOverlapSuccessor() <em>Max Overlap Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOverlapSuccessor()
	 * @generated
	 * @ordered
	 */
	protected float maxOverlapSuccessor = MAX_OVERLAP_SUCCESSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpOptiPostFlow> getLpOptiPostFlows() {
		if (lpOptiPostFlows == null) {
			lpOptiPostFlows = new EObjectContainmentWithInverseEList<LpOptiPostFlow>(LpOptiPostFlow.class, this, G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS, G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO);
		}
		return lpOptiPostFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shift> getSelectedShifts() {
		if (selectedShifts == null) {
			selectedShifts = new EObjectResolvingEList<Shift>(Shift.class, this, G4SOptiPostPackage.SCENARIO__SELECTED_SHIFTS);
		}
		return selectedShifts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptiPostSolution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentWithInverseEList<OptiPostSolution>(OptiPostSolution.class, this, G4SOptiPostPackage.SCENARIO__SOLUTIONS, G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAbsoluteMinEmployeeNrJob() {
		return absoluteMinEmployeeNrJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteMinEmployeeNrJob(int newAbsoluteMinEmployeeNrJob) {
		int oldAbsoluteMinEmployeeNrJob = absoluteMinEmployeeNrJob;
		absoluteMinEmployeeNrJob = newAbsoluteMinEmployeeNrJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SCENARIO__ABSOLUTE_MIN_EMPLOYEE_NR_JOB, oldAbsoluteMinEmployeeNrJob, absoluteMinEmployeeNrJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAbsoluteMaxEmployeeNrJobs() {
		return absoluteMaxEmployeeNrJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteMaxEmployeeNrJobs(int newAbsoluteMaxEmployeeNrJobs) {
		int oldAbsoluteMaxEmployeeNrJobs = absoluteMaxEmployeeNrJobs;
		absoluteMaxEmployeeNrJobs = newAbsoluteMaxEmployeeNrJobs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SCENARIO__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS, oldAbsoluteMaxEmployeeNrJobs, absoluteMaxEmployeeNrJobs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxOverlapPredecessor() {
		return maxOverlapPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOverlapPredecessor(float newMaxOverlapPredecessor) {
		float oldMaxOverlapPredecessor = maxOverlapPredecessor;
		maxOverlapPredecessor = newMaxOverlapPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_PREDECESSOR, oldMaxOverlapPredecessor, maxOverlapPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxOverlapSuccessor() {
		return maxOverlapSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOverlapSuccessor(float newMaxOverlapSuccessor) {
		float oldMaxOverlapSuccessor = maxOverlapSuccessor;
		maxOverlapSuccessor = newMaxOverlapSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_SUCCESSOR, oldMaxOverlapSuccessor, maxOverlapSuccessor));
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
			case G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLpOptiPostFlows()).basicAdd(otherEnd, msgs);
			case G4SOptiPostPackage.SCENARIO__SOLUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolutions()).basicAdd(otherEnd, msgs);
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
			case G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS:
				return ((InternalEList<?>)getLpOptiPostFlows()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.SCENARIO__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
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
			case G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS:
				return getLpOptiPostFlows();
			case G4SOptiPostPackage.SCENARIO__SELECTED_SHIFTS:
				return getSelectedShifts();
			case G4SOptiPostPackage.SCENARIO__NAME:
				return getName();
			case G4SOptiPostPackage.SCENARIO__SOLUTIONS:
				return getSolutions();
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MIN_EMPLOYEE_NR_JOB:
				return getAbsoluteMinEmployeeNrJob();
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS:
				return getAbsoluteMaxEmployeeNrJobs();
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_PREDECESSOR:
				return getMaxOverlapPredecessor();
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_SUCCESSOR:
				return getMaxOverlapSuccessor();
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
			case G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS:
				getLpOptiPostFlows().clear();
				getLpOptiPostFlows().addAll((Collection<? extends LpOptiPostFlow>)newValue);
				return;
			case G4SOptiPostPackage.SCENARIO__SELECTED_SHIFTS:
				getSelectedShifts().clear();
				getSelectedShifts().addAll((Collection<? extends Shift>)newValue);
				return;
			case G4SOptiPostPackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case G4SOptiPostPackage.SCENARIO__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends OptiPostSolution>)newValue);
				return;
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MIN_EMPLOYEE_NR_JOB:
				setAbsoluteMinEmployeeNrJob((Integer)newValue);
				return;
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS:
				setAbsoluteMaxEmployeeNrJobs((Integer)newValue);
				return;
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_PREDECESSOR:
				setMaxOverlapPredecessor((Float)newValue);
				return;
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_SUCCESSOR:
				setMaxOverlapSuccessor((Float)newValue);
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
			case G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS:
				getLpOptiPostFlows().clear();
				return;
			case G4SOptiPostPackage.SCENARIO__SELECTED_SHIFTS:
				getSelectedShifts().clear();
				return;
			case G4SOptiPostPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case G4SOptiPostPackage.SCENARIO__SOLUTIONS:
				getSolutions().clear();
				return;
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MIN_EMPLOYEE_NR_JOB:
				setAbsoluteMinEmployeeNrJob(ABSOLUTE_MIN_EMPLOYEE_NR_JOB_EDEFAULT);
				return;
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS:
				setAbsoluteMaxEmployeeNrJobs(ABSOLUTE_MAX_EMPLOYEE_NR_JOBS_EDEFAULT);
				return;
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_PREDECESSOR:
				setMaxOverlapPredecessor(MAX_OVERLAP_PREDECESSOR_EDEFAULT);
				return;
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_SUCCESSOR:
				setMaxOverlapSuccessor(MAX_OVERLAP_SUCCESSOR_EDEFAULT);
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
			case G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS:
				return lpOptiPostFlows != null && !lpOptiPostFlows.isEmpty();
			case G4SOptiPostPackage.SCENARIO__SELECTED_SHIFTS:
				return selectedShifts != null && !selectedShifts.isEmpty();
			case G4SOptiPostPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case G4SOptiPostPackage.SCENARIO__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MIN_EMPLOYEE_NR_JOB:
				return absoluteMinEmployeeNrJob != ABSOLUTE_MIN_EMPLOYEE_NR_JOB_EDEFAULT;
			case G4SOptiPostPackage.SCENARIO__ABSOLUTE_MAX_EMPLOYEE_NR_JOBS:
				return absoluteMaxEmployeeNrJobs != ABSOLUTE_MAX_EMPLOYEE_NR_JOBS_EDEFAULT;
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_PREDECESSOR:
				return maxOverlapPredecessor != MAX_OVERLAP_PREDECESSOR_EDEFAULT;
			case G4SOptiPostPackage.SCENARIO__MAX_OVERLAP_SUCCESSOR:
				return maxOverlapSuccessor != MAX_OVERLAP_SUCCESSOR_EDEFAULT;
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
		result.append(", AbsoluteMinEmployeeNrJob: ");
		result.append(absoluteMinEmployeeNrJob);
		result.append(", AbsoluteMaxEmployeeNrJobs: ");
		result.append(absoluteMaxEmployeeNrJobs);
		result.append(", MaxOverlapPredecessor: ");
		result.append(maxOverlapPredecessor);
		result.append(", MaxOverlapSuccessor: ");
		result.append(maxOverlapSuccessor);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
