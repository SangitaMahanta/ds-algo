package org.countInversion;

import java.util.Arrays;

public class InversionCount {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
int result = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    private static int mergeSort(int[] arr, int l, int r) {
        int count =0;

        if(l<r){
            int mid = l+(r-l)/2;
           count+= mergeSort(arr,l,mid);
           count+= mergeSort(arr,mid+1,r);

           count+= merge(arr,l,mid,r);
        }
        return count;
    }

    private static int merge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i=0; i< n1;i++)
            L[i] = arr[l+i];
        for (int i=0; i< n1;i++)
            R[i] = arr[m+1+i];

        int i=0,j=0,k=l,inver_no=0;
        while (i< n1 && j< n2){
            if (L[i] < R[j]){
             arr[k++] = R[j++];
             inver_no+=(n2-i);
            }
            else
                arr[k++] = L[i++];
        }

        while (i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        return inver_no;
    }
}
