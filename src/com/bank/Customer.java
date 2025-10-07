package com.bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Deepanshu");
        account.depositMoney(100000);
        System.out.println(account.withdrawMoney(50000));
       account.depositMoney(-40);
       account.withdrawMoney(0);
    }
}
