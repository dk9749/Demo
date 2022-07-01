package com.employee;

import java.util.InputMismatchException;

// control layer
public class Application {
	public static void main(String[] args) {
		controller();
	}

	private static void controller() {
		System.out.println("Welcome to Employee Program");
		UserInterface userInterface = new UserInterface();
		EmployeeRepository employeeRepository = new EmployeeRepository();
		boolean flag = true;
		while (flag) {
			try {
				int choice = UtilScanner
						.getInt("\nPlease Enter \n 1 to add \n 2 to delete\n 3 to update \n 4 to display \n 5 to exit");
				switch (choice) {
				case 1:
					userInterface.add();
					break;
				case 2:
					String emp = UtilScanner.getString("Enter name to delete: ");
					userInterface.delete(emp);
					break;
				case 3:
					String emp1 = UtilScanner.getString("Enter name to update: ");
					userInterface.update(emp1);
					break;
				case 4:
					userInterface.display();
					break;
				case 5:
					System.out.println("Exit !!");
					flag = false;
					break;
				default:
					System.out.println("Please Enter valid Input !!");
				}
			} catch (InputMismatchException e) {
				System.out.println(e);
				break;
			}
		}
	}
}
