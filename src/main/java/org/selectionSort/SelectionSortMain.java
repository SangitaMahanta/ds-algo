package org.selectionSort;

import java.util.Arrays;
//lets assuming array size 5
//find the smallest element from the arr[0-4]
//let take the small element for 0 index
//then run the loop for next element [1-4] and do the same operation.
public class SelectionSortMain {
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        System.out.println("Before sorting the array is : "+ Arrays.toString(arr));
        for (int i=0;i< arr.length;i++){
//            minItem=64
//            j=25
            int minItem=i;
            for (int j=i+1;j< arr.length;j++){
                    if(arr[minItem]>arr[j]) //64>25
                    {
                        minItem=j;
                    }
            }
            if (arr[i]>arr[minItem]){
                int temp=arr[minItem];
                arr[minItem]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("After sorting the array is : "+ Arrays.toString(arr));

    }
}
