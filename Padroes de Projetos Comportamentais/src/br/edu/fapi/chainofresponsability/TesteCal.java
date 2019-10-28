package br.edu.fapi.chainofresponsability;

public class TesteCal {

	public static void main(String[] args) {
		Chain chain1 = new SomaNumbers();
		Chain chain2 = new SubtracaoNumbres();
		
		chain1.setNextChain(chain2);
		
		Numbers request = new Numbers(2, 2, "soma");
		chain1.calculete(request);
		
	}
}
