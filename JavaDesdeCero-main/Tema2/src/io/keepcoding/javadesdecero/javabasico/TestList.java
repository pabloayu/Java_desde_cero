package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestList {
	
	public static void main(String [] args) {
		//testArrayList();
		//testWhile();
		testDoWhile();
	}
	
	public static void testWhile() {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		// psudocódigo
		
		// [0, n-1] -> i < size || i <= (size-1)
		// contador = 0
		// mientras contador < longitud de la lista
		// get elemento[contador]
		// incrementar contador
		
		/*
		 * i = 0
		 * i < 2? Sí
		 * print del elemento 0 -> 1
		 * i = 0 + 1 = 1
		 * 1 < 2? Sí
		 * print de posición 1 -> 2
		 * i = 2
		 * 2 < 2? No -> salimos del bucle
		 * */
		
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i++)); // se evlúa antes de realizar el incremento
		}
		// pre-incremento ++i;
	}
	
	public static void testDoWhile() {
		ArrayList<Integer> list = new ArrayList<>();
		
		//list.add(1);
		//list.add(2);
		
		// [0, n-1] -> i < size || i <= (size-1)
		// contador = 0
		// get elemento[contador]
		// incrementar contador
		// mientras contador < longitud de la lista
		
		int i = 0;
		if (list.size() > 0) {
			do {
				System.out.println(list.get(i));
				i++;
			} while(i < list.size());
		}
		
		
	}
	
	public static void testArrayList() {
		// Aquí van clases y no tipos básicos
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);		
		
		// iterator https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
		for (Integer str: list) {
			System.out.println(str);
		}
		
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/*
		 * i = 0
		 * 0 < 2? Sí
		 * print del número que ocupe la posición i -> posición 0 -> 1
		 * i = 0 +1 = 1
		 * 1 < 2? Sí...
		 * 
		 * */
		
		// Iteración en sentido inverso
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		// Print de la lista completa
		System.out.println(list);
	}

}
