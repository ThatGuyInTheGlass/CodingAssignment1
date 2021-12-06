package com.thatguyintheglass;

public interface IAccount {
    void Deposit(double amount);
    //adds the amount provided as a double to the account balance
    double Withdraw(double amount);
    //withdraw the requested amount from the account according to the account restrictions, the value returned is the actual amount that has been withdrawn as a double.
    double GetCurrentBalance();
    //Returns the current account’s balance as double.
    int GetAccountNumber();
    //Returns the account number as an integer
}
