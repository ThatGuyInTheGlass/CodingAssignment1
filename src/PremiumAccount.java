package com.thatguyintheglass;

public class PremiumAccount extends com.thatguyintheglass.Account {
        public PremiumAccount (int accountNumber) {super(accountNumber, 0,0);
        }

        @Override
        public double Withdraw(double amount) {
            return amount;
        }

        @Override
        public void Deposit(double amount) {
            accountBalance = accountBalance + amount;
        }
}
