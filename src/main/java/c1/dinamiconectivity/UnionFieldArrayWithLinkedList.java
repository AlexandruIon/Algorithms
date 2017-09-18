package main.java.c1.dinamiconectivity;

import java.util.Arrays;
import java.util.Objects;

class UnionFieldArrayWithLinkedList {

    private Node[] components;

    UnionFieldArrayWithLinkedList(Integer size) {
        components = new Node[size];

        for (int i = 0; i < size; i++) {
            components[i] = new Node(i, null);
        }

    }

    private int find(int p) {
        for (int i = 0; i < components.length; i++) {
            if (findInNode(components[i], p)) {
                return i;
            }
        }
        return -1;
    }

    boolean connected(int p, int q) {
        for (Node component : components) {
            if (findInNode(component, p) && findInNode(component, q)) {
                return true;
            }
        }
        return false;
    }

    private boolean findInNode(Node node, int p) {
        return !Objects.isNull(node) && (node.value == p || findInNode(node.nextNode, p));
    }

    void union(int p, int q) {
        int pLocation = find(p);
        int qLocation = find(q);

        if (pLocation == -1 || qLocation == -1) {
            return;
        }

        getLastNode(components[pLocation]).nextNode = components[qLocation];

        components[qLocation] = null;

        Node[] components2 = new Node[components.length - 1];

        int j = 0;
        for (Node component : components) {
            if (!Objects.isNull(component)) {
                components2[j++] = component;
            }
        }

        components = components2;
    }

    private Node getLastNode(Node node) {
        while (!Objects.isNull(node.nextNode)) {
            node = node.nextNode;
        }
        return node;
    }

    int count() {
        return components.length;
    }

    void printArray(){
        System.out.println(Arrays.toString(components));
    }


    private class Node {

        private int value;
        private Node nextNode;

        Node(int value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }
}
