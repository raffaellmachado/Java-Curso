package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Exemplo_03_Version_03_Estatico {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		// Chamada da função circumference da classe "Calculator".
		double c = Calculator.circumference(radius);
		// Chamada da função volume da classe "Calculator".
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n" , c);
		System.out.printf("Volume: %.2f%n" , v);
		System.out.printf("PI value: %.2f%n" , Calculator.PI);
		
		sc.close();
	}

}
