package Exemplos;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Exemplo_03_Override {

	public static void main(String[] args) {

		//Utilizando o método "WithDraw" da classe Account.
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);	
		System.out.println(acc1.getBalance());
		
		//Utilizando o método WithDraw" com @Override da classe SavingsAccount.
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//Utilizano o método WithDraw com super utilizando a superclasse.
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
}
