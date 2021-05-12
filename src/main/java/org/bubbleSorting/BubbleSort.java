package org.bubbleSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,13,66,34,18,89,67,45,53,23};

        for (int i=0;i< arr.length;i++){
//            (arr.length-i)-1 it decrease 1 index position of j , if we remove -1 here then it will get an exception arrayIndexOutOfBound
            for (int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
