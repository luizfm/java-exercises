package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1081, "Fatima", 500.00);

		BusinessAccount businessAccount = new BusinessAccount(1080, "Alex Green", 500.00, 500.00);	

		
		// Upcasting
		
		Account acc2 = businessAccount;
		Account acc3 = new BusinessAccount(1083, "Jorge", 500.00, 500.00);
		Account acc4 = new SavingsAccount(1086, "Marcia", 500.00, 10.00);

		
		// DownCasting
	
		BusinessAccount acc5 = (BusinessAccount)acc3;
		acc5.loan(100.00);
		
		System.out.println(acc3.getBalance());
		
		if(acc4 instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount)acc4;
			bacc2.loan(200.00);
			System.out.println("Loan done!");
		}
		
		if(acc4 instanceof SavingsAccount) {
			SavingsAccount sacc = (SavingsAccount)acc4;
			sacc.updateBalance();
			System.out.println("Updated");
		}
	}

}
