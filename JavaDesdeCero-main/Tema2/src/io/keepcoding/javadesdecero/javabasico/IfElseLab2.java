package io.keepcoding.javadesdecero.javabasico;

public class IfElseLab2 {
	
	public static void main(String[] args) {
		
		System.out.println("Temperatura: " + temperature(400));
		
	}
	
	public static float temperature(float frequence) {
		float res =  10 + (frequence - 40)/7;
		if (res > 0) {
			return res;
		} else {
			return 0;
		}
	}

}
