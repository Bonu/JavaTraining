package com.training.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenericMethod {

   public static <E> void ArrayToArrayList(E[] a, ArrayList arrayList) {
       for(E i:a) {
           arrayList.add(i);
       }
   }
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<Integer>();

        Integer[] intArray = {55, 66};  // autobox
        ArrayToArrayList(intArray, lst);
        for (Integer i : lst) System.out.println(i);

        String[] strArray = {"one", "two", "three"};
        ArrayToArrayList(strArray, lst);   // Compilation Error below

        Integer[] ints = {5,6,43,6,3,85,98,463,34};
        Integer[] ints2 = {5,6,43,6,3,85,98,463,34};

        char[] strChar = "Sample string".toCharArray();

        String[] strs = {"se","sedse"};

        System.out.println(getList(ints));
//        System.out.println(getList(strs)); compile time error
    }

    public static <E extends Number> List<E> getList(E[] e) {
       return Arrays.asList(e);
    }
     // TODO method with lower bound wildcards
    



}