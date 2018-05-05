package com.training.java.datastructures;


class MyDoubleLinkedList {

    Object data;
    Node head;
    Node tail;

    int size;
    public MyDoubleLinkedList() {
        tail = new Node();
        head = new Node();
        tail.previous = head;
        head.next = tail;
        size = 0;
    }

//    public MyDoubleLinkedList(Object data, Node node) {
//        this.data = data;
//        this.head = node;
//        size = 0;
//    }

    public MyDoubleLinkedList(Object data) {
        this.data = data;
    }

    // add Last
    public void add(Object data) {
        Node current = head;
        Node newNode = new Node(data);
        Node previous = tail.previous;
        previous.next = newNode;
        newNode.previous = previous;
        newNode.next = tail;
        tail.previous=newNode;
        size++;
    }

    // add by index
    public void add(int index, Object data) {
        Node current = head;
        for (int i = 0; i <= index; i++) {
            current =  current.next;
        }
        Node newNode = new Node(data);
        Node previous = current.previous;
        previous.next = newNode;
        newNode.previous=previous;
        newNode.next = current;
        current.previous = newNode;
        size++;
    }

    // get by index
    public Object get(int index) {
        // the index is less than the size
        Node current = head;
        for (int i = 0; i < index; i++) {
            current =  current.next;
        }
        return current.data;
    }

    // get by Last

    // get First


    // set or update by index
    public void set(int index, Object data) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current =  current.next;
        }
        current.data = data;
    }

    // remove by index
    public void remove(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current =  current.next;
        }
        Node previous = current.previous;
        Node next = current.next;
        previous.next = next;
        next.previous = previous;
        size--;
    }
    // remove all

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        for (int i = 0; i < size; i++) {
            current = current.next;
            sb.append(current.data);
            sb.append(",");
        }
        return sb.toString();
    }

    // find or contains

    // Iterator
    // size

    class Node
    {
        Object data;
        Node next;
        Node previous;

        public Node() {
            Object data = null;
            Node next = null;
            Node previous = null;
        }

        public Node(Object data) {
            this.data = data;
            Node next = null;
            Node previous = null;
        }
    }
}


public class MyDoubleLinkedListDemo {

    public static void main(String[] args) {
        MyDoubleLinkedList dll = new MyDoubleLinkedList();
        dll.add("First Item");
        dll.add("Second Item");
        dll.add("Third Item");
        dll.add("Fourth Item");
        System.out.println(dll.toString());
        dll.add(3,"3.1 Third  Item");
        System.out.println(dll.toString());
        dll.set(2, "Second Replaced Item");
        System.out.println(dll.toString());
        dll.remove(4);
        System.out.println(dll.toString());

    }
}
