package com.thatguyintheglass;
import java.util.List;

public interface IBank {
    void OpenAccount(com.thatguyintheglass.IAccount account);
    //gets an account object and adds it to the bank accounts list
    void CloseAccount(int accountNumber);
    //Gets account number as an integer, look him up in the bank account list, if we didn’t find it, we ignore the request
    //If we found the account, we check if the balance is positive and removes him from the bank account list
    //If the balance is negative we print a message that the account is not closed due to debt, you can print using System.out.println() method
    List<com.thatguyintheglass.IAccount> GetAllAccounts();
    //returns all of the accounts in the bank as List of accounts
    List<com.thatguyintheglass.IAccount> GetAllAccountsInDebt();
    //returns a list of accounts with negative balance
    List<com.thatguyintheglass.IAccount> GetAllAccountsWithBalance(double balanceAbove);
    //returns a list of accounts with balance bigger than the supplied double


}
