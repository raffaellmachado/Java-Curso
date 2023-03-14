package Exemplos;

public class Exemplo_For_Each {

	public static void main(String[] args) {

/*		for (Tipo apelido : coleção) {
			<comando 1>
			<comando 2>
*/			
		
	
		String[] vect = new String[] {"Maria", "Bob","Alex"};
		
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);;	
		}
		
		System.out.println("-----------------");
		
		for (String xD : vect) {
			System.out.println(xD);
		}
	}

}
