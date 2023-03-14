package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// Declaração do Vetor.
		double[] vect = new double[n];
		
		//Laço para inserir os valores no vetor.
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		// Laço para incrementar os valores digitados.
		double sum = 0.0;
			for (int i=0; i<n; i++) {
				sum += vect[i];
		}
		
		// Calcular a média de valores.
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}

}

/* Exemplo para utilização do código

3
1.72
1.56
1.80

*/