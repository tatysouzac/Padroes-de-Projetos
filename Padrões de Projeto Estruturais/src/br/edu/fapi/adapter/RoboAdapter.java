package br.edu.fapi.adapter;

public class RoboAdapter implements Ataque{

	Robo robo;
	
	public RoboAdapter(Robo novoRobo) {
	
		robo = novoRobo;
	}
	
	@Override
	public void arma() {
		robo.ForcoSoco();
		
	}

	@Override
	public void veiculo() {
		robo.Velocidade();
	}

	@Override
	public void motorista(String nome) {
		robo.NomeControlador(nome);
	}

}
