package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class ForSelect {
	
	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(15);
		list.add(19);
		list.add(20);
		
		System.out.println("Test selectMult5: " + selectMult5(list));
	}
	
	public static ArrayList<Integer> selectMult5(ArrayList<Integer> numberList) {
		ArrayList<Integer> resList = new ArrayList<>();
		
		for (int number: numberList) {
			if (number % 5 == 0) {
				resList.add(number);
			}
		}
		
		return resList;
	}
}
