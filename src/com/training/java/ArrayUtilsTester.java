package com.training.java;

import java.util.Arrays;
import java.util.List;

public class ArrayUtilsTester {

    public static void main(String[] args) {
        // Base array for the example. It contains 9 elements.
        Integer[] integerArray = { 2, 4, 3, 7, 21, 9, 98, 76, 74 };
        System.out.printf("integerArray size: %d\n", integerArray.length);
        System.out.printf("integerArray elements: %s\n", Arrays.toString(integerArray));

        // Returns a fixed-size list backed by the specified array.
        List integerList = Arrays.asList(integerArray);

        // Returned list length
        System.out.printf("integerList size: %d\n", integerList.size());
        System.out.printf("integerList elements: ");
        for (Object i : integerList) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n\n");

        int[] baseArray = { 2, 4, 3, 7, 21, 9, 98, 76, 74 };

        // Sorts the specified array into ascending numerical order.
        System.out.printf("Unsorted baseArray: %s\n", Arrays.toString(baseArray));

        Arrays.sort(baseArray);

        System.out.printf("Sorted baseArray: %s\n", Arrays.toString(baseArray));

        // Searches the specified array of ints for the specified value
        // using the binary search algorithm.
        int idx = Arrays.binarySearch(baseArray, 21);
        System.out.printf("Value \"21\" found at index: %d\n\n", idx);

        // Copies the specified array, truncating or padding with zeros (if necessary)
        // so the copy has the specified length.
        int[] copyOfArray = Arrays.copyOf(baseArray, 11);

        System.out.printf("baseArray size: %d\n", baseArray.length);
        System.out.printf("baseArray elements: %s\n", Arrays.toString(baseArray));
        System.out.printf("copyOfArray size: %d\n", copyOfArray.length);
        System.out.printf("copyOfArray elements: %s\n\n", Arrays.toString(copyOfArray));

        // Copies the specified range of the specified array into a new array.
        System.out.printf("baseArray: %s\n", Arrays.toString(baseArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(baseArray, 5, 8);

        System.out.printf("copyOfRangeArray: %s\n\n", Arrays.toString(copyOfRangeArray));

        // Assigns the specified int value to each element of the specified array of ints.
        int[] fillArray = new int[5];
        System.out.printf("fillArray (before): %s\n", Arrays.toString(fillArray));

        Arrays.fill(fillArray, 1);

        System.out.printf("fillArray (after): %s", Arrays.toString(fillArray));

    }
}