//package org.mergeSort;
//
//import java.util.Arrays;
//
//public class PracticeMergeSort {
//    public static void main(String[] args) {
//        int arr[]={12,5,8,78,93,22};
//        mergeSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void mergeSort(int[] arr, int l, int r) {
//        if (l<r){
//            int mid=l+(r-l)/2;
//            mergeSort(arr,l,mid);
//            mergeSort(arr,mid,r);
//            merge(arr,l,mid,r);
//        }
//    }
//
//    private static void merge(int[] arr, int l, int mid, int r) {
//int n1=mid-l;//n1 is for left sub-array
//int n2=r;
//
//int L[]=new int[n1];
//int R[]=new int[n1];
//
//for (int i=0;i<n1;i++)
//{
//    L[i]=arr[i+l];
//}
//for (int i=0;i<n2;i++)
//{
//    R[i]=arr[mid+i+1];
//}
//int i=0,j=0,k=l;
//while (i<n1 && j<n2){
//    if (L[i]<R[j]){
//        arr[k]=L[i];
//        i++;
//    }
//
//}
//
//    }
//}
