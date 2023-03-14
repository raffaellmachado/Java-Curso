package Exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo_Listas {

	public static void main(String[] args) {

		// Declarando e instanciando a Lista do tipo de classe ArrayList.
		List<String> list = new ArrayList<>();
		
		list.add("Rafael");
		list.add("Arthur");	
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//adicionando elemento na lista
		list.add(2, "Marco");
		list.add(3, "Rafael");
		
		//Ver o tamanho da lista.
		System.out.println(list.size());
		
		//removendo elemento da lista.
		//list.remove("Anna");	
		
		// For para percorrer lista.
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");	
	
		//Remover todos que começam com a letra M (Predicado)
		list.removeIf(x -> x.charAt(0) == 'M');		
		
		// For para percorrer lista.
		for (String x : list) {
			System.out.println(x);
		}	
		
		System.out.println("-------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("-------------------");	
		
		//Filtrar apenas os nomes que começam com a letra A.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		// For para percorrer lista.
		for (String x : result) {
			System.out.println(x);
		}	
		
		System.out.println("-------------------");
		
		//Encontrar o primeiro elemento com a letra A, caso procure algum elemento que não exista na lista, o mesmo retorna Null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
