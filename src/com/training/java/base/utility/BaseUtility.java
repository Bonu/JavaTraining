package com.training.java.base.utility;

import java.util.List;

public class BaseUtility {

    public static double sum(List<? extends Number> numberlist){
        double sum = 0.0;
        for (Number n : numberlist) sum += n.doubleValue();
        return sum;
    }

}
