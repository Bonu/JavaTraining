package com.training.java;

public class MyLinkedListTester {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String 1");
        System.out.println("Size ->"+linkedList.size());

    }
}

class MyLinkedList {

    private Node head;
    private int size;

    MyLinkedList(){
        size = 0;
        head = null;
    }

    // + add
    public void add(Object object){

        // check if there is any thing in the Linked list.
        if(head == null) {
            head = new Node(object);
        } else {
            Node node = head;
            node.nextNode = new Node(object); // -- how to handle adding 3rd node here? -- homework
            // -- say what is the problem here
            // & say what is your solution here
        }
        size++;
    }

    // + update
    // --homework

    // + delete
    // --homework

    // + get
    public Object get(int index) {
        Node node = getNode(index);
        return node.data;
    }

    // + size
    public int size() {
        return this.size;
    }

    // - iterate through the list
    private Node getNode(int index) {
        Node node  = head;
        for (int i = 0; i < size; i++) {
            node = node.nextNode;
            if(index == i ) {
                return node;
            }
        }
        return null;
    }

    // -- reverse the data in the linked list

}

class Node {

     Object data;
     Node nextNode;

     Node(Object data) {
         this.data = data;
     }

     Node(Object data, Node nextNode) {
         this.data = data;
         this.nextNode = nextNode;
     }

}
