package com.bank;

class BankAccount {
private String accountNumber;
private String accountHolderName;
private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
    if (money <= 0){
        System.out.println("Invalid deposit");
    }else {
    balance += money;
}}
public double withdrawMoney(double money) {
    if (money <= 0) {
        System.out.println("Invalid withdrawal");
        return 0;
    } else if (balance >= money) {
        balance -= money;
        return money;
    } else {
        System.out.println("Insufficient balance. Withdrawing available balance.");
        double withdrawn = balance;
        balance = 0;
        return withdrawn;
    }

}}
