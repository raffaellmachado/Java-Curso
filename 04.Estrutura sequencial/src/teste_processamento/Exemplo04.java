package teste_processamento;

public class Exemplo04 {

	public static void main(String[] args) {

		// Expressões com numeros int = INTEIROS, o resultado será inteiro, neste caso ao invés de 2.5 será 2.0.
		
		int a,b;
		double resultado;
		
		a = 5;
		b = 2;
		
		// Expressões com CAST, inserindo o (double) na variavel o resultado será 2,5.
		// Só descomentar o /* e */
		
		resultado = /* (double) */  a / b;
		
		System.out.println(resultado);
		
	}
}

