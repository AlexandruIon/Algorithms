package main.java.c1.dinamiconectivity;

import java.util.Arrays;

public class QuickUnionWeighted {

    private int[] data;
    private int[] weight;
    private int components;

    public QuickUnionWeighted(int components) {

        data = new int[components];
        weight = new int[components];
        for (int i = 0; i < components; i++) {
            data[i] = i;
            weight[i] = 0;
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
        System.out.println("Union Of p = " + p + " annd q = " + q);
        int findP = find(p);
        int findQ = find(q);

        if (findP == findQ) {
            return;
        }

        if (weight[findP] > weight[findQ]) {
            data[findQ] = findP;
            weight[findQ] += weight[findP];
        } else {
            data[findP] = findQ;
            weight[findP] += weight[findQ];
        }
        components--;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Components size: " + components + " Andd array" + Arrays.toString(data);
    }
}
