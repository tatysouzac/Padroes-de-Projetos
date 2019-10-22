package br.edu.fapi.facade;

public class ContaBancoFacade {
	private int conta;
	private int senha;
	
	ValidacaoNumConta valiconta;
	ValidacaoSenhaConta valisenha;
	MoneyCheck moneycheck;
	BemVindoBanco bankWelcome;
	
	
	public ContaBancoFacade(int newConta, int newSenha) {
		conta = newConta;
		senha = newSenha;
		
		bankWelcome = new BemVindoBanco();
		valiconta = new ValidacaoNumConta();
		valisenha = new ValidacaoSenhaConta();
		moneycheck = new  MoneyCheck();
	}


	public int getConta() {
		return conta;
	}

	public int getSenha() {
		return senha;
	}
	 
	public void Uhum(double getCash) {
		 if(valiconta.ContaCheck(getConta()) && valisenha.SenhaCheck(getSenha()) && moneycheck.DinheiroSufic(getCash)) {
			 
			 System.out.println("Showw");
		 }else {
			 System.out.println("Naumm :(");
		 }
	}
	
	public void Deposito(double cashdep) {
		if(valiconta.ContaCheck(getConta()) && valisenha.SenhaCheck(getSenha())) {
			 
			 moneycheck.fazerDeposito(cashdep);
		 }else {
			 System.out.println("Naumm :(");
		 }
	}
}
