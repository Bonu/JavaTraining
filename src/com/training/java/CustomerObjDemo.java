package com.training.java;

import java.util.Date;
import java.util.Objects;

public class CustomerObjDemo {

    int id;
    String name;
    Date now;
    String customerType;

    public CustomerObjDemo(int id, String name, Date now, String customerType) {
        this.id = id;
        this.name = name;
        this.now = now;
        this.customerType = customerType;

    }

    public CustomerObjDemo(int id, String name, String customerType) {
        this.id = id;
        this.name = name;
        this.customerType = customerType;
        this.now = new Date();
    }

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

    public Date getNow() {
        return now;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerObjDemo)) return false;
        CustomerObjDemo that = (CustomerObjDemo) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getCustomerType(), that.getCustomerType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCustomerType());
    }

    @Override
    public String toString() {
        return "CustomerObjDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", now=" + now +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
