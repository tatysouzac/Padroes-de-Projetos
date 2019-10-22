package br.edu.fapi.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Massa fina";
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 20.00;
	}

}
