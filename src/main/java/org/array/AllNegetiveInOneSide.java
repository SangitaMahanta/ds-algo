package org.array;

import java.util.Arrays;

public class AllNegetiveInOneSide {
    public static void main(String[] args) {
        int arr[] = {11,99,-23,-5,-77,92,18,-5,0,-88,90,67};
//        int arr[] = {-17,31,45,50,-7,-21};

        int i,n=arr.length-1;
        int temp,j=0;
        for (i=0;i<=n;i++){
            if(arr[i]<0)
//            if(i!=j) // it is only work in 2nd array not for all possibilities of an arr
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
