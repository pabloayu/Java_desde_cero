package io.keepcoding.javadesdecero.libreria.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> catalog;
	
	public Library() {
		// catalog = new ArrayList()
		this(new ArrayList<>());
	}
	
	public Library(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}
	
	public void addBook(Book book) {
		catalog.add(book);
	}
	
	public void removeBook(Book book) {
		removeBook(book.getIsbn());
	}
	
	public void removeBook(String isbn) {
		Integer pos = getPositionByIsbn(isbn);
		if (pos != null) {
			catalog.remove(pos);
		}
	}
	
	public Book findByIsbn(String isbn) {
		Integer pos = getPositionByIsbn(isbn);
		if (pos != null) {
			return catalog.get(pos);
		} else {
			return null;
		}
	}
	
	private Integer getPositionByIsbn(String isbn) {
		for (int i=0; i<catalog.size(); i++) {
			Book book = catalog.get(i);
			if (isbn.equals(book.getIsbn())) {
				return i;
			}
		}
		// for (var book: catalog)
		return null;
	}
	
	@Override
	public String toString() {
		String res = "";
		for (Book book: catalog) {
			res += book + "\n";
		}
		return res;
	}
	
}
