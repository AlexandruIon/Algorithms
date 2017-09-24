package main.java.c1.dinamiconectivity;

import java.util.Arrays;

public class QuickUnion {

    private int[] data;
    private int components;

    public QuickUnion(int components) {

        data = new int[components];
        for (int i = 0; i < components; i++) {
            data[i] = i;
        }
        this.components = components;
    }

    int find(int p) {
        while (data[p] != p) {
            p = data[p];
        }
        return p;
    }

    void union(int p, int q) {
        System.out.println("Union Of p = "+ p + " annd q = " + q);
        int findP = find(p);
        int findQ = find(q);

        if (findP == findQ) {
            return;
        }

        data[findP] = findQ;
        components--;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Components size: " + components + " Andd array" + Arrays.toString(data);
    }
}
