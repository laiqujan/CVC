package com.techwaly.transaction;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Account ac1 = new Account("Muhammad Laiq");
		//Account ac2 = new Account("Umar");
		int choice = 0;
		do {
			choice = menu();
			if (choice == 1) {
				Transaction t1 = new Transaction(100, new Date(), "Withdraw");
				ac1.post(t1);
				System.out.println("Transaction detail");
				System.out.println("Accout Holder:" + ac1.getName());
				System.out.println("Amount:" + t1.getAmount());
				System.out.println("Transaction Type:" + t1.getTransactionType());
				System.out.println("Date:" + t1.getDate());
				System.out.println("Current Balance:" + ac1.getCurr_balance());
			} else if (choice == 2) {
				System.out.println("Current Balance:" + ac1.getCurr_balance());

			} else if (choice == 3) {
				System.out.println("Enter Depositing Amount:");
				int amount = input.nextInt();
				ac1.setCurr_balance(ac1.getCurr_balance() + amount);
			} else if (choice == 4) {
				System.out.println("Thankyou for banking with BULZ");
			} else {
				System.out.println("Plese select correct Choice");
			}

		} while (choice != 4);

		// Testing AccountPlus
		System.out.println("Transaction Details.");
		AccountPlus a = new AccountPlus("Sajid", 10000);
		a.post(new Transaction(6000, new Date(), "Withdraw"));
		System.out.println(
				"Current Balance in Bank Account:" + a.getCurr_balance() + "\n" + "CreditLimit:" + a.getCreditlimit());
		System.out.println("All price is in PKR...!");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("Welcome to BULZ Bank!");
		System.out.println("Press 1 for Cash Withdraw");
		System.out.println("Press 2 for Balance Enquiery");
		System.out.println("Press 3 for Deposit Amount");
		System.out.println("Press 4 for Exit");
		try {
			choice = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer(1-4) after Restaring Program.");
		}

		return choice;
	}

}
