package io.keepcoding.javadesdecero.libreria.model;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int count;
	
	//private int i=0;
	
	public Book(String title,
			String author) {
		this(title, author, Integer.toString(i++), 0);
	}
	
	public Book(
			String title,
			String author,
			int count
			) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.count = count;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Titulo: %s | IBAN: %s",
				title, isbn);
	}
	
}
