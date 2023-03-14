package Estruturas_Repetitivas;

import java.util.Scanner;

public class Exemplo_02_While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
// Condição de repetição While.		
		while (x != 0) {
/* O valor soma recebe o valor de x e conforme entra no bloco de While,
o mesmo realiza a soma dos numeros digitados */			
			soma = soma + x;
//Caso não seja satisfeito o While, o programa pede para inserir novamente outro numero.			
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
