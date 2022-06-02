package entities;

public class Account {
	private int numberAccount;
	private String holderAccount;
	private double balance;
	
	public Account(int numberAccount, String holderAccount) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
	}

	public Account(int numberAccount, String holderAccount, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		deposit(initialDeposit);
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;	
	}
	
	public void withDraw(double withDraw) {
		this.balance -= (withDraw - 5);
	}
	
	public String toString() {
		return "Account number: " 
				+ numberAccount
				+ ", Account holder: "
				+ holderAccount
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
	
	


}
