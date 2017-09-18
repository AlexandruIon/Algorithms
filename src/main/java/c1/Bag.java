package main.java.c1;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Iterable<T> {

    private T[] container;

    Bag(T[] container) {
        this.container = container;
    }

    public void add(T t){

    }

    public boolean isEmpty(){
        return container.length == 0;
    }

    public int size(){
        return container.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return container.length >= counter + 1;
            }

            @Override
            public T next() {
                T t = container[counter];
                counter++;
                return t;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
