package com.devoteam.bankaccountkata.dto;

import java.util.Date;
import java.util.List;

import com.devoteam.bankaccountkata.models.Account;
import com.devoteam.bankaccountkata.models.Transaction;

public class Statement {

	private Account account;

	private Date startDate;

	private Date endDate;
	
	private Date statmentDate;
	
	List<Transaction> listTransaction;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStatmentDate() {
		return statmentDate;
	}

	public void setStatmentDate(Date statmentDate) {
		this.statmentDate = statmentDate;
	}

	public List<Transaction> getListTransaction() {
		return listTransaction;
	}

	public void setListTransaction(List<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}
}