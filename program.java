package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products x;
		x = new Products();
		
		System.out.printf("Enter product data:\nName: ");
		x.name = sc.nextLine();
		System.out.print("Price: ");
		x.price = sc.nextDouble();
		System.out.println();
		System.out.print("Quantity: ");
		x.quantity = sc.nextInt();
		System.out.println();

		System.out.println("Product Data: " + x);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock ");
		int quantity = sc.nextInt();
		x.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated Data: " + x);
		System.out.println();
		
		System.out.println("Enter the number of products to be remove from stock ");
		quantity = sc.nextInt();
		x.removeProducts(quantity);
		System.out.println();
		
		System.out.println("Updated Data: " + x);
		System.out.println();
		
		sc.close();
	}

}
