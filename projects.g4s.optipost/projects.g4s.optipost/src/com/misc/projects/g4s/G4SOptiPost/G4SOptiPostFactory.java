/**
 */
package com.misc.projects.g4s.G4SOptiPost;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage
 * @generated
 */
public interface G4SOptiPostFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	G4SOptiPostFactory eINSTANCE = com.misc.projects.g4s.G4SOptiPost.impl.G4SOptiPostFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift</em>'.
	 * @generated
	 */
	Shift createShift();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Lp Opti Post Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Opti Post Flow</em>'.
	 * @generated
	 */
	LpOptiPostFlow createLpOptiPostFlow();

	/**
	 * Returns a new object of class '<em>Lp Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Root</em>'.
	 * @generated
	 */
	LpRoot createLpRoot();

	/**
	 * Returns a new object of class '<em>Lp Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Job</em>'.
	 * @generated
	 */
	LpJob createLpJob();

	/**
	 * Returns a new object of class '<em>Lp Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Precedence</em>'.
	 * @generated
	 */
	LpPrecedence createLpPrecedence();

	/**
	 * Returns a new object of class '<em>Lp Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Employee</em>'.
	 * @generated
	 */
	LpEmployee createLpEmployee();

	/**
	 * Returns a new object of class '<em>Jobs Importer Spreadsheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jobs Importer Spreadsheet</em>'.
	 * @generated
	 */
	JobsImporterSpreadsheet createJobsImporterSpreadsheet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	G4SOptiPostPackage getG4SOptiPostPackage();

} //G4SOptiPostFactory
