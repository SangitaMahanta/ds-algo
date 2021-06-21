package org.greedy;

import java.util.Arrays;

//It works in local optimal decission(it should be a choice)
//QUESTION  :
//Find the maximum number of activities that can be performed,
// if both start and finish time to do an activity is given :
//  output : it should be max activity
//              A B  C D E F
//i.e ; start : 1 2  5 1 7 8
//      end   : 2 4 7 6 10 9
public class GreedyAlgo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 1, 7, 8,19,34};
        int arr1[] = {2, 4, 7, 6, 10, 9,57,99};
        int length = arr.length;
        Arrays.sort(arr);// 1 1 2 5 7 8
        Arrays.sort(arr1);//2 4 6 7 9 10

        System.out.println(greedySol(arr,arr1,length));

    }

    private static int greedySol(int[] arr, int[] arr1, int l) {
        int i1=0,i2;
        int count =1;
        for (i2 = 1;i2 < l;i2++){
            if (arr[i2] >= arr1[i1]){
                i1 = i2;
                count++;
            }
        }
        return count;
    }
}
