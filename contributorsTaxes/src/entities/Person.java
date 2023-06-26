package entities;

import application.Contributor;

public class Person extends Contributor {
	
	private static final double LOWER_TAX_LIMIT = 20000.00;
	
	private Double healthExpenses;
	
	public Person() {
		super();
	}
	
	public Person(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	public Double getHelathExpenses() {
		return healthExpenses;
	}

	@Override
	public Double totalTaxes() {
		return (super.getAnualIncome() > LOWER_TAX_LIMIT ? super.getAnualIncome() * 0.25 : super.getAnualIncome() * 0.15) - (healthExpenses * 0.5);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(": $ " + String.format("%.2f", totalTaxes()));
		return sb.toString();
		
	}
}
