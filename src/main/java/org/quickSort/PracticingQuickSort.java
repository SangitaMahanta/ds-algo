package org.quickSort;
import java.util.Arrays;
// 1 . Choose any one element as pivot element (choose it inside a method that will
//  work recursively here quick_sort())
// 2. The element may be start index, last index, or any index
// 3. If there is at least one element btn first and last i.e first < last is true
// then call a method such that it will place the pivot element in its correct position
// here our partition() do the work for us and it returns the index of pivot,
// then call the same method for left and right sub-array of the pivot element
// i.e one from 0 to pivot-1 and another pivot+1 to last
public class PracticingQuickSort {
    public static  void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static int partition(int[] arr,int left,int right){
        int pivot=arr[right];
        int i=left-1;
        for (int j=left;j<=right;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }
    public static void quickSort(int[] arr,int left,int right){
        if (left<right){
        int pivot=partition(arr,left,right);
        quickSort(arr,left,pivot-1);
        quickSort(arr,pivot+1,right);
    }}
    public static void main(String[] args) {
        int arr[]={22,6,88,11,2,3,9};
        quickSort(arr,0,arr.length-1);
        System.out.println("The sorted array is :"+ Arrays.toString(arr));
    }
}
