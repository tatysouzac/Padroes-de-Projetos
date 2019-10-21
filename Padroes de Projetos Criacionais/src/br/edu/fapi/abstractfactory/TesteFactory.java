package br.edu.fapi.abstractfactory;

public class TesteFactory {
	
	private static Hamburguer montarHamburger(String tipo) {
		HamburguerFactory hf = null;
		switch(tipo) {
		case "vegetariano":
			hf = new HamburguerVegetarianoFactory();
			break;
		case "normal":
			hf= new HamburguerNormalFactory();
		}
	Hamburguer hamburguer = new Hamburguer();
	hamburguer.setCarne(hf.fazerCarne());
	hamburguer.setMolho(hf.fazerMolho());
	hamburguer.setPão(hf.fazerPão());
	return hamburguer;
	}
	
	public static void main(String[] args) {
		Hamburguer h1 = montarHamburger("vegetariano");
		Hamburguer h2 = montarHamburger("normal");
		System.out.println("rode em debug :)");
	}
}
