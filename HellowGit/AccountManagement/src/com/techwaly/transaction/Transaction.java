package com.techwaly.transaction;

import java.util.Date;

public class Transaction {
	private int amount;
	private Date date;
	private String transactionType;

	public Transaction(int amount, Date date, String transactionType) {
		this.amount = amount;
		this.date = date;
		this.transactionType = transactionType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}
