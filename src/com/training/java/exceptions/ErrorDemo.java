package com.training.java.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ErrorDemo {

    public void method1() throws Exception {
        System.out.println("-----method1------");
        this.method2();
        System.out.println("-----method1---E---");
    }
//    public void method2() throws Exception {
    public void method2() throws Exception {
        System.out.println("-----method2------");
//        this.method1();
//        throw new Exception();
        int x = 100/0;
        System.out.println("-----method2----E--");
    }
    public static void main(String[] args) {
        ErrorDemo ed = new ErrorDemo();
        try {
            ed.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            FileReader file = new FileReader("/tmp/newfile.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        System.out.println("---After method call -------");
    }
}


