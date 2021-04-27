package com.fundamentals.interfaces;

public class NetBanking implements Payment, FundTransfer{

	@Override
	public void saveTransactionReport() {
		System.out.println("Save report and can be viewed in the credit card statement.");
	}

	@Override
	public void transferFunds(float amount) {
		System.out.println("Transferring funds " + amount);
	}

	@Override
	public void pay(float amount) {
		System.out.println("Pay using card number and CVV " + amount);
	}

	public void displayStatement() {
		System.out.println("Display the Savings Account Statement");
	}
}
