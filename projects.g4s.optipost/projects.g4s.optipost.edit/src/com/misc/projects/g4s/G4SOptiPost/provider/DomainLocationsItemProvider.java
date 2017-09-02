package com.misc.projects.g4s.G4SOptiPost.provider;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.GridColumnsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.GridColumnsProvider.ColumnDelegate;
import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.Location;

public class DomainLocationsItemProvider extends TransientDomainItemProvider implements IItemGridsProvider {

	public DomainLocationsItemProvider(AdapterFactory adapterFactory,
			Domain domain) {
		super(adapterFactory, domain);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(G4SOptiPostPackage.Literals.DOMAIN__LOCATIONS);
		}			

		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "Locations";
	}

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	
		newChildDescriptors.add(createChildParameter(G4SOptiPostPackage.Literals.DOMAIN__LOCATIONS,
													 G4SOptiPostFactory.eINSTANCE.createLocation()));
	}
	
	static GridColumnsProvider columns = GridColumnsProvider.constructGridColumnsProvider()
			.addAttribute(G4SOptiPostPackage.Literals.LOCATION__DESCRIPTION);
	
	@Override
	public String getGridText(Object element, Object grid) {
		return this.getText(element);
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		Domain domain = (Domain)this.target;
		return domain.getLocations();
	}
	
	@Override
	public String getRowText(Object element, Object grid, Object row) {
		Location location = (Location)row;
		return location.getLocationID();
	}

	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		return columns;
	}

	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		ColumnDelegate delegate = (ColumnDelegate)column;
		return delegate.getColumnText(element, grid);
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		ColumnDelegate delegate = (ColumnDelegate)column;
		return delegate.getCellValue(element, grid, row);
	}
}
