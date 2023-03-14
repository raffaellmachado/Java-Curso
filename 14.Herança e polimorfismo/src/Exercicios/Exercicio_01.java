package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Declaração da lista para inserir os funcionarios.
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number os employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Employee # " + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				//Adicionando as informações digitadas na lista Employee.
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}
			else {
				//Adicionando as informações digitadas na lista Employee.
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		//Imprimindo cada funcionario adicionado na lista.
		for (Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
	}

}
