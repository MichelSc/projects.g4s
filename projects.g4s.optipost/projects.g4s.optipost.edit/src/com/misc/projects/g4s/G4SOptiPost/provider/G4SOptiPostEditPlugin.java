/**
 */
package com.misc.projects.g4s.G4SOptiPost.provider;

import com.misc.common.moplaf.solver.provider.SolverEditPlugin;

import com.misc.common.moplaf.solver.solvercplex.provider.SolvercplexEditPlugin;
import com.misc.common.moplaf.solver.solverglpk.provider.SolverglpkEditPlugin;
import com.misc.common.moplaf.spreadsheet.provider.SpreadsheetEditPlugin;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.provider.SpreadsheetpoiEditPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the G4SOptiPost edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class G4SOptiPostEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final G4SOptiPostEditPlugin INSTANCE = new G4SOptiPostEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G4SOptiPostEditPlugin() {
		super
		  (new ResourceLocator [] {
		     SolverEditPlugin.INSTANCE,
		     SolvercplexEditPlugin.INSTANCE,
		     SolverglpkEditPlugin.INSTANCE,
		     SpreadsheetEditPlugin.INSTANCE,
		     SpreadsheetpoiEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
