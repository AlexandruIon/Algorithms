package main.java.c1.linkedlist;

public class MainClassTestLinkStack {


    public static void main(String[] args) {
        Node<String> firstNode = new Node<>("First", null);

        StackWithLinkedList<String> stack = new StackWithLinkedList<>(firstNode);

        stack.push("Second");
        stack.push("3");
        stack.push("4");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
