/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpPrecedenceImpl#getJobBefore <em>Job Before</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpPrecedenceImpl#getJobAfter <em>Job After</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpPrecedenceImpl#getVarInPost <em>Var In Post</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LpPrecedenceImpl extends GeneratorTupleImpl implements LpPrecedence {
	/**
	 * The cached value of the '{@link #getJobBefore() <em>Job Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobBefore()
	 * @generated
	 * @ordered
	 */
	protected LpJob jobBefore;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpPrecedenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.LP_PRECEDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpJob getJobBefore() {
		if (jobBefore != null && jobBefore.eIsProxy()) {
			InternalEObject oldJobBefore = (InternalEObject)jobBefore;
			jobBefore = (LpJob)eResolveProxy(oldJobBefore);
			if (jobBefore != oldJobBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE, oldJobBefore, jobBefore));
			}
		}
		return jobBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpJob basicGetJobBefore() {
		return jobBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobBefore(LpJob newJobBefore, NotificationChain msgs) {
		LpJob oldJobBefore = jobBefore;
		jobBefore = newJobBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE, oldJobBefore, newJobBefore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobBefore(LpJob newJobBefore) {
		if (newJobBefore != jobBefore) {
			NotificationChain msgs = null;
			if (jobBefore != null)
				msgs = ((InternalEObject)jobBefore).eInverseRemove(this, G4SOptiPostPackage.LP_JOB__JOBS_AFTER, LpJob.class, msgs);
			if (newJobBefore != null)
				msgs = ((InternalEObject)newJobBefore).eInverseAdd(this, G4SOptiPostPackage.LP_JOB__JOBS_AFTER, LpJob.class, msgs);
			msgs = basicSetJobBefore(newJobBefore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE, newJobBefore, newJobBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpJob getJobAfter() {
		if (eContainerFeatureID() != G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER) return null;
		return (LpJob)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobAfter(LpJob newJobAfter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newJobAfter, G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobAfter(LpJob newJobAfter) {
		if (newJobAfter != eInternalContainer() || (eContainerFeatureID() != G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER && newJobAfter != null)) {
			if (EcoreUtil.isAncestor(this, newJobAfter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJobAfter != null)
				msgs = ((InternalEObject)newJobAfter).eInverseAdd(this, G4SOptiPostPackage.LP_JOB__JOBS_BEFORE, LpJob.class, msgs);
			msgs = basicSetJobAfter(newJobAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER, newJobAfter, newJobAfter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST, oldVarInPost, newVarInPost);
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
				msgs = ((InternalEObject)varInPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST, null, msgs);
			if (newVarInPost != null)
				msgs = ((InternalEObject)newVarInPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST, null, msgs);
			msgs = basicSetVarInPost(newVarInPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST, newVarInPost, newVarInPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE:
				if (jobBefore != null)
					msgs = ((InternalEObject)jobBefore).eInverseRemove(this, G4SOptiPostPackage.LP_JOB__JOBS_AFTER, LpJob.class, msgs);
				return basicSetJobBefore((LpJob)otherEnd, msgs);
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetJobAfter((LpJob)otherEnd, msgs);
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
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE:
				return basicSetJobBefore(null, msgs);
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER:
				return basicSetJobAfter(null, msgs);
			case G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST:
				return basicSetVarInPost(null, msgs);
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
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER:
				return eInternalContainer().eInverseRemove(this, G4SOptiPostPackage.LP_JOB__JOBS_BEFORE, LpJob.class, msgs);
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
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE:
				if (resolve) return getJobBefore();
				return basicGetJobBefore();
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER:
				return getJobAfter();
			case G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST:
				return getVarInPost();
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
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE:
				setJobBefore((LpJob)newValue);
				return;
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER:
				setJobAfter((LpJob)newValue);
				return;
			case G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST:
				setVarInPost((GeneratorLpVar)newValue);
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
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE:
				setJobBefore((LpJob)null);
				return;
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER:
				setJobAfter((LpJob)null);
				return;
			case G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST:
				setVarInPost((GeneratorLpVar)null);
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
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE:
				return jobBefore != null;
			case G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER:
				return getJobAfter() != null;
			case G4SOptiPostPackage.LP_PRECEDENCE__VAR_IN_POST:
				return varInPost != null;
		}
		return super.eIsSet(featureID);
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
	
} //LpPrecedenceImpl
