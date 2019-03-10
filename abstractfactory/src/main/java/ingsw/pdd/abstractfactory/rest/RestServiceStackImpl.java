package ingsw.pdd.abstractfactory.rest;

import ingsw.pdd.abstractfactory.impl.IServiceStackAbstractFactory;
import ingsw.pdd.abstractfactory.service.IEmployeeService;
import ingsw.pdd.abstractfactory.service.IProductsService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory {

	//@Override -> Eclipse
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceRestImpl();
	}

	//@Override -> Eclipse
	public IProductsService getProductsService() {
		return new ProductServiceRestImpl();
	}
}