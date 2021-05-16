package org.mergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortMain {

// time complexcity O(n log n)
    public static void mergingTwoArray(int arr[],int l_index,int mid_index,int r_index){
        int arr1[]=new int[20];
        int i=l_index;
        int j=mid_index+1;
        int k=l_index;

        while (i<=mid_index && j<=r_index){
            if(arr[i]<arr[j]){
                arr1[k]=arr[i];
                i++;
            }
            else {
                 arr1[k]=arr[j];
                 j++;
            }
            k++;
        }

        //if left array is sorted
        if(i>mid_index){
            while (j<=r_index){
                arr1[k]=arr[j];
                j++;
                k++;
            }

        }else {
            while (i<=mid_index){
                arr1[k]=arr[i];
                i++;
                k++;
            }
        }
for (k=l_index;k<=r_index;k++){
    arr[k]=arr1[k];
}

    }


    public static void mergeSort(int arr[],int l_index,int r_index){
        if (l_index < r_index) {
            int mid_index=(l_index+r_index)/2;
            mergeSort(arr,l_index,mid_index);
            mergeSort(arr,mid_index+1,r_index);
            mergingTwoArray(arr,l_index,mid_index,r_index);
        }


    }
    public static void main(String[] args) {
        int arr[]={9,4,7,6,3,1,5};
        int l_index=0;
        int r_index=arr.length-1;
        System.out.println("Before sorting array is : "+ Arrays.toString(arr));
        mergeSort(arr,l_index,r_index);
        System.out.println("After sorting array is : "+ Arrays.toString(arr));
    }
}
