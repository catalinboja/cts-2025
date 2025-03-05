package ro.ase.csie.cts.accounts;

import ro.ase.csie.cts.exceptions.IllegalTransferException;
import ro.ase.csie.cts.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.interfaces.Profitable;

public class SavingsAccount 
	extends BankAccount implements Profitable {
		
	public SavingsAccount(String id) {
		super(id, MIN_BALANCE);
	}

	public static final double MIN_BALANCE = 50;

	@Override
	public void addInterest(float interestAsAbsoluteValue) {
		this.balance *= (1 + interestAsAbsoluteValue);
	}

	@Override
	public void deposit(double amount) throws IllegalTransferException {
		if(amount <= 0) {
			throw new IllegalTransferException();
		}
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount < MIN_BALANCE) {
			throw new InsufficientFundsException();
		}
		this.balance -= amount;
	}

	@Override
	public void transfer(double amount, Account destAccount)
			throws IllegalTransferException, InsufficientFundsException {
		if(this == destAccount)
			throw new IllegalTransferException();
		this.withdraw(amount);
		destAccount.deposit(amount);
	}

}
