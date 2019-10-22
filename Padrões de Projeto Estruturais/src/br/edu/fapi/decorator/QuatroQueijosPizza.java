package br.edu.fapi.decorator;

public class QuatroQueijosPizza extends ToppingDecorator {

	public QuatroQueijosPizza(Pizza newPizza) {
		super(newPizza);
		System.out.println("Quatro Queijos Pizza");
		
	}

	public String getDescricao() {
		return tempPizza.getDescricao() + "Muçarella, Gorgonsola, Provolone, Oregano";
	}
	public double getPreco() {
		return tempPizza.getPreco();
	}

}
