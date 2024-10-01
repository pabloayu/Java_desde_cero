package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class ForCompress {
	
	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("Result de multiplyAll: " + multiplyAll(list));
		
		
		ArrayList<String> stringList = new ArrayList<String>();
		
		stringList.add("Hola");
		stringList.add(" ");
		stringList.add("proyecto de desarrollador!");
		
		System.out.println("Result de multiplyAll: " + concatAll(stringList));
	}
	
	public static int multiplyAll(ArrayList<Integer> numberList) {
		int res = 1;
		
		for (int number: numberList) {
			res *= number;
		}
		
		return res;
	}

	public static String concatAll(ArrayList<String> stringList) {
		String res = "";
		for(int i=0; i< stringList.size(); i++) {
			res += stringList.get(i);
		}
		
		return res;
	}
}
