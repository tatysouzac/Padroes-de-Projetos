package br.edu.fapi.adapter;

import java.util.Random;

public class Robo{

	Random generator = new Random();
	
	public void ForcoSoco() {
		int dano = generator.nextInt(10)+1;
		System.out.println("O soco robo dá "+ dano +" de dano! ");
	}
	
	public void Velocidade() {
		int velocidade = generator.nextInt(6)+2;
		System.out.println("A velocidade do robo é de: " + velocidade);
	}
	 
	public void NomeControlador(String nome) {
		System.out.println("Quem controla o roba é o/a "+ nome);
		
	}
}
