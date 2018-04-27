package com.training.java;

public class CompositionDemo {
}


interface Account {
    public abstract double calculateInterest(double amount) ;
    public abstract void deposit(double amount) ;
    public abstract void withdraw(double amount);
}

interface AccountHelper {
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class AccountHelperImpl implements AccountHelper {

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit amount :"+ amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw amount :"+ amount);
    }
}

class SavingsAccount implements Account {

    AccountHelper helper = new AccountHelperImpl();

    @Override
    public double calculateInterest(double amount) {
        return amount * 0.03;
    }

    @Override
    public void deposit(double amount) {
        helper.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        helper.withdraw(amount);
    }
}

class CurrentAccount implements Account {

    AccountHelper helper = new AccountHelperImpl();

    @Override
    public double calculateInterest(double amount) {
        return amount * 0.05;
    }

    @Override
    public void deposit(double amount) {
        helper.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        helper.withdraw(amount);
    }
}