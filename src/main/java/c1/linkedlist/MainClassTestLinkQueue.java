package main.java.c1.linkedlist;

public class MainClassTestLinkQueue {

    public static void main(String[] args) {
        QueueWithLinkedList<String> queue = new QueueWithLinkedList<>();

        String f1 = "1";
        String f2 = "2";
        String f3 = "3";
        String f4 = "4";
        String f5 = "5";


        queue.enqueue(f1);
        queue.enqueue(f2);
        queue.enqueue(f3);
        queue.enqueue(f4);
        queue.enqueue(f5);


        System.out.println(queue.sout());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}
