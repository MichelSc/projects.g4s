/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getLpOptiPostFlows <em>Lp Opti Post Flows</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getSelectedShifts <em>Selected Shifts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getAbsoluteMinEmployeeNrJob <em>Absolute Min Employee Nr Job</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getAbsoluteMaxEmployeeNrJobs <em>Absolute Max Employee Nr Jobs</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getMaxOverlapPredecessor <em>Max Overlap Predecessor</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getMaxOverlapSuccessor <em>Max Overlap Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Lp Opti Post Flows</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Opti Post Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Opti Post Flows</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_LpOptiPostFlows()
	 * @see com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<LpOptiPostFlow> getLpOptiPostFlows();

	/**
	 * Returns the value of the '<em><b>Selected Shifts</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.Shift}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Shifts</em>' reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_SelectedShifts()
	 * @model
	 * @generated
	 */
	EList<Shift> getSelectedShifts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_Solutions()
	 * @see com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<OptiPostSolution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Absolute Min Employee Nr Job</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Min Employee Nr Job</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Min Employee Nr Job</em>' attribute.
	 * @see #setAbsoluteMinEmployeeNrJob(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_AbsoluteMinEmployeeNrJob()
	 * @model default="10"
	 * @generated
	 */
	int getAbsoluteMinEmployeeNrJob();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getAbsoluteMinEmployeeNrJob <em>Absolute Min Employee Nr Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Min Employee Nr Job</em>' attribute.
	 * @see #getAbsoluteMinEmployeeNrJob()
	 * @generated
	 */
	void setAbsoluteMinEmployeeNrJob(int value);

	/**
	 * Returns the value of the '<em><b>Absolute Max Employee Nr Jobs</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Max Employee Nr Jobs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Max Employee Nr Jobs</em>' attribute.
	 * @see #setAbsoluteMaxEmployeeNrJobs(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_AbsoluteMaxEmployeeNrJobs()
	 * @model default="50"
	 * @generated
	 */
	int getAbsoluteMaxEmployeeNrJobs();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getAbsoluteMaxEmployeeNrJobs <em>Absolute Max Employee Nr Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Max Employee Nr Jobs</em>' attribute.
	 * @see #getAbsoluteMaxEmployeeNrJobs()
	 * @generated
	 */
	void setAbsoluteMaxEmployeeNrJobs(int value);

	/**
	 * Returns the value of the '<em><b>Max Overlap Predecessor</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Overlap Predecessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Overlap Predecessor</em>' attribute.
	 * @see #setMaxOverlapPredecessor(float)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_MaxOverlapPredecessor()
	 * @model default="0.25"
	 * @generated
	 */
	float getMaxOverlapPredecessor();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getMaxOverlapPredecessor <em>Max Overlap Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Overlap Predecessor</em>' attribute.
	 * @see #getMaxOverlapPredecessor()
	 * @generated
	 */
	void setMaxOverlapPredecessor(float value);

	/**
	 * Returns the value of the '<em><b>Max Overlap Successor</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Overlap Successor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Overlap Successor</em>' attribute.
	 * @see #setMaxOverlapSuccessor(float)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getScenario_MaxOverlapSuccessor()
	 * @model default="0.25"
	 * @generated
	 */
	float getMaxOverlapSuccessor();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getMaxOverlapSuccessor <em>Max Overlap Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Overlap Successor</em>' attribute.
	 * @see #getMaxOverlapSuccessor()
	 * @generated
	 */
	void setMaxOverlapSuccessor(float value);

} // Scenario
