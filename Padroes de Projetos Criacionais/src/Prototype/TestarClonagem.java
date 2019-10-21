package Prototype;

public class TestarClonagem {
	 public static void main(String[] args) {
		CloneFactory fazerAnimal = new CloneFactory();
		
		Ovelha nona = new Ovelha();
		Ovelha clonedOvelha = (Ovelha) fazerAnimal.getClone(nona);
		System.out.println(nona);
		System.out.println(clonedOvelha);
	}
}
