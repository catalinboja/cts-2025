package ro.ase.csie.cts.accounts;

import ro.ase.csie.cts.exceptions.IllegalTransferException;
import ro.ase.csie.cts.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

	protected static final double MAX_CREDIT = 5000;
	
	public CurrentAccount(String iban) {
		super();
		this.id = iban;
		this.balance = CurrentAccount.MAX_CREDIT;
	}
	
	public static double getCreditLimit() {
		return CurrentAccount.MAX_CREDIT;
	}

	@Override
	public void deposit(double amount) throws IllegalTransferException {
		if(amount <= 0)
			throw new IllegalTransferException();
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount > this.balance) {
			throw new InsufficientFundsException("Not enough money");
		}
		this.balance -= amount;
	}

	@Override
	public void transfer(double amount, Account destAccount) throws IllegalTransferException, InsufficientFundsException {
		if(this == destAccount)
			throw new IllegalTransferException();
		this.withdraw(amount);
		destAccount.deposit(amount);

	}
	
	
	
	
	

}
