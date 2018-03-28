package com.training.java;

class MyQueue {

    private MyLinkedList myLinkedList;
    private int size;

    MyQueue() {
        myLinkedList = new MyLinkedList();
        size = 0;
    }

    // + insert
    public void enqueue(Object obj) {
        myLinkedList.add(obj);
        size++;
    }

    // + remove
    public void dequeue() {
        Object obj = peek();
        myLinkedList.remove(obj);
        size--;
    }

    // + get
    public Object peek() {
        return myLinkedList.get(size -1);
    }

    // + isEmpty
    public boolean isEmpty() {
        return size == 0;
    }
}


public class MyQueueTester {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("Queue data 1");
        System.out.println(myQueue.peek());
        myQueue.enqueue("Queue data 2");
        myQueue.enqueue("Queue data 3");
        myQueue.enqueue("Queue data 4");
        System.out.println(myQueue.peek());
        myQueue.dequeue();
        System.out.println(myQueue.peek());
    }
}
