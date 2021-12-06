package com.thatguyintheglass;

public class BasicAccount extends com.thatguyintheglass.Account {
    public BasicAccount(int accountNumber,  double withdrawLimit) {
        super(accountNumber, 0, withdrawLimit);
    }

    @Override
    public double Withdraw(double amount) {
        if (withdrawLimit < amount){
            return withdrawLimit;
        }
        if( creditLimit < accountBalance){
            return accountBalance - creditLimit;
        }
        return super.Withdraw(amount);
    }

    @Override
    public void Deposit(double amount) {
        accountBalance = accountBalance - amount;
    }

}
