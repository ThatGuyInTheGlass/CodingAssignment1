package com.thatguyintheglass;
import com.thatguyintheglass.IBank;
import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {

    protected List<com.thatguyintheglass.IAccount> accountsList;
    protected double balance;
    private int accountNumber;
    private static int lastAccount = 0;

    public Bank(){
        balance = 0;
        accountNumber = lastAccount + 1;
        lastAccount = accountNumber;
        accountsList = new ArrayList<com.thatguyintheglass.IAccount>();
    }
    @Override
    public void OpenAccount(com.thatguyintheglass.IAccount account) {
        accountsList.add(account);

    }

    @Override
    public void CloseAccount(int accountNumber) {
        List <com.thatguyintheglass.IAccount> iterator_list = new ArrayList<com.thatguyintheglass.IAccount>();
        for (com.thatguyintheglass.IAccount account:accountsList
        ) {
            if(account.GetAccountNumber() == accountNumber){
                if(account.GetCurrentBalance() >=0) {
                    iterator_list.add(account);
                }
                else{
                    System.out.println("Sir/Mamn, you need to pay us back!");
                }
            }
            accountsList.removeAll(iterator_list);
        }

    }
    @Override
    public List<com.thatguyintheglass.IAccount> GetAllAccounts() {
        return accountsList;
    }
    @Override
    public List<com.thatguyintheglass.IAccount> GetAllAccountsInDebt() {
        List <com.thatguyintheglass.IAccount> negatives = new ArrayList<com.thatguyintheglass.IAccount>();
        for (com.thatguyintheglass.IAccount account:accountsList
        ) {
            if(account.GetCurrentBalance() < 0){
                negatives.add(account);
            }

        }
        return negatives;
    }
    @Override
    public List<com.thatguyintheglass.IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List <com.thatguyintheglass.IAccount> biggerAccounts = new ArrayList<com.thatguyintheglass.IAccount>();
        for (int i = 0 ; i<accountsList.size(); i++){
            if (accountsList.get(i).GetCurrentBalance() > balanceAbove) {
                biggerAccounts.add(accountsList.get(i));
            }
        }
        return biggerAccounts;
    }
}
