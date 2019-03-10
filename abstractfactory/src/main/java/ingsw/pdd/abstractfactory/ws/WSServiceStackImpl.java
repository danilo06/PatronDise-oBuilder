package ingsw.pdd.abstractfactory.ws;

import ingsw.pdd.abstractfactory.impl.IServiceStackAbstractFactory;
import ingsw.pdd.abstractfactory.service.IEmployeeService;
import ingsw.pdd.abstractfactory.service.IProductsService;

public class WSServiceStackImpl implements IServiceStackAbstractFactory {

	// @Override por eclipse
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceWSImpl();
	}

	//@Override por eclipse
	public IProductsService getProductsService() {
		return new ProductServiceWSImpl();
	}
}