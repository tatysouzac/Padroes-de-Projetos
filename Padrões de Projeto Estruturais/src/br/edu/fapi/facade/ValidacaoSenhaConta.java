package br.edu.fapi.facade;

public class ValidacaoSenhaConta {
	private int senha = 321;
	
	public int getsenha() {
		return senha;
	}

	public boolean SenhaCheck(int senhaCheck) {

		if (senhaCheck == getsenha()) {
			return true;
		} else {
			return false;
		}

	}
	
}

