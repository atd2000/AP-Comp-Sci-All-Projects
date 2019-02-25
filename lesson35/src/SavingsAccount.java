
public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(double amount, double rate) {
		super(amount);
		interestRate = rate;
	}

	public void addInterest(){
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}
	public void deposit(double b){
		balance+=b;
	}
	public double getBalance( ){
		return balance;
	}
	public double superGetBalance( ){
		return super.getBalance();
	}


	private double interestRate;
	private double balance;
}