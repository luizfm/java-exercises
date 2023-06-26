package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.OutsourcedWorker;
import entities.Worker;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = sc.nextInt();

		
		List<Worker> employeesList = new ArrayList<>();
		
		for(int i = 0; i < numberOfEmployees; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
						
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double hourRate = sc.nextDouble();
			
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				employeesList.add(new OutsourcedWorker(name, hours, hourRate, additionalCharge));
			} else {
				employeesList.add(new Worker(name, hours, hourRate));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Worker worker : employeesList) {
			System.out.println(worker);
		}
		
		sc.close();
		
	}

}
