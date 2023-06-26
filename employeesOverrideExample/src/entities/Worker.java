package entities;

public class Worker {
	private String name;
	private Integer hour;
	private Double hourRate;
	
	public Worker() {};
	
	public Worker(String name, Integer hour, Double hourRate) {
		this.name = name;
		this.hour = hour;
		this.hourRate = hourRate;
	};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public double getHourRate() {
		return hourRate;
	}
	
	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}
	
	public double payment() {
		return hour * hourRate;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" - $ ");
		sb.append(String.format("%.2f", payment()));
		
		return sb.toString();
	}
}
