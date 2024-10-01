package io.keepcoding.javadesdecero.javabasico;

public class TestClaseEnvoltorio {

	public static void main(String[] args) {
		int a = 5;
		Integer a1 = Integer.valueOf(5);
		Double c = Double.valueOf(5);
		
		System.out.println("Print numero desde su clase envoltorio: " + a);
		System.out.println("Print numero convertido a float: " + a1.floatValue());
		float otro = a1.floatValue();
	}

}
