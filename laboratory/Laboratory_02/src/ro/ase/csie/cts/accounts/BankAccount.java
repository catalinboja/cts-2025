package ro.ase.csie.cts.accounts;

public abstract class BankAccount extends Account {
	protected double balance;
	protected String id;
	
	public BankAccount(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
}
