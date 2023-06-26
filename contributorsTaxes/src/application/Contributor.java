package application;

public abstract class Contributor {
	private String name;
	private Double anualIncome;
	
	public Contributor() {};
	
	public Contributor(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnualIncome() {
		return anualIncome;
	}
	
	public abstract Double totalTaxes();
}
