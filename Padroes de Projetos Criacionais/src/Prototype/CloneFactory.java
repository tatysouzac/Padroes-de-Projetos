package Prototype;

public class CloneFactory {

	public Animal getClone(Animal animalSample) {
		return animalSample.fazerClone();
	}
}
