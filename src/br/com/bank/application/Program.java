package br.com.bank.application;

import br.com.bank.entities.Account;
import br.com.bank.entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		Account account = new Account(3326,"Alex Green", 500);
		
		System.out.println("-------------------");
		System.out.println("Account data:");
		System.out.println(account);
		account.deposit(200);
		System.out.println(account);
		account.withdraw(450);
		System.out.println(account);
		
		System.out.println("-------------------");
		BusinessAccount businessAccount = new BusinessAccount(
				001,
				"TI DarkSide",
				34980,180000);
		System.out.println("Business Account data:");
		System.out.println(businessAccount);
		
		businessAccount.deposit(3000);
		System.out.println(businessAccount);
		
		businessAccount.withdraw(1200);
		System.out.println(businessAccount);
		
		businessAccount.loan(150000);
		System.out.println(businessAccount);
		
		System.out.println("-------------------\n");

	}

}
