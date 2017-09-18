package main.java.c1.linkedlist;

public class QueueWithLinkedList<Item> {

    private Node first; // link to least recently added node
    private Node last; // link to most recently added node
    private int N = 0;

    private class Node { // nested class to define nodes
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }


    public void enqueue(Item item) {
        Node oldLastNode = last;
        last = new Node(item, null); // new node to add it to the end of the link list

        if (isEmpty()) {
            first = last;
        } else {
            oldLastNode.next = last;
        }
        N++;
    }

    public Item dequeue(){
        Item itemToDisplay = first.item;
        first = first.next;

        if(isEmpty()){
            last = null;
        }

        N--;
        return itemToDisplay;

    }


    private boolean isEmpty() {
        return N == 0;
    }


    public String sout() {
        StringBuilder asd = new StringBuilder();
        Node start = first;
        while (start != null) {
            asd.append(start.item.toString());
            start = start.next;
        }

        return asd.toString();
    }
}