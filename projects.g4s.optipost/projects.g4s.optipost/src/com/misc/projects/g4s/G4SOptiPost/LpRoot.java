/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.GeneratorTuple;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getPrecedences <em>Precedences</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpRoot#getJobs <em>Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot()
 * @model
 * @generated
 */
public interface LpRoot extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Precedences</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpPrecedence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedences</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot_Precedences()
	 * @model containment="true"
	 * @generated
	 */
	EList<LpPrecedence> getPrecedences();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.g4s.G4SOptiPost.LpJob}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpRoot_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LpJob> getJobs();

} // LpRoot
