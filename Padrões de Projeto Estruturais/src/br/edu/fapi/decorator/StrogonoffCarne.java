package br.edu.fapi.decorator;

public class StrogonoffCarne extends ToppingDecorator {

	public StrogonoffCarne(Pizza newPizza) {
		super(newPizza);
		System.out.println("Strogonoff de Carne");
		
	}
	public String getDescricao() {
		return tempPizza.getDescricao() + "Carne, Molho, Queijo";
	}
	public double getPreco() {
		return tempPizza.getPreco() + 5.00;
	}

}
