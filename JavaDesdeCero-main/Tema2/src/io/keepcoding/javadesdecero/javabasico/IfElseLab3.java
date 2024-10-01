package io.keepcoding.javadesdecero.javabasico;

public class IfElseLab3 {
	
	public static float INCREMENT = 1.08f;

	public static void main(String[] args) {
		float testValue = 5000f;
		
		System.out.println("Ganarás: " + newSalary(testValue));
		
	}
	
	public static double newSalary(float money) {
		float res = money;
		if (money>1000) {
			res = money * INCREMENT;
		}
		
		return res;
	}
}
