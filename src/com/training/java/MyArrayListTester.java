package com.training.java;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayListTester {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList(5);
        System.out.println("List size ->"+myArrayList.size());
        myArrayList.add(new String("Test0"));
        myArrayList.add(new String("Test1"));
        myArrayList.add(new String("Test2"));
        myArrayList.add(new String("Test3"));
        myArrayList.add(new String("Test4"));
        myArrayList.add(new String("Test5"));
        for (int i = 6; i <10000000 ; i++) {
            myArrayList.add(new String("Test"+i));
        }
        System.out.println("List size ->"+myArrayList.size());
        System.out.println("Get obj @ 0 ->"+myArrayList.get(0));
        System.out.println("Get obj @ 4 ->"+myArrayList.get(4));
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
        if(size == dataStore.length) {
            increaseCapacity();
        }
        System.out.println("Capacity->"+ dataStore.length);
        dataStore[size] = obj;
        size++;
    }

    // + add element at index
    public void add(int index, Object obj) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        add(obj);

        // move the elements
        for(int i = size - 1; i > index; i--){
            dataStore[i] = dataStore[i - 1];
        }
    }

    // + addAll
    public void addAll(Collection collection){
        boolean flag= true;
        for (Object object: collection) {
            add(object);
        }
    }

    // + set by index
    public void set(Object obj, int index) {
        dataStore[index] = obj;
    }

    // print all the elements in the Arraylist -- homework


    // + remove
    public void remove(Object obj){
        int index = indexOf(obj);
        for(int i=index;i<size-1;i++){ // shift the elements by 1 position
            dataStore[i] = dataStore[i + 1];
        }
        size--;
    }

    // + removeAll
    public void removeAll(Collection collection) {
        for (Object obj:collection) {
            remove(obj);
        }
    }

    // + get by index
    public Object get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return dataStore[index];
    }

    // + replace by index



    // + size
    public int size(){
        return this.size;
    }

    public boolean isEmtpy() {
        return size == 0;
    }

    public Object[] toArray() {
        return Arrays.copyOf(dataStore, size);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if(obj.equals(dataStore[i])) {
                return i;
            }
        }
        return -1;
    }

    // Reverse a order of data in the list --homework

    // Implement binary search for the ArrayList --homework

    // - increaseCapacity - double the size of capacity
    private void increaseCapacity() {
        // copy the existing data to new Array that has more size
        dataStore = Arrays.copyOf(dataStore, (dataStore.length * 2));
    }

}
