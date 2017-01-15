package com.techwaly.transaction;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;

	public Bank() {
		accounts = new ArrayList<Account>();
	}

	public void chargeMonthlyFee() {
		for (Account ac : accounts) {
			ac.setCurr_balance(ac.getCurr_balance() - 1);
		}

	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
}
