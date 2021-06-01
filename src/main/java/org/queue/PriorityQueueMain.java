package org.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
//        priority queue by default acts as min-heap
        Queue<Integer> pQueue=new PriorityQueue<Integer>();
        pQueue.add(12);
        pQueue.add(92);
        pQueue.add(2);
        pQueue.add(34);
        pQueue.add(121);

        System.out.println(pQueue.peek());//here it gets 2
        System.out.println(pQueue.poll());

//        for max-heap we will normally reverse the min-heap by using [Collections.reverse()]
        Queue<Integer> rPQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        rPQueue.add(12);
        rPQueue.add(92);
        rPQueue.add(2);
        rPQueue.add(34);
        rPQueue.add(121);
        System.out.println(rPQueue.peek());
        System.out.println(rPQueue.poll());

    }
}
