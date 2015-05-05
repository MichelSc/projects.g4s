/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import com.misc.common.moplaf.solver.Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Opti Post Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapPredecessor <em>Min Overlap Predecessor</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapSuccessor <em>Min Overlap Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow()
 * @model
 * @generated
 */
public interface LpOptiPostFlow extends Generator {
	/**
	 * Returns the value of the '<em><b>Lp Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Root</em>' containment reference.
	 * @see #setLpRoot(LpRoot)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_LpRoot()
	 * @model containment="true"
	 * @generated
	 */
	LpRoot getLpRoot();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getLpRoot <em>Lp Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Root</em>' containment reference.
	 * @see #getLpRoot()
	 * @generated
	 */
	void setLpRoot(LpRoot value);

	/**
	 * Returns the value of the '<em><b>Min Overlap Predecessor</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Overlap Predecessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Overlap Predecessor</em>' attribute.
	 * @see #setMinOverlapPredecessor(float)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_MinOverlapPredecessor()
	 * @model default="0.25"
	 * @generated
	 */
	float getMinOverlapPredecessor();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapPredecessor <em>Min Overlap Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Overlap Predecessor</em>' attribute.
	 * @see #getMinOverlapPredecessor()
	 * @generated
	 */
	void setMinOverlapPredecessor(float value);

	/**
	 * Returns the value of the '<em><b>Min Overlap Successor</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Overlap Successor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Overlap Successor</em>' attribute.
	 * @see #setMinOverlapSuccessor(float)
	 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage#getLpOptiPostFlow_MinOverlapSuccessor()
	 * @model default="0.25"
	 * @generated
	 */
	float getMinOverlapSuccessor();

	/**
	 * Sets the value of the '{@link com.misc.projects.g4s.G4SOptiPost.LpOptiPostFlow#getMinOverlapSuccessor <em>Min Overlap Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Overlap Successor</em>' attribute.
	 * @see #getMinOverlapSuccessor()
	 * @generated
	 */
	void setMinOverlapSuccessor(float value);

} // LpOptiPostFlow
