package com.magnus.basics.collections;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>(); // it doesn't allow null
        ad.addFirst(10);
        ad.addFirst(20);
        ad.add(30);
        ad.addLast(40);
        ad.removeFirst();
        ad.removeLast();

       // System.out.println(ad);

        ArrayDeque<String> ads = new ArrayDeque<>();
        ads.push("A");
        ads.push("B");
        ads.push("C");

        ads.pop();
        System.out.println(ads);

    }
}
