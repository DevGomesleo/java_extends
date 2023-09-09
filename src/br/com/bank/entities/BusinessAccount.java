package br.com.bank.entities;

public class BusinessAccount extends Account{

	private double loanLimit;

	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void loan(double loan) {
		
		if(loan <= loanLimit) {
			deposit(loan);
			this.loanLimit -= loan;
		}
		
	}
	
	public String toString() {
		return String.format("Nº%d, Corp: %s, balance: $%.2f, loan limit: $%.2f",
				getNumber(), getHolder(), getBalance(), getLoanLimit());
	}
}
