package org.binSearch;

import java.util.Scanner;

public class BinarySearch {
    public static int count=0;
    public static int binarySearch(int arr[],int searchItem)
    {
        int left=0;
        int right=arr.length-1;
        int arr_length=arr.length;
//        int mid;


        for (int i=0;i<arr_length;i++)
        {
            if(searchItem==arr[left]){
                count++;
                return 0;
            }else if(searchItem==arr[right]){
                count++;
                return right;
            }
            while ((right-left)>1){
                count++;
            int  mid=(right+left)/2;
            if(searchItem==arr[mid]){
                return mid;
            }
            else if(searchItem<arr[mid]){
                right=mid;
            }
            else if(searchItem>arr[mid]){
                left=mid;
            }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,24,35,55,67,76,89,99};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the search item :");
        int s_element=sc.nextInt();

        int result=binarySearch(arr,s_element);
        if(result==-1){
            System.out.println("the item is not found");
        }
        else
        System.out.println("The item "+s_element+" is found in "+result+" index of "+count+" attempt");

    }
}
