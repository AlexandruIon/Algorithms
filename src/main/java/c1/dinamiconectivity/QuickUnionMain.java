package main.java.c1.dinamiconectivity;

public class QuickUnionMain {

    public static void main(String[] args) {

        QuickUnion quickUnion = new QuickUnion(10);

        System.out.println(quickUnion.toString());
        quickUnion.union(4, 3);
        quickUnion.union(3, 8);
        quickUnion.union(6, 5);
        quickUnion.union(9, 4);
        quickUnion.union(2, 1);
        quickUnion.union(8, 9);
        quickUnion.union(5, 0);
        quickUnion.union(7, 2);
        quickUnion.union(6, 1);
        quickUnion.union(1, 0);
        quickUnion.union(6, 7);

        System.out.println("______________________________-----------________________________");
        QuickUnionWeighted quickUnionWeighted = new QuickUnionWeighted(10);

        System.out.println(quickUnionWeighted.toString());
        quickUnionWeighted.union(4, 3);
        quickUnionWeighted.union(3, 8);
        quickUnionWeighted.union(6, 5);
        quickUnionWeighted.union(9, 4);
        quickUnionWeighted.union(2, 1);
        quickUnionWeighted.union(8, 9);
        quickUnionWeighted.union(5, 0);
        quickUnionWeighted.union(7, 2);
        quickUnionWeighted.union(6, 1);
        quickUnionWeighted.union(1, 0);
        quickUnionWeighted.union(6, 7);


    }
}
