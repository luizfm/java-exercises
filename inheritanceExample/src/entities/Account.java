package entities;

public class Account {
	private static final double WITHDRAW_TAX = 5.00;
	
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {};
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + WITHDRAW_TAX;
	}
	
}
