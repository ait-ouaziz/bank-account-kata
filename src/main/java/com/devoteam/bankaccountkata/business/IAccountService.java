package com.devoteam.bankaccountkata.business;

import java.util.Date;

import com.devoteam.bankaccountkata.dto.Statement;
import com.devoteam.bankaccountkata.exceptions.DateException;
import com.devoteam.bankaccountkata.exceptions.TransactionTypeException;
import com.devoteam.bankaccountkata.models.Account;
import com.devoteam.bankaccountkata.models.Transaction;

public interface IAccountService {
	
	public Account doTransaction(Transaction transaction) throws TransactionTypeException;
	
	public Statement getStatement(Account account, Date startDate, Date endDate) throws DateException;
}