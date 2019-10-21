package br.edu.fapi.abstractfactory;

public class HamburguerVegetarianoFactory extends HamburguerFactory{

	
	public Carne fazerCarne() {
		
		return new CarneVegetal();
	}

	
	public Molho fazerMolho() {
		// TODO Auto-generated method stub
		return new MolhoMaionese();
	}

	
	public P�o fazerP�o() {
		// TODO Auto-generated method stub
		return new P�oIntegral();
	}

}
