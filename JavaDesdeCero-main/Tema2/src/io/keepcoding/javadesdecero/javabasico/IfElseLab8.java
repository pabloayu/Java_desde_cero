package io.keepcoding.javadesdecero.javabasico;

public class IfElseLab8 {
	
	public static void main(String [] args) {
		System.out.println("asdf".substring(2));
		System.out.println("hello world has 'hello' prefix?" + hasPrefixSubstring("hello", "hello world"));
		System.out.println("hello world has 'world' suffix?" + hasSuffix("world", "hello world"));

	}
	
	public static boolean hasPrefix(String prefix, String str) {
		return str.startsWith(prefix);
	}
	// TODO fix method
	
	public static boolean hasPrefixSubstring(String prefix, String str) {
		return str.substring(0, prefix.length()) == prefix;
	}
	
	public static boolean hasSuffix(String suffix, String str) {
		return str.endsWith(suffix);
	}

}
