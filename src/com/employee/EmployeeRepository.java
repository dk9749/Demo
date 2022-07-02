package com.employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository {
	private static EmployeeRepository employeeRepositoryInstance;
	Set<Employee> list = new HashSet<Employee>();

	public static EmployeeRepository getInstance() {
		if (employeeRepositoryInstance == null) {
			employeeRepositoryInstance = new EmployeeRepository();
		}
		return employeeRepositoryInstance;
	}

	public void add(Employee employee) {
		list.add(employee);
	}

	public Set<Employee> getEmployeeList() {
		return list;
	}

	public void delete(Employee searchEmp) {
		list.remove(searchEmp);
	}

	public Employee getEmployee(String employee) {
		for (Employee e : list) {
			if (e.name.equalsIgnoreCase(employee)) {
				return e;
			}
		}
		return null;
	}
}
