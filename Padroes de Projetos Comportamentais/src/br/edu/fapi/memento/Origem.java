package br.edu.fapi.memento;

public class Origem {
	
	private String book;
	public void set(String newBook) {
		System.out.println("Origem: "+ newBook);
		book = newBook;
	}
	
	public Memento BibliotecaMemento() {
		System.out.println("Salvando no Memento");
		return new Memento(book);
	}
	
	
	public String RestaurarMemento(Memento memento) {
		
		book = memento.getSavedBook();
		System.out.println("Previsa Book Salva no Memento");
		return book;
	}
}
