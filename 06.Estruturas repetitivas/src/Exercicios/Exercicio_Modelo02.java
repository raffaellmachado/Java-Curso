package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Modelo02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		
		if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n",media);
		}
		else {
			System.out.println("Impossivel calcular.");
		}
		
		sc.close();
	}

}

/* Insira um valor de idade que seja maior do que 0.
Exemplos:
	
31
27
46
-5

Quando inserir valores negativos, o programa para e realiza o valor da média das idades.
*/
