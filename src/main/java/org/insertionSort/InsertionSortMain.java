package org.insertionSort;

import java.util.Arrays;

public class InsertionSortMain {
    public static void main(String[] args) {
// it is also called as online sort
//        best case O(n) for accending order
//        worst case n(n-1)/2 = O(n^2)for decending order

                int[] arr = {2, 33, 4, 11, 4, 66};
//        int[] arr = {2, 4, 11, 33, 4, 66};

                for (int i = 1; i < arr.length; i++) {
                    //    33
                    int key = arr[i];   //33 4
                    int j = i - 1;  // j=0 1
                    //2  33
                    while (j >= 0 && key < arr[j]) {
                        arr[j + 1] = arr[j]; // arr[2]=33
                j = j - 1;
                        j--;// 0
                    }

                    arr[j + 1] = key;

                }
        System.out.println(Arrays.toString(arr));


//        int arr1[]={23,12,40,30,15};
//        int a=1;
//        while(a<arr1.length){
//            int b=a-1;
//            int key=arr1[a];
//            while (b>=0 && arr1[b]>key){
//                arr1[b+1]=arr1[b];
//                b--;
//            }
//            arr1[b+1]=key;
//            a++;
//        }
//                System.out.println(Arrays.toString(arr1));

            }



}
