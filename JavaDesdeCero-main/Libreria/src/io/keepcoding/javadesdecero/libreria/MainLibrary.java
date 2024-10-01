package io.keepcoding.javadesdecero.libreria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import io.keepcoding.javadesdecero.libreria.model.Book;
import io.keepcoding.javadesdecero.libreria.model.Library;
import io.keepcoding.javadesdecero.libreria.model.Person;

/**
 * Pruebas, instanciar los modelos y inicializar
 * */
public class MainLibrary {
	
	public static void main(String [] args) {
		// Sample data
		Library library = new Library();
		library.addBook(new Book(
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari"
				));
		library.addBook(new Book(
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari",
				10
				));
		library.addBook(new Book(
				"One Hundred Years of Solitude",
				"Gabriel García Márquez",
				12
				));
		
		Map<Integer,Book> map = new HashMap<>();
		// key -> value
		// 1 -> Sapiens...
		// tema -> estado (si ha ganado o no)
		
		map.put(Integer.valueOf(1), new Book(
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari"
				));
		
		map.put(Integer.valueOf(2), new Book(
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari"
				));
		
		for (var key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		/*
		 LIST OPTION
		 0. Salir
		 1. Listar libros
		 2. Añadir libro
	 	*/
		int option = -1; // control opción vacía
		do {
			
			// Muestro las opciones del menú
			System.out.println("##########");
			System.out.println("Selecciona una opción: ");
			System.out.println("0. Salir");
			System.out.println("1. Listar libros");
			System.out.println("2. Añadir libros");
			System.out.println("##########");
			
			// capturo la opción elegida y compruebo que sea correcta
			Scanner input = new Scanner(System.in);
			String optionStr = input.nextLine();
			
			// Throwable
			// Exception
			// RuntimeException
			try {
				option = Integer.parseInt(optionStr);
			} catch(Throwable e) {
				option = -1;
			}
			
			if (option < 0 || option > 2) {
				System.out.println("Introduce una opción correcta");
			}
			
			if (option == 1) {
				// List books
				System.out.println("Colección de libros:");
				System.out.println(library);
			}
			
			// Ejecutar la acción
			
			
		} while(option != 0); // Si salir -> salir del bucle
		
		System.out.println("bye");
		
		//testPerson()
		//testLibrary()
	}
	
	public static void testLibrary() {
		Library library = new Library();
		var testBook = new Book(
				"1",
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari"
				);
		library.addBook(new Book(
				"1",
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari",
				10
				));
		library.addBook(new Book(
				"2",
				"One Hundred Years of Solitude",
				"Gabriel García Márquez",
				12
				));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el isbn para buscar");
		String isbnInput = input.nextLine();
		
		System.out.println(library.findByIsbn(isbnInput));
	}
	
	public static void testPerson() {
		Person p = new Person();
		
		// si la propiedad fuera publica
		p.samplePublic = null;
		// Sample error accessing private property
		// p.age = 20;
		p.setAge(20);
		p.setName("Pablo");
		p.setAddress("Address");
		
		System.out.println(p.showInfo());
	}
}
