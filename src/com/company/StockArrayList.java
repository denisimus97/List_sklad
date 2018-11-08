package com.company;
import java.util.ArrayList;
import java.util.Iterator;

public class StockArrayList implements Iterable<String> {
    private ArrayList<String> stock;

    public StockArrayList() {
        stock = new ArrayList<>();
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
