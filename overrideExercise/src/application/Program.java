package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		List<Product> productsList = new ArrayList<>();
		
		for(int i = 0; i < numberOfProducts; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				productsList.add(product);
			} else if(productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				Date parsedManufactureDate = sdf.parse(manufactureDate);
				Product product = new UsedProduct(name, price, parsedManufactureDate);
				productsList.add(product);
			} else {
				Product product = new Product(name, price);
				productsList.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for(Product product : productsList) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
