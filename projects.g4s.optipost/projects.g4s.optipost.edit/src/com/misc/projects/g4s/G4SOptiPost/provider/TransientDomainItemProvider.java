package com.misc.projects.g4s.G4SOptiPost.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import com.misc.common.moplaf.emf.edit.ui.provider.TransientItemProviderAdapter;
import com.misc.projects.g4s.G4SOptiPost.Domain;

public class TransientDomainItemProvider extends TransientItemProviderAdapter 
										implements IEditingDomainItemProvider, 
												    IStructuredItemContentProvider,
												    ITreeItemContentProvider, 
												    IItemLabelProvider, 
												    IItemPropertySource {

		// constructor
		public TransientDomainItemProvider(AdapterFactory adapterFactory, Domain domain) {
			super(adapterFactory);
			domain.eAdapters().add(this);
		}

	/**
	* Return the resource locator for this item provider's resources.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	*/
	@Override
	public ResourceLocator getResourceLocator() {
		return G4SOptiPostEditPlugin.INSTANCE;
	}

}
