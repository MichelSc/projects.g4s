/**
 */
package com.misc.projects.g4s.G4SOptiPost.presentation;

import com.misc.common.moplaf.common.provider.CommonEditPlugin;
import com.misc.common.moplaf.solver.provider.SolverEditPlugin;
import com.misc.common.moplaf.spreadsheet.provider.SpreadsheetEditPlugin;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.provider.SpreadsheetpoiEditPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the G4SOptiPost editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class G4SOptiPostEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final G4SOptiPostEditorPlugin INSTANCE = new G4SOptiPostEditorPlugin();
	
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
	public G4SOptiPostEditorPlugin() {
		super
			(new ResourceLocator [] {
				SolverEditPlugin.INSTANCE,
				SpreadsheetEditPlugin.INSTANCE,
				SpreadsheetpoiEditPlugin.INSTANCE,
				CommonEditPlugin.INSTANCE,
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
	public static class Implementation extends EclipseUIPlugin {
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
