package com.techwaly.transaction;

public class AccountPlus extends Account {
	private int creditlimit;

	public AccountPlus(String name, int creditlimit) {
		super(name);
		this.creditlimit = creditlimit;

	}

	@Override
	public boolean checkTrans(Transaction trans) {
		return (super.checkTrans(trans));

	}

	@Override
	public void post(Transaction trans) {
		int bank = 0;
		if (checkTrans(trans)) {
			getListoftrans().add(trans);
			super.setCurr_balance(super.getCurr_balance() - trans.getAmount());
			System.out.println("Transaction done Successfully using Account");
		} else if (trans.getAmount() <= creditlimit + super.getCurr_balance()) {
			bank = trans.getAmount() - getCurr_balance();
			super.setCurr_balance(0);
			this.creditlimit = creditlimit - bank;
			getListoftrans().add(trans);
			System.out.println("Transaction done Successfully using AccountPlus");
		}

		else {

			System.out.println("You do not have sufficient balance for Transaction.");

		}
	}

	public int getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(int creditlimit) {
		this.creditlimit = creditlimit;
	}

}
