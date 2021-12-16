package com.practice;

public class TestAccount {
	public static void main(String[] args) {
		Account director = new Account();
		Account actor = new Account();
		director.setBalance(10000);
		actor.setBalance(20000);
		double dirBal =director.getBalance();
		double actorBal =actor.getBalance();
		double amount =5000;
		actor.fundTransfer(amount, dirBal, actorBal);
		System.out.println(director.getBalance());
		System.out.println(actor.getBalance());
		
	}
}
