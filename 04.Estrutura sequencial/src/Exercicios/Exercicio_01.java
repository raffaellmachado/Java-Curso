package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		int valor2 = 0;

		
		System.out.println("Digite o primeiro valor a ser somado: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor para obter o resultado da soma:");
	    valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
	    
		System.out.println("O resultado da SOMA = " + soma);
		
		sc.close();
	}

}

/* ----------------------------------------CORREÇÃO ------------------------------------------------ 

Scanner sc = new Scanner(System.in);

int A, B, soma;

A = sc.nextInt();
B = sc.nextInt();

soma = A + B;

System.out.println("SOMA = " + soma);

sc.close();

*/