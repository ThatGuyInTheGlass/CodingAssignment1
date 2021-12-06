package com.thatguyintheglass;
//STATE (Constructions)

public class Account implements com.thatguyintheglass.IAccount {
    protected int accountNumber;
    protected double accountBalance;
    protected double creditLimit;
    protected double withdrawLimit;

    public Account(int accountNumber, double creditLimit, double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.withdrawLimit = withdrawLimit;
    }

    //BEHAVIOR (Methods)

    @Override
    public void Deposit(double amount) {
        accountBalance = accountBalance + amount;
    }

    @Override
    public double Withdraw(double amount) {
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return this.accountBalance;
    }

    @Override
       public int GetAccountNumber() {
        return this.accountNumber;
    }
}
