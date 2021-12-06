package com.company;
import com.thatguyintheglass.IAccount;


   //STATE
public class Account implements IAccount {
    protected int accountNumber;
    protected double accountBalance;
    protected double creditLimit;
    protected double withdrawLimit;

    public Accounnt(int accountNumber, double creditLimit, double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.withdrawLimit = withdrawLimit;
    }

    //BEHAVIOR

    @Override
    public void Deposit(double amount) {
        accountBalance = accountBalance + amount;
    }

    @Override
    public double Withdraw(double amount){
        return amount;
    }


    @Override
}
