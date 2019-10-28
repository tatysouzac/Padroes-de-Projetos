package br.edu.fapi.chainofresponsability;

public interface Chain {

	public void setNextChain(Chain nextChain);
	public void calculete(Numbers request);
	
}
