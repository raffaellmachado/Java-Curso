package Exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo_02_PilhaDeChamadasDeMetodo {

	public static void main(String[] args) {

		method1();

		System.out.println("End of Program!");
	}

	public static void method1() {
		System.out.println("***METHOD1 START***");	
		method2();	
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			//Mostra toda a chamada de metodos que acarretou a execução (usado para anlisar melhor o que aconteceu).
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Imput Error!");
		}
		System.out.println("***METHOD2 END***");

		sc.close();
	}
}

/* Usar como exemplo

Alex Maria Bob
5

 */
