package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Eter Product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name,price,quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println("Entre com a quantidade de produtos para adicionar no estoque: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println("Entre com a quantidade de produtos para retirar do estoque: ");
		int quantity2 = sc.nextInt();
		product.removeProducts(quantity2);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		sc.close();

	}

}
