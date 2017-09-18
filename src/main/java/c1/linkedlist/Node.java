package main.java.c1.linkedlist;

public class Node<Item> {

     Item item;
    Node<Item> next;

    public Node(Item item, Node<Item> next) {
        this.item = item;
        this.next = next;
    }

    public Node() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Node<Item> getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
