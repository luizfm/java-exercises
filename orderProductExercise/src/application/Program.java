package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
	
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(new Client(name, email, sdf.parse(birthDate)), OrderStatus.valueOf(status));
		
		System.out.print("How many items to this order? ");
		int itemsQuantity = sc.nextInt();
		
		for(int i = 0; i < itemsQuantity; i++) {
			sc.nextLine();
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
		
	}

}
