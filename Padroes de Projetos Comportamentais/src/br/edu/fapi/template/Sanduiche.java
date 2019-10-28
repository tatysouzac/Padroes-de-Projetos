package br.edu.fapi.template;

public abstract class Sanduiche {

	final void fazerSanduiche() {
		cortarPão();
		
		
		if(clientePedeTomate()) {
			addTomate();
		}
		if(clientePedeAlface()) {
			addAlface();
		}
		if(clientePedeCarne()) {
			addCarne();
		}
		if(clientePedePate()) {
			addPate();
		}
		embrulharSanduiche();
	}
	public void cortarPão() {
		System.out.println("Pão cortado");
	}
	public void embrulharSanduiche() {
		System.out.println("Sanduiche Embrulhado");
	}
	
	abstract void addTomate();
	
	boolean clientePedePate() {return true;}
	
	abstract void addPate();
	
	abstract void addCarne();
	
	boolean clientePedeCarne() {return true;}
	
	boolean clientePedeTomate() {return true;}
	
	abstract void addAlface();
	
	boolean clientePedeAlface() {return true;}
}
