package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Modelo02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		 
		 double a = sc.nextDouble();
		 double b = sc.nextDouble();
		 double c = sc.nextDouble();
		 
		 double delta = b * b - 4.0 * a * c;
		 
		 if(a == 0 || delta < 0.0) {
			 System.out.println("Impossivel Calcular");
		 }
		 else {
			 double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			 double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			 
			 System.out.printf("R1 = %.5f%n", r1);
			 System.out.printf("R2 = %.5f%n", r2);
			 
		sc.close();
		 }
	}

}
 /* Use de exemplo os numeros para os calculos: 

Exemplo1: 10.0 20.1 5.1
Exemplo2: 0.0 20.0 5.0
Exemplo3: 10.3 203.0 5.0
Exemplo4: 10.0 3.0 5.0

https://www.youtube.com/watch?v=3lhkB5I8P6E

*/