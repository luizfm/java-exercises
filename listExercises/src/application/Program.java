package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int employees = sc.nextInt();
		List<Employee> employeesList = new ArrayList<>();

		for (int i = 0; i < employees; i++) {
			System.out.println();
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employeesList.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		
		Employee selectedEmployee = employeesList.stream().filter(employee -> employee.getId() == employeeId)
				.findFirst().orElse(null);
		
		if (selectedEmployee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			selectedEmployee.raiseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : employeesList) {
			System.out.println(employee);
		}

		sc.close();
	}

}
