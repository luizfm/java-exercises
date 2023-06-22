package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> hourContracts = new ArrayList<>();
	
	public Worker() {}
	
	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public WorkerLevel getLevel() {
		return this.level;
	}
	
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public Double getBaseSalary() {
		return this.baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		hourContracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		hourContracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		List<HourContract> filteredList = this.hourContracts.stream().filter(contract -> contract.getDate().getYear() == year && contract.getDate().getMonthValue() == month).collect(Collectors.toList());
		List<Double> totalIncomeListAtProvidedMonth = filteredList.stream().map(contract -> contract.totalValue()).collect(Collectors.toList());
		
		double totalIncome = totalIncomeListAtProvidedMonth.stream().reduce(0.0, (subtotal, contract) -> subtotal + contract);
		return totalIncome + baseSalary;
	}
	
	public String toString(String date) {
		String[] monthAndYear = date.split("/");
		Integer month = Integer.parseInt(monthAndYear[0]);
		Integer year = Integer.parseInt(monthAndYear[1]);
		return "Name: " + name + String.format("%nDepartment: ")+  department.getName() + String.format("%nIncome for ") + date + ": " + String.format("%.2f", income(year, month));
	}
}
