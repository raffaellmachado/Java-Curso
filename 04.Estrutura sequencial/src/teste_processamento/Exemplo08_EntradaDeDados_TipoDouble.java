package teste_processamento;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo08_EntradaDeDados_TipoDouble {

	public static void main(String[] args) {

		//Localidade onde troca a , por .
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanner sc para receber os dados digitados.
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		// Pausa o programa quando iniciado, para poder digitar o valor DOUBLE (Numero com ponto flutuante), nota-se que agora usamos o (nextDouble).
		x = sc.nextDouble();
		
		// Com 1 casa decimal.
		System.out.println("Voce digitou: " + x);
		
		// Com 2 casas decimais.
		System.out.printf("Voce digitou: %.2f%n", x);
		
		// sc.close utilizado para fechar a condição do Scanner
		sc.close();
	}

}
