package org.unionAndIntersectionOfArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

//Procedure :
// step-1   : compare the length of an two arr
//step-2    : take a new empty arr with length is (1st arr length + 2nd arr length)
//step-3    : sort all an elements of small arr
//step-4    : put all the elements of small array  into the empty array
//step-5    : after that compare each elements of big arr with new array elements ,
//            if element is not match then put that elements into the new array
//
public class UnionOfTwoArray {
    public static void m1(String[] args) {
        int arr[] = {11, 2, 8, 75, 23, 12, 99, 33, 88};
        int arr1[] = {11, 2, 8, 5, 91, 33, 88};

        int arr3[] = new int[arr.length + arr1.length];
        if (arr.length > arr1.length) {
            Arrays.sort(arr1);
            for (int i = 0; i < arr1.length ; i++) {
                arr3[i] = arr1[i];
            }
        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length - 1; j++) {
            if (!binSearch(arr1, arr[j])) {
                arr3[arr1.length + j] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr3));

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

//  Dynamic memory allocation using linkedList

    public static void main(String[] args) {
        int arr[] = {11, 2, 8, 75, 23, 12, 99, 33, 88};
        int arr1[] = {11, 2, 8, 5, 91, 33, 88};
LinkedList<Integer> lst = new LinkedList<Integer>();

        if (arr.length > arr1.length) {
            Arrays.sort(arr1);
            for (int i = 0; i < arr1.length ; i++) {
                lst.add(arr1[i]);
            }
        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length - 1; j++) {
            if (!binSearch1(arr1, arr[j])) {
                lst.add(arr[j]);
            }
        }


        Iterator itr = lst.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
    private static boolean binSearch1(int arr[], int n) {
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