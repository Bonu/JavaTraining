package com.training.java;

import java.util.Arrays;

public class MyArrayListTester {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList(20);
        System.out.println("List size ->"+myArrayList.size());
        myArrayList.add(new String("Test"));
        System.out.println("List size ->"+myArrayList.size());
    }
}

class MyArrayList {

   private Object[] dataStore;

   private static final int INITIAL_CAPACITY = 10;

   private int size = 0;

    public MyArrayList() {
        dataStore = new Object[INITIAL_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        dataStore = new Object[initialCapacity];
    }

    // + add
    public void add(Object obj) {
        // if the array is already full, then how will you add the new element into it ? -- homework
        dataStore[size] = obj;
        size++;
    }

    // + add by index
    // -- homework

    // + remove

    // + get by index
    // -- homework

    // + replace by index

    // + removeAll

    // + size
    public int size(){
        return this.size;
    }

    // - increaseCapacity - double the size of capacity
    private void increaseCapacity() {
        // copy the existing data to new Array that has more size
        dataStore = Arrays.copyOf(dataStore, (dataStore.length * 2));
    }

}
