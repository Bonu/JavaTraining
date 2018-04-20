package com.training.java.innerclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class OuterClassTester {

    public static void main(String[] args) {

//        OuterClass outerClass = new OuterClass();

//        OuterClass.Inner inner = new OuterClass(100, "Hello").new Inner();
//        inner.myMethod();

//        new OuterClass.InnerStatic().myMethod();

//        OuterClass outerClass = new OuterClass(200,"Hello");
//        outerClass.myMethodOuter();
//        OuterClass.Inner inner1 = outerClass.new Inner();

        OuterClass outerClass = new OuterClass(200,"Hello");
        outerClass.myMethodOuter();
        new OuterClass.StaticInner().myMethod();

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
    }
}
