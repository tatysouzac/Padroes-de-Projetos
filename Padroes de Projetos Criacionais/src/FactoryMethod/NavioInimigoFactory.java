package FactoryMethod;

public class NavioInimigoFactory {

	public NavioInimigo fazerNavio(String newTipoNavio ) {
		
		NavioInimigo newNavio = null;
		if(newTipoNavio.equals("U")) {
			return new UFONavioInimigo();
		
		}else if(newTipoNavio.equals("R")) {
			
			return new RocketNavioInimigo();
			
		}else if(newTipoNavio.equals("B")) {
			
			return new BigUFONavioInimigo();
			
		}else return null;
		
	}
}
