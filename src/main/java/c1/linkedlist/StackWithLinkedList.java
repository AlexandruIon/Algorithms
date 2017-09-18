package main.java.c1.linkedlist;

import java.util.Objects;

public class StackWithLinkedList<Item> {

    private Integer noOfElements;
    private Node<Item> firstNode;

    public StackWithLinkedList(Node<Item> firstNode) {
        this.firstNode = firstNode;
        this.noOfElements = 1;
    }

    public void push(Item item) {
        firstNode = new Node(item, firstNode);
        noOfElements++;
    }

    public Item pop() {
        if (Objects.isNull(firstNode)) {
            throw new NullPointerException();
        }

        Item toReturn = firstNode.getItem();
        firstNode = firstNode.getNext();
        noOfElements--;

        return toReturn;
    }

    public Integer size() {
        return noOfElements;
    }

}
