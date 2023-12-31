package entities;

public class BankAccount {
	public static final double WITHDRAW_TAX = 5.00;

	private int accountNumber;
	private String holder;
	private double balance;

	public BankAccount(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public BankAccount(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public String getHolder() {
		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			this.balance -= amount + WITHDRAW_TAX;
		}
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f%n", balance);
	}
}
