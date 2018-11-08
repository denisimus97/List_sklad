package com.company;
import java.util.Iterator;
import java.util.LinkedList;

public class StockLinkedList implements Iterable<String> {
    private LinkedList<String> stock;

    public StockLinkedList() {
        stock = new LinkedList<>();
    }

    public void add(String name) {
        this.stock.add(name);
    }

    @Override
    public Iterator<String> iterator() {
        return new StockIterator();
    }

    class StockIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < stock.size();
        }

        @Override
        public String next() {
            return stock.get(index++);
        }
    }
}
