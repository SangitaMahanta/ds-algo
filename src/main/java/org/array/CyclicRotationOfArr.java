package org.array;

//Rotate an element in a clock-wise manner
//if the array is {1,23,44,55}
//after rotation array be looks like {55,1,23,44}

import java.util.Arrays;

public class CyclicRotationOfArr {
    public static void m1(String[] args) {
        int arr[] = {1,2,3,4,5,86};

        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i>0 ; i--){
            arr[i-1] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

//anti clk wise
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,86};
        int temp = arr[0];

        for (int i = 0;i<arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
