package io.keepcoding.javadesdecero.javabasico;

public class TestString {

	public static void main(String[] args) {
		String str = "My awesome String";
		Integer i = Integer.valueOf(0);
		
		System.out.println("Length: " + str.length());
		System.out.println("Contains: " + str.contains("aw"));
		// Accedemos directamente a las posiciones desde el 0 hasta el length()-1
		System.out.println("Substring sólo begin: " + str.substring(11));
		System.out.println("Substring begin y end: " + str.substring(12, 13));
		System.out.println("CharAt a la última posición: " + str.charAt(str.length()-1));
		System.out.println("CharAt a la primera posición: " + str.charAt(0));
	}
	
	public static char testCharAt(String str) {
		return str.charAt(0);
	}
}
