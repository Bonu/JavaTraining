package com.training.java.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        Account account1 =new SavingsAccount();
        account1.deposit(50.0);

        Account account2 = new CurrentAccount();
        account2.deposit(100.00);

        account1.withdraw(25);
        account2.withdraw(50);

        double cal1 = account1.calculateInterest(100);
        double cal2 = account2.calculateInterest(100);

    }
}

abstract class Account {

    public void deposit(double amount) {
        System.out.println("Depositing amount: "+amount);
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw amount: "+amount);
    }

    public abstract double calculateInterest(double amount);
}

class SavingsAccount extends Account {

    double amount = 0;

    @Override
    public double calculateInterest(double amount) {
        return amount * 0.03;
    }

    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
    }

}

class CurrentAccount extends Account {

    @Override
    public double calculateInterest(double amount) {
        return amount * 0.05;
    }

    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
    }

}
