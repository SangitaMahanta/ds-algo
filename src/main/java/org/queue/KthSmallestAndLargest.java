package org.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
//kth max and min element in an array
public class KthSmallestAndLargest {
    public static void main(String[] args) {
        int arr[] = {7,21,13,6,25,71};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        int k = 3;
        for (int i=0; i<k+1; i++){
            priorityQueue.add(arr[i]);
        }
        int index = 0;
        for (int i = k+1; i< arr.length; i++){
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(arr[i]);
        }

        Iterator<Integer>itr = priorityQueue.iterator();
        while (itr.hasNext()){
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
        }
        System.out.println("kth sorted array ");
        System.out.println(Arrays.toString(arr));
        System.out.println("kth smallest element "+arr[k-1]);
        System.out.println("kth largest element "+arr[arr.length-1-(k-1)]);

    }
}
