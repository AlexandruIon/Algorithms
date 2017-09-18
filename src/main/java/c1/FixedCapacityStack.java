package main.java.c1;

public class FixedCapacityStack<Item> {

    private Item[] stack;
    private int N;

    public FixedCapacityStack(Integer stackSize) {
        this.stack = (Item[]) new Object[stackSize];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item s) {
        stack[N++] = s;
    }

    public Item pop() {
        return stack[--N];
    }

}
