package com.training.java;


class MyGenericArrayList<E> {
    private int size;     // number of elements
    private Object[] elements;

    public MyGenericArrayList() {  // constructor
        elements = new Object[10];  // allocate initial capacity of 10
        size = 0;
    }

    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
            // allocate a larger array and add the element, omitted
        }
        ++size;
    }

    public E get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (E)elements[index];
    }

    public int size() { return size; }
}

public class MyGenericArrayListTester {
    public static void main(String[] args) {
        // type safe to hold a list of Strings
        MyGenericArrayList<String> strLst = new MyGenericArrayList<String>();

        strLst.add("alpha");   // compiler checks if argument is of type String
        strLst.add("beta");

        for (int i = 0; i < strLst.size(); ++i) {
            String str = strLst.get(i);   // compiler inserts the downcasting operator (String)
            System.out.println(str);
        }

//        strLst.add(new Integer(1234));  // compiler detected argument is NOT String, issues compilation error

    }
}