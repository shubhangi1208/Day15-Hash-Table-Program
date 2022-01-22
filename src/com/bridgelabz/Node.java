package com.bridgelabz;

class Nodes <T extends Comparable<T>> {
    public T key;
    public int value;
    public Node next;

    //Node Constructor for Creating New Node
    Nodes(T key) {
        this.key = key;
        this.value = 1;
        this.next = null;
    }
}