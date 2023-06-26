package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		
		List<Contributor> contributorList = new ArrayList<>();
		
		for(int i = 0; i < taxPayers; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char contributorType = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(contributorType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				contributorList.add(new Person(name, anualIncome, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				int employeesQuantity = sc.nextInt();
				contributorList.add(new Company(name, anualIncome, employeesQuantity));
;			}
		}
		
		double totalTaxes = 0.00;
		System.out.println("");
		System.out.println("TAXES PAID:");
		for(Contributor contributor : contributorList) {
			System.out.println(contributor);
			totalTaxes += contributor.totalTaxes();
		}
		
		System.out.println("");
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		

		
		sc.close();
	}

}
