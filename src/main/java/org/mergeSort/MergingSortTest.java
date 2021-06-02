package org.mergeSort;

import java.util.Arrays;

public class MergingSortTest {
    public static void mergeSort(int arr[],int l ,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

        int L[]=new int[n1];
        int R[]=new int[n2];

//        copy the value in left sub-arr
        for (int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }

        //        copy the value in right sub-arr
        for (int i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }

        int i=0,j=0,k=l;
        while (i<n1 && j<n2){
            if (L[i] < R[j]){
                arr[k]=L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }


            k++;

        }

        while (i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
    }

    public static void sort(int arr[],int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);

            mergeSort(arr,l,mid,r);
        }
    }

    public static void main(String[] args) {
        int arr[]={22,4,13,77,45,70};
        sort(arr,0,arr.length-1);
        System.out.println("The sorted array is :"+"\n"+ Arrays.toString(arr));
    }
}
