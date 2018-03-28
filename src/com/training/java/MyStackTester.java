package com.training.java;


import java.util.ArrayList;

/**
 * Stack implementaion using Arrays
 */
class MyStack {

    private MyArrayList myArrayList;
    private int size;
    MyStack() {
        myArrayList = new MyArrayList();
        size = 0;
    }

    // + insert
    public void push(Object obj) {
        myArrayList.add(obj);
        size++;
    }

    // + get - see what is present in the top of the stack
    public Object peek(){
        return myArrayList.get(myArrayList.size() - 1);
    }

    // + remove
    public void pop(){
        Object obj = myArrayList.get(myArrayList.size()-1);
        myArrayList.remove(obj);
        size--;
    }

    public int length() {
        return size;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "myArrayList=" + myArrayList +
                ", size=" + size +
                '}';
    }
}


public class MyStackTester {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Obj1");
        System.out.println(myStack.peek());
//        myStack.pop();
        myStack.push("Obj2");
        System.out.println(myStack.peek());
        System.out.println(myStack.length());
    }
}
