package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class ForTransform {
	
	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		
		System.out.println(toPSentence("Este es el juego de la p"));
	}
	
	/**
	 * Test null
	 */
	public static void testNull() {
		String res = null;
		
		if (res != null) {
			res.length();
		}
		
	}
	
	public static ArrayList<Float> toFloats(ArrayList<Integer> numberList) {
		int i = 0;
		ArrayList<Float> resList = new ArrayList<>();
		
		
		while(i<numberList.size()) {
			resList.add(Float.valueOf(numberList.get(i)));
			i++;
		}
		
		return resList;
	}
	
	public static String toPSentence(String word) {
		String res = "";
		
		for (char c: word.toCharArray()) {
			res += toPCharacter(c);
		}
		
		return res;
	}
	
	public static String toPCharacter(char c) {
		//String res = "" ; // inicialización a cadena vacía
		String res; // // null -> no tiene valor

		switch(c) {
			case 'a', 'e', 'i', 'o', 'u' -> res = c + "p" + c;
			default -> res = Character.toString(c);
		}
		
		return res;
	}
	
}
