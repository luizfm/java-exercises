package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void raiseSalary(double raisePercentage) {
		this.salary += this.salary * (raisePercentage / 100.0);
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
