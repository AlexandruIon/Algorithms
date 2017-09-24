package main.java.c1.dinamiconectivity;

public class QuickFind {


    private int[] data;
    private int componets;

    public QuickFind(int dataSize) {
        this.data = new int[dataSize];
        componets = dataSize;

        for (int i = 0; i < dataSize; i++) {
            data[i] = i;
        }
    }

    int find(int q) {
        return data[q];
    }

    void union(int p, int q) {
        int findP = find(p);
        int findQ = find(q);

        if (findP == findQ) {
            // already connected
            return;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == findP) {
                data[i] = findQ;
            }
        }
        componets--;
    }

    boolean areConnected(int p, int q) {
        int findP = find(p);
        int findQ = find(q);

        return findP == findQ;
    }

}
