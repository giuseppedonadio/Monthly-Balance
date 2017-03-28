package monthlyBalance;

import java.text.NumberFormat;

public class CheckingAccount extends Account  {

	private double montlyFee;
	
	public CheckingAccount(){
		super();
		montlyFee = 1;
	}

	public double getMontlyFee() {
		return montlyFee;
	}

	public void setMontlyFee(double montlyFee) {
		this.montlyFee = montlyFee;
	}
	
	public String getMontlyFeeFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(montlyFee);
	}

	public void subtractMontlyFee(){
		double balance = super.getBalance() - this.montlyFee;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
        String finalBalance = currency.format(balance);
        Console.displayLine("Final Balance\n" + finalBalance);
	}
	
}
