package com.training.java.exceptions;

public class UserDefinedExceptionDemo {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        Customer customer = new Customer();
        customer.setStatus("MoneyLaundring");

        if(customer.status.equals("MoneyLaundring"))
            throw new InvalidCustomer("---InvalidCustomer----");
    }
}

class InvalidCustomer extends Exception {

    public InvalidCustomer(String message) {
        super(message);
    }
}

class Customer {

    int id;
    String name;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// System exception - issues on infra or io or app related issues
// Business exception - validation, business rules
    // - consolidate and handle the exception in centralized place.

