package com.employee;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {
	List<Employee> list = new ArrayList<>();

	public void add() {
		Employee employee = new Employee();
		employee.id = UtilScanner.getInt("Enter Employee id: ");
		employee.name = UtilScanner.getString("Enter Employee Name: ");
		employee.location = UtilScanner.getString("Enter Employee location: ");
		list.add(employee);
	}

	public void delete(String employee) {
		for (Employee e : list) {
			if (e.name.equalsIgnoreCase(employee)) {
				list.remove(e);
			}
		}
	}

	public void update(String employee) {
		for (Employee e : list) {
			if (e.name.equalsIgnoreCase(employee)) {
				e.id = UtilScanner.getInt("Enter new id:");
				e.name = UtilScanner.getString("Enter new Name:");
				e.location = UtilScanner.getString("Enter new Location");
			}
		}
	}

	public void display() {
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
