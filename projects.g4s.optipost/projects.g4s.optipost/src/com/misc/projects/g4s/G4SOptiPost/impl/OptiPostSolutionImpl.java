/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolution;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost;

import com.misc.projects.g4s.G4SOptiPost.Scenario;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opti Post Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getLp <em>Lp</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getNrEmployees <em>Nr Employees</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getEmployeesInPost <em>Employees In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getShiftsInPost <em>Shifts In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptiPostSolutionImpl extends MinimalEObjectImpl.Container implements OptiPostSolution {
	/**
	 * The cached value of the '{@link #getLp() <em>Lp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLp()
	 * @generated
	 * @ordered
	 */
	protected LpOptiPostFlow lp;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<OptiPostSolutionPost> posts;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<OptiPostSolutionEmployee> employees;

	/**
	 * The default value of the '{@link #getNrEmployees() <em>Nr Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrEmployees()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_EMPLOYEES_EDEFAULT = 0;

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
	 * The default value of the '{@link #getEmployeesInPost() <em>Employees In Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeesInPost()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLOYEES_IN_POST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmployeesInPost() <em>Employees In Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeesInPost()
	 * @generated
	 * @ordered
	 */
	protected int employeesInPost = EMPLOYEES_IN_POST_EDEFAULT;

	/**
	 * The default value of the '{@link #getShiftsInPost() <em>Shifts In Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftsInPost()
	 * @generated
	 * @ordered
	 */
	protected static final int SHIFTS_IN_POST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShiftsInPost() <em>Shifts In Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftsInPost()
	 * @generated
	 * @ordered
	 */
	protected int shiftsInPost = SHIFTS_IN_POST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptiPostSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.OPTI_POST_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpOptiPostFlow getLp() {
		if (lp != null && lp.eIsProxy()) {
			InternalEObject oldLp = (InternalEObject)lp;
			lp = (LpOptiPostFlow)eResolveProxy(oldLp);
			if (lp != oldLp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.OPTI_POST_SOLUTION__LP, oldLp, lp));
			}
		}
		return lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpOptiPostFlow basicGetLp() {
		return lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLp(LpOptiPostFlow newLp) {
		LpOptiPostFlow oldLp = lp;
		lp = newLp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION__LP, oldLp, lp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptiPostSolutionPost> getPosts() {
		if (posts == null) {
			posts = new EObjectContainmentEList<OptiPostSolutionPost>(OptiPostSolutionPost.class, this, G4SOptiPostPackage.OPTI_POST_SOLUTION__POSTS);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptiPostSolutionEmployee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<OptiPostSolutionEmployee>(OptiPostSolutionEmployee.class, this, G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNrEmployees() {
		return this.getEmployees()==null ? 0 : this.getEmployees().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("emps in post = %d, shifts in post %d/%d", 
                this.getEmployeesInPost(),
                this.getShiftsInPost(),
                this.getScenario().getSelectedShifts().size());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEmployeesInPost() {
		return employeesInPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeesInPost(int newEmployeesInPost) {
		int oldEmployeesInPost = employeesInPost;
		employeesInPost = newEmployeesInPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES_IN_POST, oldEmployeesInPost, employeesInPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShiftsInPost() {
		return shiftsInPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftsInPost(int newShiftsInPost) {
		int oldShiftsInPost = shiftsInPost;
		shiftsInPost = newShiftsInPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION__SHIFTS_IN_POST, oldShiftsInPost, shiftsInPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (eContainerFeatureID() != G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO) return null;
		return (Scenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, G4SOptiPostPackage.SCENARIO__SOLUTIONS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScenario((Scenario)otherEnd, msgs);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__POSTS:
				return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO:
				return basicSetScenario(null, msgs);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO:
				return eInternalContainer().eInverseRemove(this, G4SOptiPostPackage.SCENARIO__SOLUTIONS, Scenario.class, msgs);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__LP:
				if (resolve) return getLp();
				return basicGetLp();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__POSTS:
				return getPosts();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES:
				return getEmployees();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__NR_EMPLOYEES:
				return getNrEmployees();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__DESCRIPTION:
				return getDescription();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES_IN_POST:
				return getEmployeesInPost();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SHIFTS_IN_POST:
				return getShiftsInPost();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO:
				return getScenario();
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__LP:
				setLp((LpOptiPostFlow)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__POSTS:
				getPosts().clear();
				getPosts().addAll((Collection<? extends OptiPostSolutionPost>)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends OptiPostSolutionEmployee>)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES_IN_POST:
				setEmployeesInPost((Integer)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SHIFTS_IN_POST:
				setShiftsInPost((Integer)newValue);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO:
				setScenario((Scenario)newValue);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__LP:
				setLp((LpOptiPostFlow)null);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__POSTS:
				getPosts().clear();
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES:
				getEmployees().clear();
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES_IN_POST:
				setEmployeesInPost(EMPLOYEES_IN_POST_EDEFAULT);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SHIFTS_IN_POST:
				setShiftsInPost(SHIFTS_IN_POST_EDEFAULT);
				return;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO:
				setScenario((Scenario)null);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__LP:
				return lp != null;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__POSTS:
				return posts != null && !posts.isEmpty();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__NR_EMPLOYEES:
				return getNrEmployees() != NR_EMPLOYEES_EDEFAULT;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES_IN_POST:
				return employeesInPost != EMPLOYEES_IN_POST_EDEFAULT;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SHIFTS_IN_POST:
				return shiftsInPost != SHIFTS_IN_POST_EDEFAULT;
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__SCENARIO:
				return getScenario() != null;
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
		result.append(" (EmployeesInPost: ");
		result.append(employeesInPost);
		result.append(", ShiftsInPost: ");
		result.append(shiftsInPost);
		result.append(')');
		return result.toString();
	}

} //OptiPostSolutionImpl
