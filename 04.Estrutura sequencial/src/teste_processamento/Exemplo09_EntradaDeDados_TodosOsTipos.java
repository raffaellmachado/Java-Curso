package teste_processamento;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo09_EntradaDeDados_TodosOsTipos {

	public static void main(String[] args) {

		//Localidade onde troca a , por .
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanner sc para receber os dados digitados.
		Scanner sc = new Scanner(System.in);
		
		// Variaveis com seus respectivos tipos.
		String x;
		int y;
		double z;
		
		// Para o programa quando iniciado, para poder digitar is valores de String, Inteiro e Double.
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();		
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// sc.close utilizado para fechar a condição do Scanner
		sc.close();
	}

}
