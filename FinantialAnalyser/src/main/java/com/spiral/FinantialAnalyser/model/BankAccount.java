package com.spiral.FinantialAnalyser.model;

import org.springframework.stereotype.Controller;


public class BankAccount {
	private int accNo;
	private String bank;
	private int balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accNo, String bank, int balance) {
		super();
		this.accNo = accNo;
		this.bank = bank;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
