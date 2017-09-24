package main.java.c2.merge;

import java.util.Arrays;

public class MyMerge {

    public static Comparable[] merge(Comparable[] a, int low, int mid, int hi) {

        Comparable[] accumulator = new Comparable[hi];

        int i = low, j = mid;

        for (int k = low; k < hi; k++) {
            accumulator[k] = a[k];
        }

        for (int k = low; k < hi; k++) {

            if (i > mid) {
                a[k] = accumulator[j++];
            } else if (j > hi) {
                a[k] = accumulator[i++];
            } else if (less(accumulator[j], accumulator[i])) {
                a[k] = accumulator[j++];
            } else {
                a[k] = accumulator[i++];
            }

        }


        return a;
    }


    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void main(String[] args) {
        Comparable[] test = {"E", "E", "G", "M", "R", "A", "C", "E", "R", "T"};
        System.out.println(Arrays.toString(merge(test, 0, test.length / 2, test.length)));
    }

}
