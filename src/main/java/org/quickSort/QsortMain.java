package org.quickSort;
//Taking middle element as pivot element
public class QsortMain {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void qsort(int[] arr, int f, int l){

        if (f >= l) return;

        int left = f;
        int right = l;

        int pivot = arr[(left+right)/2];

        while (left <= right){
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;
            if (left <= right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        qsort(arr,f,right);
        qsort(arr,left,l);
    }


    public static void main(String[] args) {
        int arr[]={11,55,9,42,90,42,26,25};
        qsort(arr,0,arr.length-1);
    }
}
