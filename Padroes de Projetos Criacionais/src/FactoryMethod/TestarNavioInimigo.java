package FactoryMethod;

import java.util.Scanner;

public class TestarNavioInimigo {

	public static void main(String[] args) {
	
		NavioInimigoFactory fabricaNavio = new NavioInimigoFactory();
		NavioInimigo theEnemy= null;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Qual Tipo de navio você deseja? (U/R/B)");
		
		if(userInput.hasNextLine()) {
			String tipoNavio = userInput.nextLine();
			theEnemy = fabricaNavio.fazerNavio(tipoNavio);
		}
		
		if(theEnemy != null) {
			doSomething(theEnemy);
		}
		
	
	}
	public static void doSomething(NavioInimigo anNavioInimigo) {
		anNavioInimigo.mostrarNavioInimigo();;
		anNavioInimigo.navioHeroi();
		anNavioInimigo.DisparodInimigo();
		
	}
}
