package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio_02_Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		// Declaração do Vetor utilizando a classe Product.
		Product[] vect = new Product[n];
		
		//Laço para inserir os valores no vetor.
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			// Insere os dados nas posições instanciadas name e price
			vect[i] = new Product(name,price);
		}
		
		// Laço para incrementar os valores digitados.
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		// Calcular a média de valores.
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
