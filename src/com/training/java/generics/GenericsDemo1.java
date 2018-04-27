package com.training.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo1 {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

//        intList.add("Hello");
        intList.add(20);
        intList.add(20);
        intList.add(20);
        intList.add(20);

        int sum = 0;

        for (int i=0;i < intList.size();i++){
            sum += (int)intList.get(i);
        }

        System.out.println(sum);

    }
}
