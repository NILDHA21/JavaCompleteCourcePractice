package com.example.bankAccount78;

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	//Constructor generated
	public BankAccount(String accountNumber, String accountHolderName) {
	    if(accountNumber == null || accountHolderName == null || accountHolderName.isEmpty()) {
	        throw new IllegalArgumentException("Account number and holder name must not be empty.");
	    }
	    this.accountNumber = accountNumber;
	    this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
	    return "Account Number: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: ₹" + balance;
	}
	
	public void depositMoney(double money) 
	{
		if(money <= 0) {
			System.out.println("Invalid amount.");
		}else {
			balance = balance + money;
			System.out.println("Deposited: ₹" + money + ", New Balance: ₹" + balance);
		}
	}
	
	public double withdrawMoney(double money) 
	{
		if(money <= 0) {
			System.out.println("Invalid amount.");
			return 0;
		} else if(balance >= money) {
			balance = balance - money;
			System.out.println("Withdrawn: ₹" + money + ", Remaining Balance: ₹" + balance);
	        return money;
		} else {
			double withdrawn = balance;
			balance = 0;
			System.out.println("Insufficient balance. Withdrawn: ₹" + withdrawn + ", Balance is now zero.");
	        return withdrawn;
		}
	}
	
    public double getBalance() {
        return balance;
    }
}
