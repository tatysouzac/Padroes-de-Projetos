package Prototype;

public class Ovelha implements Animal{

	public Ovelha() {
		System.out.println("Ovelha esta feita");
	}

	
	public Animal fazerClone() {
	System.out.println("Ovelha esta sendo feita");
	Ovelha ovelhaObject = null;
	
	try {
	ovelhaObject = (Ovelha) super.clone();
	}catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}	
	return ovelhaObject;
	}
	
	public String toString() {
		return "Bייייייh";
				
	}
	
}
