package com.employee;

import java.util.ArrayList;
import java.util.List;

// Data layer / Model layer
public class EmployeeRepository {
	List<Employee> list = new ArrayList<>();

	public void add(Employee employee) {
		list.add(employee);
	}

	public void remove(Employee employee) {
		list.remove(employee);
	}

	public void printEmployee() {
		for (Employee z : list) {
			System.out.println(z);
		}
	}

	public Employee getEmployee(String employee) {
		for (Employee i : list) {
			if (i.name.equalsIgnoreCase(employee)) {
				return i;
			}
		}
		return null;
	}
}
