package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		OrderStatus orderStatus = OrderStatus.DELIVERED;
		OrderStatus orderStatusTwo = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(order);
		System.out.println(orderStatus);
		System.out.println(orderStatusTwo);
	}

}
