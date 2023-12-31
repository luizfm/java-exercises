package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char hasInitialDeposit = sc.next().charAt(0);
		
		BankAccount bankAccount;
		
		if(hasInitialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			bankAccount = new BankAccount(accountNumber, holder, initialDeposit);
		} else {
			bankAccount = new BankAccount(accountNumber, holder);
		}
		
		System.out.printf("%nAccount data:%n");
		System.out.println(bankAccount);
		
		System.out.print("Enter a deposit value: ");
		double depositAmount = sc.nextDouble();
		bankAccount.deposit(depositAmount);
		System.out.println("Updated account data:");
		System.out.println(bankAccount);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankAccount.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(bankAccount);
		
		sc.close();
		
	}

}
