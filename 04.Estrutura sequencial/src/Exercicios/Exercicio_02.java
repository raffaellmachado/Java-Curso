package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, R, pi = 3.14159;
		
		System.out.print("Digite o valor para calcular o PI: " );
		R = sc.nextDouble();
		
	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();
		;
	}

}

/* ----------------------------------------CORREÇÃO ------------------------------------------------ 

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

double R, A, pi = 3.14159;

R = sc.nextDouble();

A = pi * R * R;

System.out.printf("A=%.4f%n", A);

sc.close();

*/