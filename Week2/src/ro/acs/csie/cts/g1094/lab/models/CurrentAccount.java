package ro.acs.csie.cts.g1094.lab.models;

import ro.acs.csie.cts.g1094.lab.exception.IllegalTransferException;
import ro.acs.csie.cts.g1094.lab.exception.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
	public static final double MAX_CREDIT = 5000;
	
	public CurrentAccount(String iban) {
		super(iban, CurrentAccount.MAX_CREDIT);
	}
	
	@Override
	public void deposit(Double amount) {
		this.balance +=amount;
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException {
		if(amount > this .balance) {
			throw new InsufficientFundsException("You do not have the requiered amount");
			
		}
		else {
			this.balance -= amount; 
		}

	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
		if(this == destination) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destination.deposit(amount);

	}

}
