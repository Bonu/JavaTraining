package com.training.java;

/* using recursion */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome(null));
    }

    static boolean palindrome(String str){
        if(str != null && str.length()<=1){ // base condition
            return true;
        } else {
            if(str.charAt(0) != str.charAt(str.length()-1)) {
                return false;
            }
            return palindrome(str.substring(1,str.length()-1));
        }
    }
}
