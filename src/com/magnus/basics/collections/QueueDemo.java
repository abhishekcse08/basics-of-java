package com.magnus.basics.collections;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.addAll(List.of(0,1,2,3,10,-1,4,5,6));

        System.out.println(q);

        System.out.println(q.poll()); // minimum element 0

        //Queue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());

        //10,6,5,4,3,2,1,0
        /*maxQ.addAll(List.of(0,1,2,3,10,4,5,6));
        System.out.println(maxQ);
        System.out.println(maxQ.poll());*/

    }

    //
//10,10
}


