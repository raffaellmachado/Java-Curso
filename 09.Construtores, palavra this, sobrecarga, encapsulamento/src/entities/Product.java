package entities;

public class Product {
	
	//Atributos public sem GET SET = Exemplo_01_Construtores.
	/*
	public String name;
	public double price;
	public int quantity;
	*/
	
	// Atributos private com GET SET = Exemplo_02_GetSet
	private String name;
	private double price;
	private int quantity;
	
	// CONSTRUTOR Padrão.
	public Product () {
	}
	
	// CONSTRUTOR da classe Product sempre antes dos métodos e depois dos atributos (Variaveis). 
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// SOBRECARGA = CONSTRUTOR SOBRECARREGADO. Pois neste caso, sabemos que a quantidade inicia com 0 por padrão.
	// Neste caso é disponibilizar mais de uma versão da mesma operação, a unica diferença é a lista de parametros.
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}

	//GET SET para proteger os dados quando os atributos estiverem como PRIVATE
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Criado somente o getQuantity pois retorna a quantidade para proteger o objeto produto de alterações na quantidade.
	public int getQuantity() {
		return quantity;
	}
	
	// Métodos.
	public double totalValueInStock(){
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; 
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f%n", totalValueInStock());
	}
}
