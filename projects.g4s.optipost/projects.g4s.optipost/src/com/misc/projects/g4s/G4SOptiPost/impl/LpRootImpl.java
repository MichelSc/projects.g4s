/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.LpEmployee;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import com.misc.projects.g4s.G4SOptiPost.Scenario;
import com.misc.projects.g4s.G4SOptiPost.Shift;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

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
		
		this.generateJobs();
		this.generatePrecedences();
	}
	
    private void generateJobs() {
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
        	if ( employee != null ) {
            	LpEmployee lpemployee = employees.get(employee);
            	if ( lpemployee == null){
                	lpemployee = G4SOptiPostFactory.eINSTANCE.createLpEmployee();
                	int minJobs = lpemployee.getMinNrJobs();
                	if ( minJobs>scenario.getAbsoluteMaxEmployeeNrJobs()){
                		minJobs = scenario.getAbsoluteMaxEmployeeNrJobs();
                	}
                	if ( minJobs<scenario.getAbsoluteMinEmployeeNrJob() ){
                		minJobs = scenario.getAbsoluteMinEmployeeNrJob();
                	}
                	lpemployee.setMinNrJobs(minJobs);
                	lpemployee.setEmployee(employee);
                	lpemployee.setCode(employee.getEmployeeID());
                	employees.put(employee, lpemployee);
                	this.getLpEmployees().add(lpemployee);
            	}
            	lpjob.setLpEmployee(lpemployee);
            	this.getJobs().add(lpjob);  // owning
        	}
        }  // traverse the selected shifts
	}  // generateTuples
	

	@SuppressWarnings("serial")
	private class JobSet extends HashSet<LpJob>{};

	private void generatePrecedences(){
		HashMap<Location, JobSet> jobsAtLocation = new HashMap<Location, JobSet>();
		
		for ( LpJob job : this.getJobs()){
			Shift shift = job.getShift();
			Location location = shift.getLocation();
			JobSet jobset = jobsAtLocation.get(location);
			if ( jobset == null){
				jobset = new JobSet();
				jobsAtLocation.put(location, jobset);
			}
			jobset.add(job);
		} // traverse the jobs
		
		for ( JobSet jobSet  : jobsAtLocation.values()){
			this.generatePrecedences(jobSet);
		}
	}

	
	private void generatePrecedences(JobSet jobSet){
		if ( jobSet.size()==0 ) { return; }
		
		List< LpJob > starts = new ArrayList< LpJob >( jobSet);
		Collections.sort( starts, new Comparator< LpJob >( ){
			@Override
			public int compare(LpJob arg0, LpJob arg1) {
				Date date0 = arg0.getShift().getShiftStart();
				Date date1 = arg1.getShift().getShiftStart();
				return date0.compareTo(date1);
			}} );
		
		List< LpJob > ends = new ArrayList< LpJob >( jobSet);
		Collections.sort( ends, new Comparator< LpJob >( ){
			@Override
			public int compare(LpJob arg0, LpJob arg1) {
				Date date0 = arg0.getShift().getShiftEnd();
				Date date1 = arg1.getShift().getShiftEnd();
				return date0.compareTo(date1);
			}} );
		
		Iterator<LpJob> startIterator = starts.iterator();
		Iterator<LpJob> endIterator   = ends  .iterator();
		
		LpJob nextStart = startIterator.next(); // first
		LpJob nextEnd   = endIterator  .next(); // first
		
		JobSet currentJobs = new JobSet();
		
		boolean finished = false;
		while ( ! finished  ){
			if ( nextStart == null
			||	nextStart.getShift().getShiftStart().compareTo(nextEnd.getShift().getShiftEnd())>0) {
				// next end qualifies as new event
				LpJob jobLeaving = nextEnd;
				currentJobs.remove(jobLeaving);
				// loop control
				if ( endIterator.hasNext() ){
					nextEnd = endIterator.next();
				} else {
					finished = true;
				}
			}
			else {
				// next start qualifies as new event
				LpJob jobEntering = nextStart;
				for ( LpJob currentJob : currentJobs){
					this.createPrecedence(currentJob, jobEntering);
				}
				currentJobs.add(jobEntering);
				// loop control
				if ( startIterator.hasNext()){
					nextStart = startIterator.next();
				} else {
					nextStart = null; // after last
				}
			} 
		} // iterate
	}  // method
	
	private void createPrecedence(LpJob jobStartBefore, LpJob jobStartAfter){
		LpRoot root = this;
		LpOptiPostFlow generator = root.getLpOptiPostFlow();
		Scenario scenario = generator.getScenario();
		// assert jobs at the same location
		// assert jobs are overlapping
		// assert couple of jobs will not be presented twice
		long start1 = jobStartBefore.getShift().getShiftStart().getTime();
		long end1   = jobStartBefore.getShift().getShiftEnd().getTime();
		long start2 = jobStartAfter .getShift().getShiftStart().getTime();
		long end2   = jobStartAfter .getShift().getShiftEnd().getTime();
		long start  = Math.max(start1, start2);
		long end    = Math.min(end1, end2);
		if ( (float)(end-start)/(float)(end1-start1)>scenario.getMaxOverlapPredecessor()) { return; }
		if ( (float)(end-start)/(float)(end2-start2)>scenario.getMaxOverlapSuccessor()) { return; }
		boolean isPrecedence = true;
		if ( isPrecedence ){
        	LpPrecedence lpprecedence = G4SOptiPostFactory.eINSTANCE.createLpPrecedence();
        	lpprecedence.setJobBefore(jobStartBefore);
        	lpprecedence.setJobAfter(jobStartAfter);
        	lpprecedence.setCode(jobStartBefore.getCode()+"_"+jobStartAfter.getCode());
		}
	}


} //LpRootImpl
