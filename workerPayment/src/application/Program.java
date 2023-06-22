package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		Department department = new Department(departmentName);
		
		System.out.println("Worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, department);
		
		System.out.print("How many contract to this worker: ");
		Integer contracts = sc.nextInt();
		
		for(int i = 0; i < contracts; i++) {
			System.out.println("Enter contract #" + (i+1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			String contractDate = sc.next();
			DateTimeFormatter dateType = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate contractFormattedDate = LocalDate.parse(contractDate, dateType);
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			worker.addContract(new HourContract(contractFormattedDate, valuePerHour, hours));
			sc.nextLine();
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.nextLine();
		
		System.out.println(worker.toString(monthAndYear));
		sc.close();
		
	}

}
