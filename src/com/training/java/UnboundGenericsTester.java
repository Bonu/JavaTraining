package com.training.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundGenericsTester {

    public static void printAll(List<?> list){
        for (Object item : list)
            System.out.println(item + " ");
    }

    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        printAll(integerList);
        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
        printAll(doubleList);
        List<String> strings = Arrays.asList("abc","def","ghi");
        printAll(strings);
    }
}