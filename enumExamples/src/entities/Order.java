package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Date getMoment() {
		return this.moment;
	}
	
	public OrderStatus getStatus() {
		return this.status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
