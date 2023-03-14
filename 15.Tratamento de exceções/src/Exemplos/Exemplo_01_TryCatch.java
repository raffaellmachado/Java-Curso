package Exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo_01_TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		}
		catch(InputMismatchException e) {
			System.out.println("Imput Error!");
		}
		
		System.out.println("End of Program!");
		
		sc.close();
	}

}
