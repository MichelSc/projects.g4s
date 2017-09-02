package com.misc.projects.g4s.G4SOptiPost.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.Employee;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;

public class DomainEmployeesItemProvider extends TransientDomainItemProvider  implements IItemGridsProvider{

	public DomainEmployeesItemProvider(AdapterFactory adapterFactory,
			Domain domain) {
		super(adapterFactory, domain);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(G4SOptiPostPackage.Literals.DOMAIN__EMPLOYEES);
		}			

		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "Employees";
	}

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	
		newChildDescriptors.add(createChildParameter(G4SOptiPostPackage.Literals.DOMAIN__EMPLOYEES,
													 G4SOptiPostFactory.eINSTANCE.createEmployee()));
	}

	@Override
	public String getGridText(Object element, Object grid) {
		return this.getText(element);
	}

	@Override
	public int getNrColumns(Object element, Object grid) {
		return 0;
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		Domain domain = (Domain)this.target;
		return domain.getEmployees();
	}
	
	@Override
	public String getRowText(Object element, Object grid, Object row) {
		Employee shift = (Employee)row;
		return shift.getEmployeeID();
	}

}
