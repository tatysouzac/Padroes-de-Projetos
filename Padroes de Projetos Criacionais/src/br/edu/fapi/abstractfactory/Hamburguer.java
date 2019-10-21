package br.edu.fapi.abstractfactory;

public class Hamburguer {
	
	Pão pão;
	Carne carne;
	Molho molho;
	public Pão getPão() {
		return pão;
	}
	public void setPão(Pão pão) {
		this.pão = pão;
	}
	public Carne getCarne() {
		return carne;
	}
	public void setCarne(Carne carne) {
		this.carne = carne;
	}
	public Molho getMolho() {
		return molho;
	}
	public void setMolho(Molho molho) {
		this.molho = molho;
	}
}
