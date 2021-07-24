package org.countInversion;

import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int inversion = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i] > arr[j])
                {
                    inversion++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(inversion);
    }
}
