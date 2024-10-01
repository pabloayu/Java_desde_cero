package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio1 {
	
	public static void main(String [] args) {
		int test = 5;
		// Print vs println -> salto de línea
		System.out.println(test);
		test = decrement(test);
		System.out.println(test);
	}
	
	public static int decrement(int a) {
		return a -1; // a--
	}


}
