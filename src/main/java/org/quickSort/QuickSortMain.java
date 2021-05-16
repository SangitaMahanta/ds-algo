package org.quickSort;

import java.util.Arrays;

public class QuickSortMain {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[],int l,int r){
        int p_point=arr[l];
        int i=l;
        int j=r;

        while (i<j){
            while (arr[i]<=p_point)
                i++;
            while (arr[j]>p_point)
                j--;
            if (i<j){
                swap(arr,i,j);
            }
        }

        swap(arr,j,l);
        return j;
    }

    public static void quickSort(int arr[],int l,int r){
        if(l<r){
            int pivot=partition(arr,l,r);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,r);
        }
    }


    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};
        int l_index=0;
        int r_index=arr.length-1;
        System.out.println("Before sorting the array is "+ Arrays.toString(arr));
        quickSort(arr,l_index,r_index);
        System.out.println("After sorting the array is "+ Arrays.toString(arr));

    }
}
