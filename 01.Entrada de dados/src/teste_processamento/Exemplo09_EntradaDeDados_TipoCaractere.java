package teste_processamento;

import java.util.Scanner;

public class Exemplo09_EntradaDeDados_TipoCaractere {

	public static void main(String[] args) {

		// Declaração do Scanner sc para receber os dados digitados.
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		// Para o programa quando iniciado, para poder digitar o valor e na sequencia com a função "charAT(0)" pegará apenas o primeiro caractere digitado.
		x = sc.next().charAt(0);
		
		System.out.println("Voce digitou: " + x);
		
		// sc.close utilizado para fechar a condição do Scanner
		sc.close();
	}

}
