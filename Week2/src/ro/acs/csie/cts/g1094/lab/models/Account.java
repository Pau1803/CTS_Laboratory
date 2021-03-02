package ro.acs.csie.cts.g1094.lab.models;

import ro.acs.csie.cts.g1094.lab.exception.IllegalTransferException;
import ro.acs.csie.cts.g1094.lab.exception.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount) throws InsufficientFundsException;
	public abstract  Object getBalance();
	public abstract void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException;
}
