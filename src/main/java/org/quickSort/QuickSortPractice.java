package org.quickSort;


import java.util.Arrays;

public class QuickSortPractice {
    public static void main(String[] args) {
        int arr[]={12,5,8,78,93,22};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l>=r)return;

        int left=l;
        int right=r;
      int pivot=arr[(left+right)/2];

      while (left<=right){
          while (arr[left]<pivot)
              left++;
          while (arr[right]>pivot)
              right--;
          if (left<=right)
          {
              swap(arr,left,right);
              left++;
              right--;
          }
          quickSort(arr,l,right);
          quickSort(arr,left,r);
      }

    }

    private static void swap(int[] arr, int left, int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
