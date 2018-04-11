package com.training.java;

public class RecursionTester {

    public static void main(String[] args) {

        int number = 43534632;

        calcRemainder(number);
    }

    public static void calcRemainder(int number){
        if( number > 0) {
            System.out.println(number%10);
            calcRemainder(number/10);
        }
    }
}
