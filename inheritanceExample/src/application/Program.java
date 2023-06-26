package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1080, "Maria Brown", 1000.00);
		Account acc2 = new SavingsAccount(1081, "Alex Green", 1000.00, 0.01);
		Account acc3 = new BusinessAccount(1082, "Julia White", 1000.00, 500.00);
		
		acc1.withdraw(100.00);
		acc2.withdraw(100.00);
		acc3.withdraw(100.00);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		System.out.println(acc3.getBalance());
	}

}
