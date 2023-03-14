package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exemplo_02_GetSet {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		
		// Instanciando o objeto e chamando o Contrutor sobrecarregado apenas com 2 argumentos "Name e Price"
		Product product = new Product(name, price);
		
		
		//CHAMANDO os GET e SET Privados.
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated name: " + product.getPrice());
		
		
		// Chamada do método toString da classe Product.
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		//Atualiza a quantidade dentro do objeto Product chamando a função addProducts.
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		
		//Atualiza e remove a quantidade dentro do objeto Product chamando a função removeProducts.
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
				
		sc.close();
	}

}
