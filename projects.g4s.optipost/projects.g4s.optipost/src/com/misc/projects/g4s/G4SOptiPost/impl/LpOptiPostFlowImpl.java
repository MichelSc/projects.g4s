/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.impl.GeneratorImpl;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import com.misc.projects.g4s.G4SOptiPost.Scenario;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Opti Post Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getMinOverlapPredecessor <em>Min Overlap Predecessor</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getMinOverlapSuccessor <em>Min Overlap Successor</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getCplexSolver <em>Cplex Solver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LpOptiPostFlowImpl extends GeneratorImpl implements LpOptiPostFlow {
	/**
	 * The cached value of the '{@link #getLpRoot() <em>Lp Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpRoot()
	 * @generated
	 * @ordered
	 */
	protected LpRoot lpRoot;

	/**
	 * The default value of the '{@link #getMinOverlapPredecessor() <em>Min Overlap Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOverlapPredecessor()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_OVERLAP_PREDECESSOR_EDEFAULT = 0.25F;

	/**
	 * The cached value of the '{@link #getMinOverlapPredecessor() <em>Min Overlap Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOverlapPredecessor()
	 * @generated
	 * @ordered
	 */
	protected float minOverlapPredecessor = MIN_OVERLAP_PREDECESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOverlapSuccessor() <em>Min Overlap Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOverlapSuccessor()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_OVERLAP_SUCCESSOR_EDEFAULT = 0.25F;

	/**
	 * The cached value of the '{@link #getMinOverlapSuccessor() <em>Min Overlap Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOverlapSuccessor()
	 * @generated
	 * @ordered
	 */
	protected float minOverlapSuccessor = MIN_OVERLAP_SUCCESSOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCplexSolver() <em>Cplex Solver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCplexSolver()
	 * @generated
	 * @ordered
	 */
	protected com.misc.common.moplaf.solver.solvercplex.SolverCplex cplexSolver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpOptiPostFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.LP_OPTI_POST_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpRoot getLpRoot() {
		return lpRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpRoot(LpRoot newLpRoot, NotificationChain msgs) {
		LpRoot oldLpRoot = lpRoot;
		lpRoot = newLpRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT, oldLpRoot, newLpRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpRoot(LpRoot newLpRoot) {
		if (newLpRoot != lpRoot) {
			NotificationChain msgs = null;
			if (lpRoot != null)
				msgs = ((InternalEObject)lpRoot).eInverseRemove(this, G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW, LpRoot.class, msgs);
			if (newLpRoot != null)
				msgs = ((InternalEObject)newLpRoot).eInverseAdd(this, G4SOptiPostPackage.LP_ROOT__LP_OPTI_POST_FLOW, LpRoot.class, msgs);
			msgs = basicSetLpRoot(newLpRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT, newLpRoot, newLpRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinOverlapPredecessor() {
		return minOverlapPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOverlapPredecessor(float newMinOverlapPredecessor) {
		float oldMinOverlapPredecessor = minOverlapPredecessor;
		minOverlapPredecessor = newMinOverlapPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR, oldMinOverlapPredecessor, minOverlapPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinOverlapSuccessor() {
		return minOverlapSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOverlapSuccessor(float newMinOverlapSuccessor) {
		float oldMinOverlapSuccessor = minOverlapSuccessor;
		minOverlapSuccessor = newMinOverlapSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR, oldMinOverlapSuccessor, minOverlapSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (eContainerFeatureID() != G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO) return null;
		return (Scenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.misc.common.moplaf.solver.solvercplex.SolverCplex getCplexSolver() {
		return cplexSolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCplexSolver(com.misc.common.moplaf.solver.solvercplex.SolverCplex newCplexSolver, NotificationChain msgs) {
		com.misc.common.moplaf.solver.solvercplex.SolverCplex oldCplexSolver = cplexSolver;
		cplexSolver = newCplexSolver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER, oldCplexSolver, newCplexSolver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCplexSolver(com.misc.common.moplaf.solver.solvercplex.SolverCplex newCplexSolver) {
		if (newCplexSolver != cplexSolver) {
			NotificationChain msgs = null;
			if (cplexSolver != null)
				msgs = ((InternalEObject)cplexSolver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER, null, msgs);
			if (newCplexSolver != null)
				msgs = ((InternalEObject)newCplexSolver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER, null, msgs);
			msgs = basicSetCplexSolver(newCplexSolver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER, newCplexSolver, newCplexSolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
				if (lpRoot != null)
					msgs = ((InternalEObject)lpRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT, null, msgs);
				return basicSetLpRoot((LpRoot)otherEnd, msgs);
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
				return basicSetLpRoot(null, msgs);
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				return basicSetScenario(null, msgs);
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				return basicSetCplexSolver(null, msgs);
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				return eInternalContainer().eInverseRemove(this, G4SOptiPostPackage.SCENARIO__LP_OPTI_POST_FLOWS, Scenario.class, msgs);
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
				return getLpRoot();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR:
				return getMinOverlapPredecessor();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR:
				return getMinOverlapSuccessor();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				return getScenario();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				return getCplexSolver();
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
				setLpRoot((LpRoot)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR:
				setMinOverlapPredecessor((Float)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR:
				setMinOverlapSuccessor((Float)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				setCplexSolver((com.misc.common.moplaf.solver.solvercplex.SolverCplex)newValue);
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
				setLpRoot((LpRoot)null);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR:
				setMinOverlapPredecessor(MIN_OVERLAP_PREDECESSOR_EDEFAULT);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR:
				setMinOverlapSuccessor(MIN_OVERLAP_SUCCESSOR_EDEFAULT);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				setScenario((Scenario)null);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				setCplexSolver((com.misc.common.moplaf.solver.solvercplex.SolverCplex)null);
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
				return lpRoot != null;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_PREDECESSOR:
				return minOverlapPredecessor != MIN_OVERLAP_PREDECESSOR_EDEFAULT;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__MIN_OVERLAP_SUCCESSOR:
				return minOverlapSuccessor != MIN_OVERLAP_SUCCESSOR_EDEFAULT;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				return getScenario() != null;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				return cplexSolver != null;
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
		result.append(" (MinOverlapPredecessor: ");
		result.append(minOverlapPredecessor);
		result.append(", MinOverlapSuccessor: ");
		result.append(minOverlapSuccessor);
		result.append(')');
		return result.toString();
	}

	@Override
	public void generateRootTuples() {
		LpRoot tupleroot = G4SOptiPostFactory.eINSTANCE.createLpRoot();
		tupleroot.setCode("root");
		this.setLpRoot(tupleroot); // owning
	}

} //LpOptiPostFlowImpl