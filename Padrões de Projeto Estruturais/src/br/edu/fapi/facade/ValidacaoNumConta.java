package br.edu.fapi.facade;

public class ValidacaoNumConta {

	private int numero = 1234;

	public int getnumero() {
		return numero;
	}

	public boolean ContaCheck(int numCheck) {

		if (numCheck == getnumero()) {
			return true;
		} else {
			return false;
		}

	}
}
