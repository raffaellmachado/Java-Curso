package application;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_03_Version_01 {

	//Declaração de PI como constante, utilizando "final" para falar que o valor uma vez atribuido não muda mais.
	//Padrão de nome de constantes sempre em maiusculo exemplo: "PI"
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		// Chamada da função circumference no abaixo do final deste bloco
		double c = circumference(radius);
		// Chamada da função volume no abaixo do final deste bloco.
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n" , c);
		System.out.printf("Volume: %.2f%n" , v);
		System.out.printf("PI value: %.2f%n" , PI);
		
		sc.close();
	}
	/*Funções declaradas como estaticos, pois o método main é estatico, 
	o compilador não deixa chamar o método que não é estatico dentro de uma main estatico.*/
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
