package com.training.java;

import com.training.java.base.utility.BaseUtility;

import java.util.Arrays;
import java.util.List;

public class UpperBoundGenericsTester {

//    public static double sum(List<? extends Number> numberlist){
//        double sum = 0.0;
//        for (Number n : numberlist) sum += n.doubleValue();
//        return sum;
//    }

    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + BaseUtility.sum(integerList));

        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + BaseUtility.sum(doubleList));

        List<Float> floatList = Arrays.asList(1.1f, 2.2f, 3.3f);
        System.out.println("sum = " + BaseUtility.sum(floatList));
    }
}