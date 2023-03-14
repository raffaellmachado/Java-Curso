package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
			
		}else {
			System.out.println("PASS");
		}
		sc.close();
	}	
}

/* Exemplos a ser usado no programa
Para aprovação:

Rafael Machado
27.00
31.00
32.00

Para reprovação:

Rafael Machado
17.00
20.00
15.00
*/