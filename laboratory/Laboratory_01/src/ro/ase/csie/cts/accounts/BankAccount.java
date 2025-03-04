package ro.ase.csie.cts.accounts;

public abstract class BankAccount extends Account {
	protected double balance;
	protected String id;
	
	@Override
	public double getBalance() {
		return this.balance;
	}
}
