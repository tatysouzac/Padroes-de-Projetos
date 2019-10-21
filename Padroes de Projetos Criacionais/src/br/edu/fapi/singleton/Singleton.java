package br.edu.fapi.singleton;

public class Singleton {
	
	private Singleton() {
		
	}
	private static Singleton instancia = null;
	public static Singleton getInstancia() {
		if(instancia == null) {
			System.out.println("Instancia Criada");
			instancia = new Singleton();
		}
	return instancia;
	}

}
