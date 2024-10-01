package io.keepcoding.javadesdecero.objetos;

public class TestObjects {
	
	public static void main(String [] args) {
		// miSilla -> Objeto o instacia
		// Silla es la Clase
		
		String str = new String();
		String str1 = "";
		Silla miSilla = new Silla();
		Silla miSilla1 = new Silla();
		
		// object context
		// se almacena el valor en el objeto
		miSilla.hasRespaldo = true;
		miSilla1.hasRespaldo = false;
		
		// Static context
		// se almacena el valor en la propia clase
		// Silla.hasRespaldo = true;
		
		System.out.println(miSilla.hasRespaldo);
		
	}
}
