package com.fundamentals.interfaces;

public class PaymentApp {
	public static void main(String[] args) {
//		NetBanking netBanking = new NetBanking();
//		netBanking.pay(0);
//		netBanking.displayStatement();
//		Payment payment = new Payment(); 
//		Dynamic Polymporphism
		Payment payment = new NetBanking();
		payment.pay(0);
//		payment.displayStatement();
	}
}
