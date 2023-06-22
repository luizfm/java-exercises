package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static DateFormat sdfTwo = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {};
	
	public Order(Client client, OrderStatus status) {
		this.moment = new Date();
		this.status = status;
		this.client = client;
	};
	
	public Client getClient() {
		return client;
	};
	
	public Date getMoment() {
		return moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	};
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	};
	
	public List<OrderItem> getItems() {
		return items;
	};
	
	public void addItem(OrderItem item) {
		items.add(item);
	};
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.00;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:" + "\n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(String.format("%s", status).charAt(0) + String.format("%s", status).substring(1).toLowerCase() + "\n");
		sb.append("Client: ");
		sb.append(client.getName());
		sb.append(" (" + sdfTwo.format(client.getBirthDate()) + ")");
		sb.append(" - " + client.getEmail() + "\n");
		sb.append("Order items:" + "\n");
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", this.total()));
		return sb.toString();
	}
}
