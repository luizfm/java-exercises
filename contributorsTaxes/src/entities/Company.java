package entities;

import application.Contributor;

public class Company extends Contributor {
	
	private static final Integer LOWER_EMPLOYEES_TAX_LIMIT = 10;
	
	private Integer employeesQuantity;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer employeesQuantity) {
		super(name, anualIncome);
		this.employeesQuantity = employeesQuantity;
	}

	@Override
	public Double totalTaxes() {
		return employeesQuantity > LOWER_EMPLOYEES_TAX_LIMIT ? super.getAnualIncome() * 0.14 : super.getAnualIncome() * 0.16;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(": $ " + String.format("%.2f", totalTaxes()));
		return sb.toString();
	}
}
