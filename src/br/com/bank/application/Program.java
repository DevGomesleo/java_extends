package br.com.bank.application;

import br.com.bank.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Account account = new Account(3326,"Alex Green", 500);
		System.out.println(account);
		account.deposit(200);
		System.out.println(account);
		account.withdraw(450);
		System.out.println(account);

	}

}
