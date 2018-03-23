package com.training.java;

public class GenericMethodTester {

    public static <E> void printArray(E[] elements) {
        for ( E element : elements){
            System.out.println(element );
        }
        System.out.println();
    }

    public static <E extends Number> double sum(E[] elements) {
        double result = 0;
        for (E element : elements
                ) {
            result = element.doubleValue() + result;
        }
        return result;
    }

//    public static void printArray(Integer[] elements) {
//        for ( Integer element : elements){
//            System.out.println(element );
//        }
//        System.out.println();
//    }
//
//    public static void printArray1(String[] elements) {
//        for ( String element : elements){
//            System.out.println(element );
//        }
//        System.out.println();
//    }

    public static void main( String args[] ) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Float[] floats = {10.10f, 20.20f};
        String[] strings = { "Hello world","How","are", "you"};

        System.out.println( "Print Integer Array" );
        printArray( intArray  );

//        System.out.println( "Print String Array" );
//        printArray( strings );

        sum(intArray);
        sum(floats);
        
    }
}