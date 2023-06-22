package entities;

import java.time.LocalDate;

public class HourContract {
	private LocalDate date;
	private Double valuesPerHour;
	private Integer hours;
	
	public HourContract() {
		
	}
	
	public HourContract(LocalDate date, Double valuesPerHour, Integer hours) {
		this.date = date;
		this.valuesPerHour = valuesPerHour;
		this.hours = hours;
	}
	
	public Double totalValue() {
		return valuesPerHour * hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getValuesPerHour() {
		return valuesPerHour;
	}


	public Integer getHours() {
		return hours;
	}
}
