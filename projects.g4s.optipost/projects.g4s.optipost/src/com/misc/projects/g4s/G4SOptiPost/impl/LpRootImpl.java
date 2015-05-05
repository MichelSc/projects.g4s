/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;

import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
			precedences = new EObjectContainmentEList<LpPrecedence>(LpPrecedence.class, this, G4SOptiPostPackage.LP_ROOT__PRECEDENCES);
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
			jobs = new EObjectContainmentEList<LpJob>(LpJob.class, this, G4SOptiPostPackage.LP_ROOT__JOBS);
		}
		return jobs;
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
			case G4SOptiPostPackage.LP_ROOT__PRECEDENCES:
				return getPrecedences();
			case G4SOptiPostPackage.LP_ROOT__JOBS:
				return getJobs();
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
		}
		return super.eIsSet(featureID);
	}

} //LpRootImpl
