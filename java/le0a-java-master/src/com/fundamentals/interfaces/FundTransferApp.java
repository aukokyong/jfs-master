package com.fundamentals.interfaces;

public class FundTransferApp {
public static void main(String[] args) {
	FundTransfer fundTransfer = new NetBanking();
	fundTransfer.transferFunds(0);
}
}
