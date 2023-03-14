package teste_processamento;

import java.util.Scanner;

public class Exemplo07_EntradaDeDados_TipoInteiro {

		public static void main(String[] args) {

			// Declaração do Scanner sc para receber os dados digitados.
			Scanner sc = new Scanner(System.in);
			
			int x;
			
			// Para o programa quando iniciado, para poder digitar o valor INTEIRO, nota-se que agora usamos o (nextInt).
			x = sc.nextInt();
			
			System.out.println("Voce digitou: " + x);
			
			// sc.close utilizado para fechar a condição do Scanner
			sc.close();
	}

}
