package com.training.java.datastructures;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MySingleLinkedList<String> mySingleLinkedList = new MySingleLinkedList<>();
        System.out.println(mySingleLinkedList.getFirst());
    }
}

class MySingleLinkedList<E> {

    Node<E> head;
    int size = 0;
    MySingleLinkedList(){

    }

    public E getFirst(){
        return head.data;
    }

    public E get(int index){
        return null; // TODO
    }

    public void add(E e){
        Node<E> newNode = new Node<>(e);
        newNode.nextNode = head;
        head = newNode;
        size++;
    }

    public void add(int index, E e) {

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.nextNode;
        }
        Node<E> temp = current.nextNode;
        current.nextNode = new Node<>(e);
        (current.nextNode).nextNode = temp;
        size++;
    }

    public void remove(){
        head = head.nextNode;
    }

    public void remove(int index){

        Node<E> previous = head;
        for (int i = 0; i < index ; i++) {
            previous = previous.nextNode;
        }
        Node<E> current = previous.nextNode;
        previous.nextNode = current.nextNode; // remove or replace has happened
        size--;

    }

    public void set(int index, E e) {
     // --homework
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(current.data);
            stringBuilder.append(',');
            current = current.nextNode;
        }
        return stringBuilder.toString();
    }

    public Iterator<E> iterator(){
        return new MyLinkedListIterator();
    }

    class MyLinkedListIterator implements Iterator<E>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            // Ignore
        }
    }

}


class Node<E> {
    E data;
    Node<E> nextNode;

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node<E> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }
}