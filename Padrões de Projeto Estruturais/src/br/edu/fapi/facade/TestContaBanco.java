package br.edu.fapi.facade;

public class TestContaBanco {
	public static void main(String[] args) {
		
		ContaBancoFacade acessar = new ContaBancoFacade(1234, 321);
		acessar.Deposito(200.00);
		
	}

}
