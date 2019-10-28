package br.edu.fapi.chainofresponsability;

public class Numbers {

	private int n1;
	private int n2;

	private String operacao;
	
	public Numbers(int newn1, int newn2, String newoperacao) {
		n1 = newn1;
		n2 = newn2;
		operacao = newoperacao;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
}
