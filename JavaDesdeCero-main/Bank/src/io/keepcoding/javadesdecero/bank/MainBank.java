package io.keepcoding.javadesdecero.bank;


import java.util.Scanner;

import io.keepcoding.javadesdecero.bank.model.BankAccount;

public class MainBank {
	public static void main(String [] args) {
		// Call without parameters
		//BankAccount account = new BankAccount();
		
		BankAccount account = new BankAccount(
				"12345678X",
				"Pedro",
				"Martínez",
				1234,
				100.0
				);
		
		// Pruebas de uso
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el DNI");
		String dniInput = input.nextLine();
		
		System.out.println("Introduce el password");
		Integer passInput = input.nextInt();
		
		// Authenticate
		account.authenticate(dniInput, passInput);
		
		// Get Cash
		account.getCash(50);
		System.out.println("Current balance: " + account);
		
		// Get Data -> showInfo()
		System.out.println(account.toString());
		
		// income
		account.income(20);
		System.out.println("Current balance: " + account.getBalance());
		
		
	}
}
