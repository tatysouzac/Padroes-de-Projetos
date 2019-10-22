package br.edu.fapi.decorator;

abstract class ToppingDecorator implements Pizza{

		protected Pizza tempPizza;
		
		public ToppingDecorator(Pizza newPizza) {
			tempPizza = newPizza;
		}
		
		public String getDescricao() {
			return tempPizza.getDescricao();
		}
		public double getPreco() {
			return tempPizza.getPreco();
		}
}
