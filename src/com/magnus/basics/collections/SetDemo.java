package com.magnus.basics.collections;

import java.util.*;

public class SetDemo {

    //doesn't allow duplicate
    // it maintains order  // LinkedHashSet
    // allow only one null value
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(30);
        s.add(null);
        s.add(null);
        s.add(90);
        System.out.println(s);

        for(Integer i:s){
            System.out.println(i);
        }

        System.out.println("Linked Hash Set Demo");
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(40);
        System.out.println(ls);

        System.out.println("Tree Set Demo");
        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(1);
        ts.add(90);
        ts.add(30);
        ts.add(40);
        ts.add(40);
        System.out.println(ts);
        // Searching time comlexity of any element will be O(logn)

    }
}

// Q Find the duplicate element in Array =[ 10,10,10,20,30,50,10,10,30,40,40,40,40]
// Q find first repeted element from Array=
// Q find the longest consecutive  repeated  number from array
// Q which element repeated most