package com.devoteam.bankaccountkata.business;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devoteam.bankaccountkata.dto.Statement;
import com.devoteam.bankaccountkata.exceptions.DateException;
import com.devoteam.bankaccountkata.exceptions.TransactionTypeException;
import com.devoteam.bankaccountkata.models.Account;
import com.devoteam.bankaccountkata.models.Transaction;
import com.devoteam.bankaccountkata.models.TransactionType;
import com.devoteam.bankaccountkata.repositories.IAccountRepository;

@Service
public class AccountService implements IAccountService {

	@Autowired
	IAccountRepository accountRepository;

	@Override
	public Account doTransaction(Transaction transaction) throws TransactionTypeException {

		Account account = transaction.getAccount();

		if (transaction.getTransactionType() == TransactionType.DEPOSIT) {
			account.getBalance().add(transaction.getAmount());
		} else if (transaction.getTransactionType() == TransactionType.WITHDRAWAL) {
			account.getBalance().subtract(transaction.getAmount());
		} else {
			throw new TransactionTypeException();
		}

		return accountRepository.save(account);
	}

	@Override
	public Statement getStatement(Account account, Date startDate, Date endDate) throws DateException {
		
		if (startDate.compareTo(endDate) > 0)
		{
			throw new DateException();
		}
		
		Statement statement = new Statement();
		statement.setAccount(account);
		statement.setEndDate(endDate);
		statement.setStartDate(startDate);
		statement.setStatmentDate(new Date());
		statement.setListTransaction(
				accountRepository.findByAccountIdAndDate(account.getAccountId(), startDate, endDate));
		return statement;
	}
}