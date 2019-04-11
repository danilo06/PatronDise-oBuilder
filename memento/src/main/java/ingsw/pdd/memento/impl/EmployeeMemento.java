package ingsw.pdd.memento.impl;

import ingsw.pdd.memento.entity.Employee;

public class EmployeeMemento {

	private Employee employee;

	public EmployeeMemento(Employee employee) {
		this.employee = employee;
	}

	public Employee getMemento() {
		return employee;
	}
}