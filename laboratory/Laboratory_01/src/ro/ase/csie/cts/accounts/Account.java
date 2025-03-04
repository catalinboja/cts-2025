package ro.ase.csie.cts.accounts;

import ro.ase.csie.cts.exceptions.IllegalTransferException;
import ro.ase.csie.cts.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(double amount) throws IllegalTransferException;
	public abstract void withdraw(double amount) 
				throws InsufficientFundsException;
	public abstract void transfer(double amount, Account destAccount)
				throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();
}
