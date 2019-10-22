package br.edu.fapi.adapter;

import java.util.Random;

public class Tank implements Ataque {
	
	Random generator = new Random();

	@Override
	public void arma() {
		int dano = generator.nextInt(10)+1;
		
		System.out.println("Tanque da"+ dano +" de dano!");
		
	}

	@Override
	public void veiculo() {
		int velocidade = generator.nextInt(50)+1;
		System.out.println("A velocidade do tanque é de "+ velocidade);
		
	}

	@Override
	public void motorista(String nome) {
		System.out.println("O nome do motorista é: " + nome);
		
		
	}

}
