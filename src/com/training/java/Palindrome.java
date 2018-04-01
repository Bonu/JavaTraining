package com.training.java;

/* using recursion */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("malayalam"));
    }

    static boolean palindrome(String str){
        System.out.println("string ->"+str);
        if(str.length()<=1){ // base condition
            return true;
        } else {
            if(str.charAt(0) != str.charAt(str.length()-1)) {
                return false;
            }
            return palindrome(str.substring(1,str.length()-1));
        }
    }
}
