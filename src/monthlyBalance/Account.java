package monthlyBalance;

import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balanceable {
	private double balance;
	
	public Account() {
		balance = 1000;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;	
	}

	@Override
	public void deposit(double amount) {
		balance += amount;		
	}
	
	public String getBalanceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(balance);
	}

}
