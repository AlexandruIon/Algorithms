package main.java.c2.fundamental;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        Comparable[] values = {3, 2, 6, 7, 1, 9, 4, 5, 8};
        sort(values);
    }

//    public static void sort(Comparable[] a) {
//
//
//        int N = a.length;
//        int h = 1;
//
//        while (h < N / 3) h = 3 * h + 1; // 1, 4, 13, 40
//
//
//        System.out.println("Selected H = " + h);
//
//        while (h >= 1) {
//            for (int i = h; i < N; i++) {
//                System.out.println("I = " + i);
//                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
//                    System.out.println("H = " + h);
//                    System.out.println("J = " + j);
//
//                    System.out.println("Before " + Arrays.toString(a));
//                    exch(a, j, j - h);
//                    System.out.println("After " + Arrays.toString(a));
//                }
//            }
//            h = h / 3;
//        }
//        System.out.println(Arrays.toString(a));
//    }


    public static void sort(Comparable[] a) {


        int N = a.length;
        int h = 1;

        while (h < N / 3) h = 3 * h + 1; // 1, 4, 13, 40


        System.out.println("Selected H = " + h);

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                System.out.println("I = " + i);
                for (int j = i; j >= h; j -= h) {
                    System.out.println("H = " + h);
                    System.out.println("J = " + j);

                    boolean less = less(a[j], a[j - h]);
                    System.out.println("Compare a[j] = " + a[j] + " with a[j-h] = " + a[j - h] + " is LESS = " + less);

                    if (less) {
                        System.out.println("Before " + Arrays.toString(a));
                        exch(a, j, j - h);
                        System.out.println("After " + Arrays.toString(a));
                    }
                }
            }

            System.out.println("Divide H ____________________________________________");
            h = h / 3;
            System.out.println("H = " + h);
        }
        System.out.println(Arrays.toString(a));
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
