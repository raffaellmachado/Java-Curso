package entities;

//Compilador não deixa herdar a classe SavingsAccount por conter FINAL
public class SavingsAccountPlus extends SavingsAccount {

	//O erro aparece porque o método não pode ser sobreposto pela palavra FINAL na superclasse.
	@Override
	public final void withdraw(double amount) {
		balance -= amount + 2.0;
	}	
	
}
