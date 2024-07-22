package factory_design_pattern;

import java.util.Scanner;

public class DeveloperClient {

	public static void main(String[] args) {
		System.out.println("Type of Emplyees");
		System.out.println("1. Android Developer");
		System.out.println("2. Web Developer");
		System.out.println("3. Java Developer");
		System.out.println("4. Python Developer");
		
		System.out.println("Enter Developer Type from above mentioned list: ");
		Scanner sc = new Scanner(System.in);
		String employeeType = sc.nextLine();
Employee employee = EmployeeFactory.getEmployee(employeeType);
int salary= employee.getSalary();
System.out.println("Salary of " + employeeType+ " per month = " + salary);

	}

}
