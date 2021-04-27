package com.fundamentals.interfaces;

public class NetBankingApp {
public static void main(String[] args) {
	NetBanking netBanking = new NetBanking();
	netBanking.pay(0);
	netBanking.displayStatement();
}
}
