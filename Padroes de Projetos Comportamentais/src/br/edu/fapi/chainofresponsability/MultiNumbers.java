package br.edu.fapi.chainofresponsability;

public class MultiNumbers implements Chain {

	private Chain nextInchain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInchain = nextChain;
		
	}

	@Override
	public void calculete(Numbers request) {
		if(request.getOperacao() == "multiplicar") {
			System.out.println(request.getN1() + "*" + request.getN2() + " = " + (request.getN1()*request.getN2()));
			
		}else {
			nextInchain.calculete(request);
		}
		
	}
}
