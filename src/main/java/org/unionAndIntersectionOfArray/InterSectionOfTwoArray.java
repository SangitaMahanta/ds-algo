package org.unionAndIntersectionOfArray;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class InterSectionOfTwoArray {
    public static void main(String[] args) {
        int arr[] = {11, 2, 8, 75, 23, 12, 99, 33, 88};
        int arr1[] = {11, 2, 8, 5, 91, 33, 88,12,91,123};
        Set<Integer> I = new TreeSet<>();


        if (arr.length > arr1.length) {
            Arrays.sort(arr1);
            for (int i = 0; i < arr.length; i++) {
                if (binSearch(arr1, arr[i])) {
                    I.add(arr[i]);
                }
            }
        }
        else if (arr.length < arr1.length) {
            Arrays.sort(arr);
            for (int i = 0; i < arr1.length; i++) {
                if (binSearch(arr, arr1[i])) {
                    I.add(arr1[i]);
                }
            }
        } else {
            Arrays.sort(arr);
            for (int i = 0; i < arr1.length; i++) {
                if (binSearch(arr, arr1[i])) {
                    I.add(arr1[i]);
                }


            }
        }
        System.out.println(I);
    }
    private static boolean binSearch(int arr[], int n) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] == n)
            return true;
        else if (arr[end] == n)
            return true;
        for (int i = 0; i < arr.length; i++) {
            int mid = (start + end) / 2;
            if (n < arr[mid])
                end = mid;
            else if (n > arr[mid])
                start = mid;
            else if (n == arr[mid])
                return true;


        }
        return false;

    }

}
