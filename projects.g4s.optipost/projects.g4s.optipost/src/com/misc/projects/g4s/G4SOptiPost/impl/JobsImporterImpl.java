/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.JobsImporter;
import com.misc.projects.g4s.G4SOptiPost.Location;
import com.misc.projects.g4s.G4SOptiPost.Shift;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jobs Importer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.JobsImporterImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class JobsImporterImpl extends MinimalEObjectImpl.Container implements JobsImporter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobsImporterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.JOBS_IMPORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, G4SOptiPostPackage.DOMAIN__JOBS_IMPORTER, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String formatWorkerID(int idAsInt) {
		return String.format("%05d", idAsInt);
	}

	private HashMap<String, Employee> employeeIndex = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Employee getOrCreateEmployee(String id) {
		if ( this.employeeIndex == null){
			this.employeeIndex = new HashMap<String, Employee>();
			for(Employee e : this.getDomain().getEmployees()){
				this.employeeIndex.put(e.getEmployeeID(), e);
			}
		}
		Employee employee = this.employeeIndex.get(id);
		if ( employee==null){
			employee = G4SOptiPostFactory.eINSTANCE.createEmployee();
			employee.setEmployeeID(id);
			this.getDomain().getEmployees().add(employee);
			this.employeeIndex.put(id, employee);
		}
		return employee;
	}

	private HashMap<String, Location> locationIndex = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Location getOrCreateLocation(String id, String description) {
		if ( this.locationIndex == null){
			this.locationIndex = new HashMap<String, Location>();
			for(Location l : this.getDomain().getLocations()){
				this.locationIndex.put(l.getLocationID(), l);
			}
		}
		Location location = this.locationIndex.get(id);
		if ( location==null){
			location = G4SOptiPostFactory.eINSTANCE.createLocation();
			location.setLocationID(id);
			location.setDescription(description);
			this.getDomain().getLocations().add(location);
			this.locationIndex.put(id, location);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift createJob(Employee employee, Location location, Date shiftDate, Date shiftStart, Date shiftEnd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void importJobs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
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
			case G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN:
				return basicSetDomain(null, msgs);
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
			case G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN:
				return eInternalContainer().eInverseRemove(this, G4SOptiPostPackage.DOMAIN__JOBS_IMPORTER, Domain.class, msgs);
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
			case G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN:
				return getDomain();
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
			case G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN:
				setDomain((Domain)newValue);
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
			case G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN:
				setDomain((Domain)null);
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
			case G4SOptiPostPackage.JOBS_IMPORTER__DOMAIN:
				return getDomain() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case G4SOptiPostPackage.JOBS_IMPORTER___FORMAT_WORKER_ID__INT:
				return formatWorkerID((Integer)arguments.get(0));
			case G4SOptiPostPackage.JOBS_IMPORTER___GET_OR_CREATE_EMPLOYEE__STRING:
				return getOrCreateEmployee((String)arguments.get(0));
			case G4SOptiPostPackage.JOBS_IMPORTER___GET_OR_CREATE_LOCATION__STRING_STRING:
				return getOrCreateLocation((String)arguments.get(0), (String)arguments.get(1));
			case G4SOptiPostPackage.JOBS_IMPORTER___CREATE_JOB__EMPLOYEE_LOCATION_DATE_DATE_DATE:
				return createJob((Employee)arguments.get(0), (Location)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3), (Date)arguments.get(4));
			case G4SOptiPostPackage.JOBS_IMPORTER___IMPORT_JOBS:
				importJobs();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //JobsImporterImpl
