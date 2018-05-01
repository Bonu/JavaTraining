package com.training.java.cloning;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CloningDemo {

    public static void main(String[] args) {

        Account account1 = new Account(1, 12345, "savings");
        Account account2 = new Account(1, 43443, "current");

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

//        Customer customer = new Customer(1,"James", accounts);

//        try {
////            Customer customer1 = customer.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }
}


class Customer implements Cloneable {

    public Customer(int id, String name, Account accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    private int id;

    private String name;

    private final Account accounts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name) &&
                Objects.equals(accounts, customer.accounts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, accounts);
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
//        return (Customer)super.clone(); shallow cloning

        // deep cloning
        Account account = this.accounts.clone();
        Customer customer = new Customer(this.id, this.name, account);

//        customer.accounts = accounts;
        return customer;
    }
}

class Account {

    public Account(int id, int accountNumber, String accountType) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    private int id;

    private int accountNumber;

    private String accountType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return id == account.id &&
                accountNumber == account.accountNumber &&
                Objects.equals(accountType, account.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, accountType);
    }

    @Override
    protected Account clone() throws CloneNotSupportedException {
        return (Account)super.clone();
    }
}
