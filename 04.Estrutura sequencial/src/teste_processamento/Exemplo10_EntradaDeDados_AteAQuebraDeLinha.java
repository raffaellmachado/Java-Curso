package teste_processamento;

import java.util.Scanner;

public class Exemplo10_EntradaDeDados_AteAQuebraDeLinha {

	public static void main(String[] args) {

		// Declaração do Scanner sc para receber os dados digitados.
		Scanner sc = new Scanner(System.in);
		
		// Declaração das Variaveis.
		String s1, s2, s3;
		
		// Para o programa quando iniciado, para poder digitar o texto e após apertar o Enter 3x e imprimir o que digitou.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// sc.close utilizado para fechar a condição do Scanner
		sc.close();
		
	}

}
