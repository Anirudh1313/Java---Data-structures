package com.company;

public class Node {

    private int value;
    private Node next;

    //contrucutor
    public Node(int val) {
        this.value = val;
        this.next = null;
    }

    //copy constructor
    Node(Node n) {
        System.out.println("Copy constructor called");
        value = n.value;
        next = n.next;
    }


    public int get_value() {
        return value;
    }

    public Node get_next() {
        return next;
    }

    public void set_value(int val) {
        this.value = val;
    }

    public void set_next(Node n) {
        this.next = n;
    }

    public boolean isEqual(Node a, Node b) {
        if(a.value == b.value && a.next == b.next) {
            return true;
        }
        else {
           return false;
        }
    }


}
