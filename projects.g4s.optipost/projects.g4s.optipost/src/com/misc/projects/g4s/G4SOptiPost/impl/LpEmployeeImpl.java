/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
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
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getLpJobs <em>Lp Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getMinNrJobs <em>Min Nr Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getVarInPost <em>Var In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpEmployeeImpl#getConsEnoughJobsInPost <em>Cons Enough Jobs In Post</em>}</li>
 * </ul>
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
	protected static final int MIN_NR_JOBS_EDEFAULT = 5;

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
	 * The cached value of the '{@link #getVarInPost() <em>Var In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarInPost()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar varInPost;

	/**
	 * The cached value of the '{@link #getConsEnoughJobsInPost() <em>Cons Enough Jobs In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsEnoughJobsInPost()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons consEnoughJobsInPost;

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
	public GeneratorLpVar getVarInPost() {
		return varInPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarInPost(GeneratorLpVar newVarInPost, NotificationChain msgs) {
		GeneratorLpVar oldVarInPost = varInPost;
		varInPost = newVarInPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST, oldVarInPost, newVarInPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarInPost(GeneratorLpVar newVarInPost) {
		if (newVarInPost != varInPost) {
			NotificationChain msgs = null;
			if (varInPost != null)
				msgs = ((InternalEObject)varInPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST, null, msgs);
			if (newVarInPost != null)
				msgs = ((InternalEObject)newVarInPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST, null, msgs);
			msgs = basicSetVarInPost(newVarInPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST, newVarInPost, newVarInPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getConsEnoughJobsInPost() {
		return consEnoughJobsInPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsEnoughJobsInPost(GeneratorLpCons newConsEnoughJobsInPost, NotificationChain msgs) {
		GeneratorLpCons oldConsEnoughJobsInPost = consEnoughJobsInPost;
		consEnoughJobsInPost = newConsEnoughJobsInPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST, oldConsEnoughJobsInPost, newConsEnoughJobsInPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsEnoughJobsInPost(GeneratorLpCons newConsEnoughJobsInPost) {
		if (newConsEnoughJobsInPost != consEnoughJobsInPost) {
			NotificationChain msgs = null;
			if (consEnoughJobsInPost != null)
				msgs = ((InternalEObject)consEnoughJobsInPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST, null, msgs);
			if (newConsEnoughJobsInPost != null)
				msgs = ((InternalEObject)newConsEnoughJobsInPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST, null, msgs);
			msgs = basicSetConsEnoughJobsInPost(newConsEnoughJobsInPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST, newConsEnoughJobsInPost, newConsEnoughJobsInPost));
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
			case G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST:
				return basicSetVarInPost(null, msgs);
			case G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST:
				return basicSetConsEnoughJobsInPost(null, msgs);
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
			case G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST:
				return getVarInPost();
			case G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST:
				return getConsEnoughJobsInPost();
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
			case G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST:
				setVarInPost((GeneratorLpVar)newValue);
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST:
				setConsEnoughJobsInPost((GeneratorLpCons)newValue);
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
			case G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST:
				setVarInPost((GeneratorLpVar)null);
				return;
			case G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST:
				setConsEnoughJobsInPost((GeneratorLpCons)null);
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
			case G4SOptiPostPackage.LP_EMPLOYEE__VAR_IN_POST:
				return varInPost != null;
			case G4SOptiPostPackage.LP_EMPLOYEE__CONS_ENOUGH_JOBS_IN_POST:
				return consEnoughJobsInPost != null;
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

	@Override
	public void generateVars() {
		super.generateVars();
		
		this.generateVarInPost();
	}
	
	private void generateVarInPost() {
		GeneratorLpVar newVar = SolverFactory.eINSTANCE.createGeneratorLpVar();
		newVar.setLowerBound(0.0f);
		newVar.setUpperBound(1.0f);
		newVar.setType(EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER);
		newVar.setName("inpost");
		this.setVarInPost(newVar);
	}

	@Override
	public void generateCons() {
		super.generateCons();
		
		this.generateConsEnoughJobsInPost();
	}
	
	private void generateConsEnoughJobsInPost() {
		GeneratorLpCons newCons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		newCons.setRighHandSide(0.0f );
		newCons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL);
		newCons.setName("enoughJobs");
		for (  LpJob employeeJob : this.getLpJobs()){
			newCons.constructTerm(employeeJob.getVarInPost(), 1.0f);
		}
		newCons.constructTerm(this.getVarInPost(), -this.getMinNrJobs());
		this.setConsEnoughJobsInPost(newCons);
	}
	
} //LpEmployeeImpl
