package FactoryMethod;

public abstract class NavioInimigo {
	private String name;
	private double damage;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double newDamage) {
		damage = newDamage;
	}
	
	public void navioHeroi() {
		System.out.println(getName() + " esta seguindo o navio do heroi");
	}
	
	public void mostrarNavioInimigo() {
		System.out.println(getName() + " esta na tela");
	}
	
	public void DisparodInimigo() {
		System.out.println(getName() + " esta atancando e o dano é " + getDamage());
	}
}
