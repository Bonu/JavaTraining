package com.training.java;

/* using tail recursion */
public class PrintNumbers {

    public static void main(String[] args) {
        printNumber(100, 1);
    }

    static void printNumber(int n, int x){
        System.out.println("x -> "+x);
        if(x == n) { //  base condition
            return ;
        }
        printNumber(n, ++x);
    }

}
