package main.java.c1.dinamiconectivity;

public class UnionFieldMainClass {

    public static void main(String[] args) {


        UnionFieldArrayWithLinkedList unionField = new UnionFieldArrayWithLinkedList(5);

        unionField.printArray();
        System.out.println(unionField.count());

        System.out.println("/////////////////////");
        System.out.println("Connected 1 with 2: false:  " + unionField.connected(1, 2));
        unionField.union(1, 2);
        System.out.println("Connected 1 with 2: true:  " + unionField.connected(1, 2));
        System.out.println(unionField.count());
        unionField.printArray();

        System.out.println("/////////////////////");
        System.out.println("Connected 0 with 3: false:  " + unionField.connected(0, 3));
        unionField.union(0, 3);
        System.out.println("Connected 0 with 3: true:  " + unionField.connected(0, 3));
        System.out.println(unionField.count());
        unionField.printArray();

        System.out.println("/////////////////////");
        System.out.println("Connected 0 with 1: false:  " + unionField.connected(0, 1));
        unionField.union(0, 1);
        System.out.println("Connected 0 with 1: true:  " + unionField.connected(0, 1));
        System.out.println(unionField.count());
        unionField.printArray();


        System.out.println("/////////////////////");
        System.out.println("Connected 1 with 4: false:  " + unionField.connected(1, 4));
        unionField.union(1, 4);
        System.out.println("Connected 1 with 4: true:  " + unionField.connected(1, 4));
        System.out.println(unionField.count());
        unionField.printArray();



//        System.out.println(unionField.find(2));
//        System.out.println(unionField.find(2));
//        System.out.println(unionField.find(2));


    }

}
