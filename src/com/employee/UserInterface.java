package com.employee;

import java.util.Set;

public class UserInterface {
	private static UserInterface userInterfaceInstance;

	public static UserInterface getInstance() {
		if (userInterfaceInstance == null) {
			userInterfaceInstance = new UserInterface();
		}
		return userInterfaceInstance;
	}

	public void add() {
		Employee employee = new Employee();
		employee.id = UtilScanner.getString("Enter Employee Id: ");
		employee.name = UtilScanner.getString("Enter Employee Name: ");
		employee.location = UtilScanner.getString("Enter Employee Location: ");
		EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
		employeeRepository.add(employee);
	}

	public void printAll() {
		EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
		Set<Employee> list = employeeRepository.getEmployeeList();
		for (Employee e : list) {
			System.out.println(e);
		}
	}

	public void delete(String employee) {
		EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
		Employee searchEmp = employeeRepository.getEmployee(employee);
		employeeRepository.delete(searchEmp);
	}

	public void update(String emp1) {
		EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
		Employee searchEmployee = employeeRepository.getEmployee(emp1);
		int choice = UtilScanner.getInt("\nEnter 1 to update Id\n2 to update Name\n3 to update location");
		switch (choice) {
		case 1:
			searchEmployee.id = UtilScanner.getString("Enter New Id: ");
			break;
		case 2:
			searchEmployee.name = UtilScanner.getString("Enter New Name: ");
			break;
		case 3:
			searchEmployee.location = UtilScanner.getString("Enter New Location: ");
			break;
		}
	}
}
