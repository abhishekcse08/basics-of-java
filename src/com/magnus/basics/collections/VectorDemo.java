package com.magnus.basics.collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.size();
        v.add("A");
        v.add("B");
        v.remove("A");

        System.out.println(v);

    }
}
