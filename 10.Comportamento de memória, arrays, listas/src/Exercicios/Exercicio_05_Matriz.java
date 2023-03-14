package Exercicios;

import java.util.Scanner;

public class Exercicio_05_Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//Instanciando a matriz.
		int[][] mat = new int [n][n];
		
		//Ler a matriz.
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Mostrar a diagnonal principal.
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		//Mostrar os numeros negativos da matriz.
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat [i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}

}

/* Utilizar como exemplo para rodar o programa:

3
5 -3 10
15 8 2
7 9 -4

*/