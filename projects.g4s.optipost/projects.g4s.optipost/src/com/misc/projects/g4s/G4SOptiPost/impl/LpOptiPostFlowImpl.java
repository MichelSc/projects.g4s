/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.impl.GeneratorImpl;
import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import com.misc.common.moplaf.solver.solverglpk.SolverGLPK;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpEmployee;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolution;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost;
import com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionShift;
import com.misc.projects.g4s.G4SOptiPost.Scenario;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Opti Post Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getGoalNofEmployees <em>Goal Nof Employees</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getGLPKSolver <em>GLPK Solver</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpOptiPostFlowImpl#getCplexSolver <em>Cplex Solver</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getGoalNofEmployees() <em>Goal Nof Employees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalNofEmployees()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal goalNofEmployees;

	/**
	 * The cached value of the '{@link #getGLPKSolver() <em>GLPK Solver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGLPKSolver()
	 * @generated
	 * @ordered
	 */
	protected EList<SolverGLPK> glpkSolver;

	/**
	 * The cached value of the '{@link #getCplexSolver() <em>Cplex Solver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCplexSolver()
	 * @generated
	 * @ordered
	 */
	protected EList<SolverCplex> cplexSolver;

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
	public GeneratorLpGoal getGoalNofEmployees() {
		return goalNofEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoalNofEmployees(GeneratorLpGoal newGoalNofEmployees, NotificationChain msgs) {
		GeneratorLpGoal oldGoalNofEmployees = goalNofEmployees;
		goalNofEmployees = newGoalNofEmployees;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES, oldGoalNofEmployees, newGoalNofEmployees);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalNofEmployees(GeneratorLpGoal newGoalNofEmployees) {
		if (newGoalNofEmployees != goalNofEmployees) {
			NotificationChain msgs = null;
			if (goalNofEmployees != null)
				msgs = ((InternalEObject)goalNofEmployees).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES, null, msgs);
			if (newGoalNofEmployees != null)
				msgs = ((InternalEObject)newGoalNofEmployees).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES, null, msgs);
			msgs = basicSetGoalNofEmployees(newGoalNofEmployees, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES, newGoalNofEmployees, newGoalNofEmployees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolverGLPK> getGLPKSolver() {
		if (glpkSolver == null) {
			glpkSolver = new EObjectContainmentEList<SolverGLPK>(SolverGLPK.class, this, G4SOptiPostPackage.LP_OPTI_POST_FLOW__GLPK_SOLVER);
		}
		return glpkSolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolverCplex> getCplexSolver() {
		if (cplexSolver == null) {
			cplexSolver = new EObjectContainmentEList<SolverCplex>(SolverCplex.class, this, G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER);
		}
		return cplexSolver;
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES:
				return basicSetGoalNofEmployees(null, msgs);
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GLPK_SOLVER:
				return ((InternalEList<?>)getGLPKSolver()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				return ((InternalEList<?>)getCplexSolver()).basicRemove(otherEnd, msgs);
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				return getScenario();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES:
				return getGoalNofEmployees();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GLPK_SOLVER:
				return getGLPKSolver();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__LP_ROOT:
				setLpRoot((LpRoot)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES:
				setGoalNofEmployees((GeneratorLpGoal)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GLPK_SOLVER:
				getGLPKSolver().clear();
				getGLPKSolver().addAll((Collection<? extends SolverGLPK>)newValue);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				getCplexSolver().clear();
				getCplexSolver().addAll((Collection<? extends SolverCplex>)newValue);
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				setScenario((Scenario)null);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES:
				setGoalNofEmployees((GeneratorLpGoal)null);
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GLPK_SOLVER:
				getGLPKSolver().clear();
				return;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				getCplexSolver().clear();
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
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__SCENARIO:
				return getScenario() != null;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GOAL_NOF_EMPLOYEES:
				return goalNofEmployees != null;
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__GLPK_SOLVER:
				return glpkSolver != null && !glpkSolver.isEmpty();
			case G4SOptiPostPackage.LP_OPTI_POST_FLOW__CPLEX_SOLVER:
				return cplexSolver != null && !cplexSolver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void generateRootTuples() {
		LpRoot tupleroot = G4SOptiPostFactory.eINSTANCE.createLpRoot();
		tupleroot.setName("root");
		this.setLpRoot(tupleroot); // owning
	}

	@Override
	public void generateGoals() {
		this.generateGoalNumberOfEmployeesInPost();
	}

	private void generateGoalNumberOfEmployeesInPost() {
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("NofEmployees");
		this.setGoalNofEmployees(goal); // owning
		LpRoot root = this.getLpRoot();
		for ( LpEmployee employee: root.getLpEmployees()){
			goal.constructTerm(employee.getVarInPost(), 1.0f);
		}
	}


	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.solver.impl.GeneratorImpl#acceptSolution(com.misc.common.moplaf.solver.SolutionProvider)
	 */
	@Override
	public void acceptSolution(Solution solution) {
		Scenario scenario = this.getScenario();
		HashMap<Employee, OptiPostSolutionEmployee> solemployees = new HashMap<Employee, OptiPostSolutionEmployee>();
		OptiPostSolution sol = G4SOptiPostFactory.eINSTANCE.createOptiPostSolution();
		sol.setLp(this);
		int empsInPost = 0;
		int shiftsInPost = 0;
		for (  LpJob lpjob: this.getLpRoot().getJobs()){
			if ( !lpjob.isStartOfMonth()) { continue; }
			GeneratorLpVar var = lpjob.getVarIsFirstInPost();
			if ( !var.isSolutionOne(solution)){ continue; }
			// here we go: this is a post
			OptiPostSolutionPost newpost = G4SOptiPostFactory.eINSTANCE.createOptiPostSolutionPost();
			newpost.setLocation(lpjob.getShift().getLocation());
			do{
				// the current job is in the post
				shiftsInPost++;
				OptiPostSolutionShift solshift = newpost.addShift(lpjob.getShift());
				Employee employee = lpjob.getLpEmployee().getEmployee();
				OptiPostSolutionEmployee solemployee = solemployees.get(employee);
				if ( solemployee==null){
					solemployee = G4SOptiPostFactory.eINSTANCE.createOptiPostSolutionEmployee();
					solemployee.setEmployee(employee);
					boolean employeeInPost = lpjob.getLpEmployee().getVarInPost().isSolutionOne(solution);
					solemployee.setInPost(employeeInPost);
					if ( employeeInPost) { empsInPost++; }
					sol.getEmployees().add(solemployee); // owning
					solemployees.put(employee, solemployee);
				}
				solemployee.getShifts().add(solshift);
				// get the next job, if any
				LpJob nextJob = null;
				for( LpPrecedence jobafter : lpjob.getJobsAfter()){
					if ( jobafter.getVarInPost().isSolutionOne(solution) ){
						nextJob = jobafter.getJobAfter();
						break; // ok next job found
					}
				}
				lpjob = nextJob;
			} while ( lpjob!=null);
			sol.getPosts().add(newpost);
			sol.setShiftsInPost(shiftsInPost);
		}
		sol.setEmployeesInPost(empsInPost);
		scenario.getSolutions().add(sol);
	}
} //LpOptiPostFlowImpl
