/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opti Post Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getLp <em>Lp</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getPosts <em>Posts</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getEmployees <em>Employees</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getNrEmployees <em>Nr Employees</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getEmployeesInPost <em>Employees In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getShiftsInPost <em>Shifts In Post</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution()
 * @model
 * @generated
 */
public interface OptiPostSolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Lp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp</em>' reference.
	 * @see #setLp(LpOptiPostFlow)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_Lp()
	 * @model
	 * @generated
	 */
	LpOptiPostFlow getLp();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getLp <em>Lp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp</em>' reference.
	 * @see #getLp()
	 * @generated
	 */
	void setLp(LpOptiPostFlow value);

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionPost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_Posts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptiPostSolutionPost> getPosts();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolutionEmployee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptiPostSolutionEmployee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Nr Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Employees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Employees</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_NrEmployees()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNrEmployees();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Employees In Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees In Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees In Post</em>' attribute.
	 * @see #setEmployeesInPost(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_EmployeesInPost()
	 * @model
	 * @generated
	 */
	int getEmployeesInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getEmployeesInPost <em>Employees In Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employees In Post</em>' attribute.
	 * @see #getEmployeesInPost()
	 * @generated
	 */
	void setEmployeesInPost(int value);

	/**
	 * Returns the value of the '<em><b>Shifts In Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shifts In Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shifts In Post</em>' attribute.
	 * @see #setShiftsInPost(int)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_ShiftsInPost()
	 * @model
	 * @generated
	 */
	int getShiftsInPost();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getShiftsInPost <em>Shifts In Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shifts In Post</em>' attribute.
	 * @see #getShiftsInPost()
	 * @generated
	 */
	void setShiftsInPost(int value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.g4s.G4SOptiPost.Scenario#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getOptiPostSolution_Scenario()
	 * @see com.misc.projects.g4s.G4SOptiPost.Scenario#getSolutions
	 * @model opposite="Solutions" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.OptiPostSolution#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // OptiPostSolution
