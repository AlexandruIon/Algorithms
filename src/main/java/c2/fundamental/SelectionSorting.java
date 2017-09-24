package main.java.c2.fundamental;

public class SelectionSorting {

    public static void main(String[] args) {
        Comparable[] values = {3, 2, 6, 7, 1, 9, 4, 5, 8};
        sort(values);
        show(values);
    }


    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int newMinIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[newMinIndex])) {
                    newMinIndex = j;
                }
            }
            exch(a, i, newMinIndex);
            show(a);
        }

    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" _______----_______ ");
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

}

