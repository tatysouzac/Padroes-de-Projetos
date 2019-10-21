package br.edu.fapi.abstractfactory;

public class HamburguerNormalFactory extends HamburguerFactory{

	
	public Carne fazerCarne() {
		//  Auto-generated method stub
		return new CarneBovina();
	}

	
	public Molho fazerMolho() {
		// TODO -generated method stub
		return new MolhoTartaro();
	}

	
	public P�o fazerP�o() {
		
		return new P�oGergelin();
	}

}
