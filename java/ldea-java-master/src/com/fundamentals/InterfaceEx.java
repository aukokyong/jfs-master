package com.fundamentals;

public class InterfaceEx {
	public static void main(String[] args) {
		Transaction transaction;
//		Cannot instantiate the type Transaction because it is an interface
//		transaction = new Transaction();
//		CreditCard1 creditCard1;
//		creditCard1 = new CreditCard();
		CreditCard creditCard = new CreditCard();
		creditCard.validate();
		creditCard.pay(500);
		creditCard.saveTransactionReport();
	}
}

// interface contain abstract method
interface Transaction {
	// we know we save reports, but we do not know the exact way. (absract)
//	void saveTransactionReport();
//	abstract void saveTransactionReport();
	public abstract void saveTransactionReport();
}

interface Payment extends Transaction {
	void pay(float amount);
}

interface FundTransfer extends Transaction {
	void transferFunds(float amount);
}

abstract class CreditCard1 implements Payment {
	public void validate() {
		
	}
}

 class CreditCard implements Payment {
	public void validate() {
		System.out.println("Validate Credit card....");
	}
	@Override
	public void saveTransactionReport() {
		System.out.println("Save report and can be viewed in the credit card statement.");
	}
	@Override
	public void pay(float amount) {
		System.out.println("Pay using card number and CVV " + amount);
	}
}
