package org.ksorted;
//Given an array of n elements, where each element is at most k away from its target position,
// devise an algorithm that sorts in O(n log k) time.
// For example,let us consider k is 2, an element at index 7 in the sorted array,
// can be at indexes 5, 6, 7, 8, 9 in the given array.

//Input : arr[] = {6, 5, 3, 2, 8, 10, 9}
//            k = 3
//Output : arr[] = {2, 3, 5, 6, 8, 9, 10}

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KSortedMain {
    public static void main(String[] args) {
        int arr[]={6, 5, 3, 2, 8, 10, 9};
        System.out.println("the array is :"+ Arrays.toString(arr));
        int n=arr.length;
        int k=3;
        kSorted(arr,n,k);
        System.out.println("the k-sorted array is : "+Arrays.toString(arr));
    }

    public static void kSorted(int arr[],int n,int k){
        Queue<Integer> pQueue= new PriorityQueue<Integer>();
        int index=0;

        for (int i=0;i<k+1;i++){
            pQueue.add(arr[i]); //6,5,3,2
                               //_,3,5,6,8
        }

        for (int i=k+1;i<n;i++){
            arr[index++]=pQueue.peek();//2 //3
            pQueue.poll();//2  // 3
            pQueue.add(arr[i]);//4= 8   //_,6,5,3,8 || 4= 10 //_,_,6,5,8,10
        }

        Iterator<Integer> it=pQueue.iterator();

        while (it.hasNext()){
            arr[index++]=pQueue.peek();
            pQueue.poll();
        }
    }
}
