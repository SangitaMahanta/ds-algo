package org.bubbleSorting;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int arr[]={43,12,54,52,66,99,61};

        for (int i=0;i< arr.length;i++){
         boolean   flag=false;
//         in optimize bubble sort,if some priod of time the array is already sorted
//            then the 2nd for loop will not run that decreases the time complexity
            for (int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                 break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
