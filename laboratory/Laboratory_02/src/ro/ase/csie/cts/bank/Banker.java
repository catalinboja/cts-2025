package ro.ase.csie.cts.bank;

import ro.ase.csie.cts.accounts.BankAccount;
import ro.ase.csie.cts.accounts.CurrentAccount;
import ro.ase.csie.cts.accounts.SavingsAccount;
import ro.ase.csie.cts.enums.AccountType;

public class Banker {
	public static final String BANK_ID = "ACME";
	private int nextId = 0;
	
	private String generateAccId() {
		this.nextId += 1;
		return BANK_ID + this.nextId;
	}
	
	public BankAccount openAccount(AccountType accType) {
		switch(accType) {
			case SAVINGS:
				return new SavingsAccount(this.generateAccId());
			case CURRENT:
				return new CurrentAccount(this.generateAccId());
			default:
				throw new UnsupportedOperationException();	
		}
	}
}








