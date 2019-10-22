package br.edu.fapi.facade;

public class MoneyCheck {
	private double cash = 1000.00;

	public double getcash() {
		return cash;
	}

	public void Sacar(double valueSacar) {
		cash -= valueSacar;
	}

	public void Depositar(double valueDepositar) {
		cash += valueDepositar;
	}
	
	public boolean DinheiroSufic(double dinheiro) {
		if(dinheiro > getcash()) {
			System.out.println("Você mão tem dinheiro suficiente");
		return false;
		}else {
			Sacar(dinheiro);
			System.out.println("Retire seu dinheiro");
			return true;
		}
	}
	public void fazerDeposito(double dindinDep) {
		Depositar(dindinDep);
		System.out.println("Deposito Feito!");
	}

}
