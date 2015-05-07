/**
 */
package solvercplex;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see solvercplex.SolvercplexPackage
 * @generated
 */
public interface SolvercplexFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolvercplexFactory eINSTANCE = solvercplex.impl.SolvercplexFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Cplex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Cplex</em>'.
	 * @generated
	 */
	SolverCplex createSolverCplex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolvercplexPackage getSolvercplexPackage();

} //SolvercplexFactory
