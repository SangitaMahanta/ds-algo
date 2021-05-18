package org.practice;

import java.util.Arrays;

//    Find the Minimum length Unsorted Subarray,
//    sorting which makes the complete array sorted
public class FindingSubArrayFromUnsortedArray
{
    public static int start_index;
   public static int last_index;
    public static void main(String[] args) {
        int arr[]={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
int i=0;
        System.out.println("THe unsorted array is "+Arrays.toString(arr));
//            int min_index=arr[i];

            for (int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    i++;
                }
                else {
                    start_index=i;
                    break;
                }
            }
//            for (int j=arr.length-1;j>i;j--){
//                if(arr[j]>arr[j-1]){
//                    j--;
//                }
//                else {
//                    last_index=++j+1;
//                    break;
//                }
        int j=0;
        i=arr.length-1;
        j=i-1;
        while(i>j){
//            int arr[]={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};

            if(arr[i]>arr[j]){
                    i--;
                    j--;
                }
                else {
                    last_index=i+1;
                    break;
                }

            }

//        System.out.println("start index is "+start_index);
//        System.out.println("last index is "+last_index);

        int unsortedArr[]=new int[last_index-start_index];
        int temp=start_index;
        for (int k=0;k<unsortedArr.length;k++){
            unsortedArr[k]=arr[temp];
            temp++;
        }
        System.out.println("The length of minimum unsorted arr is "+unsortedArr.length);
        System.out.println("And the unsorted Subarray is "+Arrays.toString(unsortedArr));
        Arrays.sort(unsortedArr);

        for (int l = 0; l < unsortedArr.length;l++){
            arr[start_index] = unsortedArr[l];
            start_index++;
        }
        System.out.println("The sorted array is "+Arrays.toString(arr));
    }
}
