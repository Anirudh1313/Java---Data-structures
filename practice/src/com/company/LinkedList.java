package com.company;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public LinkedList(int first) {
        head = new Node(first);
        head.set_next(null);
        tail = head;
        size = 1;
    }

    public void push_back(int val) {
        tail.set_next(new Node(val));
        tail = tail.get_next();
        size++;
    }

    public int pop_back() {
        int ret = tail.get_value();
        tail = null;
        size--;
        return ret;
    }

    public int pop_front() {
        Node ret = head;
        int ret_i = head.get_value();
        head = head.get_next();
        ret = null;
        size--;
        return ret_i;
    }

    public void push_front(int val) {
        Node ptr = new Node(val);
        ptr.set_next(head);
        head = ptr;
        size++;
    }

    public void add(int val, int index) {
        Node ptr = head;
        Node prev = head;
        int i = 0;
        while(i < index)
        {
            prev = ptr;
            ptr = ptr.get_next();
            i++;
        }

        prev.set_next(new Node(val));
        prev.get_next().set_next(ptr);
        size++;
    }

    public int remove(int index) {
        Node ptr = head;
        Node prev = ptr;
        int i = 0;

        while(i < index)
        {
            prev = ptr;
            ptr = ptr.get_next();
            i++;
        }

        int ret = ptr.get_value();

        prev.set_next(ptr.get_next());
        ptr = null;

        size--;

        return ret;
    }

    public void print() {
        Node ptr = head;
        for(int i = 0; i < size; i++)
        {
            if(i != size-1)
                System.out.print(ptr.get_value() + ", ");
            else if(i == size-1)
                System.out.println(ptr.get_value() + ". ");
            ptr = ptr.get_next();
        }
    }


}
