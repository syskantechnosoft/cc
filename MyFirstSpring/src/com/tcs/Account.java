package com.tcs;

public class Account {
	private int id;
	private String accountType;
	private float balance;

	public Account() {
		super();
	}

	public Account(int id, String accountType, float balance) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + ", balance=" + balance + "]";
	}

}
