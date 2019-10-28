package br.edu.fapi.memento;

import java.util.ArrayList;

public class Bibliotecario {

	ArrayList<Memento> savedBook = new ArrayList<Memento>();
	
	public void addMemento(Memento m) {
		savedBook.add(m);
	}
	
	public Memento getMemento(int index) {
		return savedBook.get(index);
	}
}
