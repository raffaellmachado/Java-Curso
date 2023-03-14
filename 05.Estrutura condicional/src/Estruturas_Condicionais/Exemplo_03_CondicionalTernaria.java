package Estruturas_Condicionais;

public class Exemplo_03_CondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
	}
}
/*
 Com o Ternário, não há a necessidade de colocar o IF e o ELSE, pois o mesmo já trata o valor em sua respectiva variavel.

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
*/