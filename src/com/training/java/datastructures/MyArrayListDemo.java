package com.training.java.datastructures;


import java.util.Iterator;

class MyArrayList {

    // -----------primitive data types - by default should be private----------
    private final int INITIAL_CAPACITY = 2;

    private int capacity=0;

    private Object[] data;

    private int size = 0;

    // object data types

    // ----- constructor-------------

    public MyArrayList() {
        this.capacity = INITIAL_CAPACITY;
        data = new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
    }

    // ------------------------------public methods-----------------------------

    // add
    public void add(Object e){
        ensureCapacity();
        data[size] = e;
        size++;
    }
    // add by index
    public void add(int index,Object e){
        ensureCapacity();
        for(int i = size-1; i>= index; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // get by index
    public Object get(int index) {
        return data[index];
    }


    // update
    public void set(int i, Object e){
        data[i] = e;
    }

    // delete
    public void delete(Object e){
        // nullify
        // shift position to recover space
        delete(getIndex(e));
    }

    public void delete(int index) {
        // shifting
        for (int i = index; i < size-1 ; i++) {
            data[i] = data[i + 1];
        }
        data[size-1] = null;
        size--;
    }

    // delete all
    public void deleteAll(){
        for (int i = 0; i < size ; i++) {
            data[i] = null;
        }
        size = 0;
    }

    // size
    public int size() {
       return size;
    }

    // Print all the elements
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size ; i++) {
            stringBuilder.append(data[i]);
            stringBuilder.append(',');
        }
        return stringBuilder.toString();
    }

    // iterate
    public Iterator iterate() {
        return new MyArrayListIterator();
    }

    class MyArrayListIterator implements Iterator {

        private int cursor = 0; // current index

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public Object next() {
            return data[cursor++];
        }
    }

    // ------------ private methods----------------
    // arraylist can increment automatically
    private void ensureCapacity() {
        // size & capacity
        if(size >= capacity) {
            Object[] newArray = new Object[capacity*2+1];
            System.out.println("New array length -> "+newArray.length);
            System.arraycopy(data, 0, newArray, 0, size );
            data = newArray;
        }
    }

    // get Index of object
    private int getIndex(Object obj) {
        int x = -1;
        for (int i = 0; i < size; i++) {
            if(data[i] == obj) { // TODO revisit
                x = i; // last occurance in the array
                return i; // gives first occurance in the array
            }
        }
        return x;
    }

}


public class MyArrayListDemo {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        System.out.println(myArrayList.size());
        myArrayList.add("Hello");
        myArrayList.add("Hello1");
        myArrayList.add("Hello2");
        System.out.println(myArrayList.size());

        myArrayList.add("Hello3");
        myArrayList.add(3,"Hello5");
        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.get(4));

        myArrayList.set(2,"Hello10");
        System.out.println(myArrayList.toString());

        myArrayList.delete(3);

        System.out.println(myArrayList.toString());

        Iterator iterator = myArrayList.iterate();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        myArrayList.deleteAll();
        System.out.println(myArrayList.toString());

    }
}
