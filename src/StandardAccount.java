package com.thatguyintheglass;


public class StandardAccount extends com.thatguyintheglass.Account {
        public StandardAccount(int accountNumber, double creditLimit){
            super(accountNumber, creditLimit, 0);

        }

        @Override
        public double Withdraw(double amount) {
            if( creditLimit < accountBalance){
                return accountBalance - creditLimit;
            }
            return super.Withdraw(amount);
        }
        @Override
        public void Deposit(double amount) {
            accountBalance = accountBalance + amount;
        }

}
