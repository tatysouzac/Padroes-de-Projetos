package br.edu.fapi.adapter;

public class TestarAtaques {

	public static void main(String[] args) {
		Tank slakk = new Tank();
		Robo frank = new Robo();
		Ataque roboAdapter = new RoboAdapter(frank);
		System.out.println("O robo");
		frank.ForcoSoco();
		frank.NomeControlador("Taty");
		frank.Velocidade();
		
		System.out.println("Tanque de Guerra");
		slakk.arma();
		slakk.motorista("João");
		slakk.veiculo();
		
		System.out.println("Robo Adaptado");
		roboAdapter.arma();
		roboAdapter.motorista("TatyMestre");
		roboAdapter.veiculo();
		
	}
	
}
