package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio_02_Entrada_e_Saida_Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Captação dos dados em tela;
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
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

/* Usar de exemplo os dados abaixo:

Enter product data: 
Name: TV
Price: 900.00
Quantity in stock: 10

*/
