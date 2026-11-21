package com.magnus.basics.collections;

import java.util.Stack;

public class StackDemo {
//FILO or LIFO
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.pop()+":"+s.pop()+":"+s.pop());
       /* System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(200));
        System.out.println(s.empty());
        s.pop();*/




    }
}


