package br.edu.fapi.template;

public class sanduichePraiaVegano extends Sanduiche{

	boolean clientePedeCarne() {return false;}
	@Override
	void addTomate() {
		System.out.println("Adicionando Tomate");
		
	}

	@Override
	void addPate() {
		System.out.println("Adicionando Pate");
	}

	@Override
	void addCarne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addAlface() {
		System.out.println("Adicionando Alface");
		
	}

}
