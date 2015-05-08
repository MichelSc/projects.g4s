/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolution;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost;

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
 * An implementation of the model object '<em><b>Opti Post Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getLp <em>Lp</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.OptiPostSolutionImpl#getNrEmployees <em>Nr Employees</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getNrEmployees() <em>Nr Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrEmployees()
	 * @generated
	 * @ordered
	 */
	protected int nrEmployees = NR_EMPLOYEES_EDEFAULT;

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
	 * @generated
	 */
	public int getNrEmployees() {
		return nrEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrEmployees(int newNrEmployees) {
		int oldNrEmployees = nrEmployees;
		nrEmployees = newNrEmployees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.OPTI_POST_SOLUTION__NR_EMPLOYEES, oldNrEmployees, nrEmployees));
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__LP:
				if (resolve) return getLp();
				return basicGetLp();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__POSTS:
				return getPosts();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__EMPLOYEES:
				return getEmployees();
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__NR_EMPLOYEES:
				return getNrEmployees();
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__NR_EMPLOYEES:
				setNrEmployees((Integer)newValue);
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
			case G4SOptiPostPackage.OPTI_POST_SOLUTION__NR_EMPLOYEES:
				setNrEmployees(NR_EMPLOYEES_EDEFAULT);
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
				return nrEmployees != NR_EMPLOYEES_EDEFAULT;
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
		result.append(" (NrEmployees: ");
		result.append(nrEmployees);
		result.append(')');
		return result.toString();
	}

} //OptiPostSolutionImpl
