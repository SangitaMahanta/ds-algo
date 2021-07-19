package org.array.merge2sortArr;

import java.util.Arrays;

//Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
// Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
//merge two sorted array without using extra space
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1 , 2, 5, 9, 12};
        int arr2[] = {3 , 4, 10, 11};

        mergeSort(arr1,arr2);
        System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
    }

    private static void mergeSort(int[] arr1, int[] arr2) {
        int i = 0, j = 0 , k = arr1.length-1;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i]<=arr2[j])
            {
                i++;
            }
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
