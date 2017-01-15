package com.techwaly.transaction;

import java.util.Vector;

public class Account {
	private String name;
	private Vector<Transaction> listoftrans;
	private int curr_balance;

	public Account(String name) {
		this.name = name;
		this.curr_balance = 2000;
		listoftrans = new Vector<Transaction>();
	}

	public boolean checkTrans(Transaction trans) {
		if (trans.getAmount() <= curr_balance) {
			return true;
		} else {
			return false;
		}

	}

	public void post(Transaction trans) {
		if (checkTrans(trans)) {
			listoftrans.add(trans);
			curr_balance = curr_balance - trans.getAmount();
			System.out.println("Transaction done Successfully");
		} else {
			System.out.println("You do not have sufficient balance for Transaction.");
		}

	}

	public String getName() {
	
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurr_balance() {
		return curr_balance;
	}

	public void setCurr_balance(int curr_balance) {
		this.curr_balance = curr_balance;
	}

	public Vector<Transaction> getListoftrans() {
		return listoftrans;
	}

	public void setListoftrans(Vector<Transaction> listoftrans) {
		this.listoftrans = listoftrans;
	}

}
