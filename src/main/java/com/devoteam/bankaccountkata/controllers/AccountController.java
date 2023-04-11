package com.devoteam.bankaccountkata.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devoteam.bankaccountkata.business.IAccountService;
import com.devoteam.bankaccountkata.exceptions.DateException;
import com.devoteam.bankaccountkata.exceptions.TransactionTypeException;
import com.devoteam.bankaccountkata.models.Account;
import com.devoteam.bankaccountkata.models.Transaction;

@RestController
public class AccountController {

	@Autowired
	IAccountService accountService;

	@PostMapping
	public void doTransaction(Transaction transaction) throws TransactionTypeException {
		accountService.doTransaction(transaction);

	}

	@GetMapping
	public void getStatement(Account account, Date startDate, Date endDate) throws DateException {
		
		accountService.getStatement(account, startDate, endDate);
	}
}