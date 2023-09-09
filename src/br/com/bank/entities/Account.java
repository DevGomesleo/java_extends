package br.com.bank.entities;

public class Account {
	
	private Integer number;
	private String holder;
	private double balance;
	
	public Account() {}

	public Account(Integer number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public String toString() {
		return String.format("Nº%d, Name: %s, Balance: $%.2f\n",
				number, holder, balance);
	}
	
}
