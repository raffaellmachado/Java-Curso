package teste_processamento;

// Biblioteca inserida para a funcionalidade Scanner
import java.util.Scanner;

public class Exemplo06_EntradaDeDados_TipoString {

	public static void main(String[] args) {

		// Declaração do Scanner sc para receber os dados digitados.
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		// Para o programa quando iniciado, para poder digitar o valor.
		x = sc.next();
		
		System.out.println("Voce digitou: " + x);
		
		// sc.close utilizado para fechar a condição do Scanner
		sc.close();
	}

}
