package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the list size: ");
		int listSize = sc.nextInt();
		Product[] productList = new Product[listSize];
		
		for(int i = 0; i < productList.length; i++) {
			System.out.print("Enter product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Enter product price: ");
			double productPrice = sc.nextDouble();
			
			productList[i] = new Product(productName, productPrice);
		}
		
		double sumProductsPrice = 0.00;
		for(int i = 0; i < productList.length; i++) {
			sumProductsPrice += productList[i].getPrice();
		}
		double averagePrice = sumProductsPrice / productList.length;
		
		System.out.printf("%nThe average price of the registered products are: $ %.2f", averagePrice);
		
		sc.close();
	}

}
