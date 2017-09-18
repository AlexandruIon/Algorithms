package main.java.c1;

public class FixedStackStringImplementation {

    private String[] stack;
    private int N;

    public FixedStackStringImplementation(Integer stackSize) {
        this.stack = new String[stackSize];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String s) {
        stack[N++] = s;
    }

    public String pop() {
        return stack[--N];
    }
}
