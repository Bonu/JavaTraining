package com.training.java;

class First{
    public static int x;

    First(){
        System.out.println("Super Class Constructor");
    }
    First(int x) {
        System.out.println("Super Class Constructor 1");
    }
}
class Second extends First{


    Second()
    {
        int y = x;
        System.out.println("Sub Class Constructor");
    }

    Second(int x)
    {
        super(2);
        System.out.println("Sub Class Constructor 1");
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Second s = new Second();
        Second s1 = new Second(2);
    }
}