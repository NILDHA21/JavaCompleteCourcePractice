package com.example.bankAccount78;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Nilesh");

        account.depositMoney(-1000);      // Invalid
        account.depositMoney(1500);       // Valid
        System.out.println(account.withdrawMoney(500));   // Valid
        System.out.println(account.withdrawMoney(+1000)); // Withdraw full balance
        System.out.println(account.withdrawMoney(-100));  // Invalid
        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}

