package br.edu.fapi.decorator;

public class FazerPizza {
	public static void main(String[] args) {
		Pizza basicPizza = new QuatroQueijosPizza(new PlainPizza());
		
		System.out.println("Ingredientes: " + basicPizza.getDescricao());
		System.out.println("Preço: " + basicPizza.getPreco());
	}

}
