package com.company;

public class Main {
    public static void main(String[] args) {
        StockArrayList a = new StockArrayList();
        StockLinkedList b = new StockLinkedList();

        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");

        b.add("A");
        b.add("B");
        b.add("C");
        b.add("D");
        b.add("E");
        b.add("F");

        for (String i : a) {
            System.out.println(i);
        }

        System.out.println();

        for (String i : b) {
            System.out.println(i);
        }
    }
}