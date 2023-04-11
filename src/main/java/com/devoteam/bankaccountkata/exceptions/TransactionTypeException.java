package com.devoteam.bankaccountkata.exceptions;

import com.devoteam.bankaccountkata.utils.Constant;

public class TransactionTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TransactionTypeException()
	{
		super(Constant.TRANSACTION_TYPE_EXCEPTION_MSG);
	}
}