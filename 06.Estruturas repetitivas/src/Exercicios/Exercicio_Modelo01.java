package Exercicios;

import java.util.Scanner;

public class Exercicio_Modelo01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");	
			}	
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}

/* Insira 2 numeros para comparação.

Exemplos:
	
5 4
7 2 
3 8
5 5
*/