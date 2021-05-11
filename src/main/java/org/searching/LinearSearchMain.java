package org.searching;
//Time complexity O(n)-worst case and O(n/2) in best case

public class LinearSearchMain {
    public static void linSearch(int arr[],int element){
        int s_index;
        int length=arr.length;
        int e_index=length-1;
        int position=-1;
//        search from starting index to end index
        for (s_index=0;s_index<=e_index; s_index++,e_index--){
            if(arr[s_index]==element){
                position=s_index;
                System.out.println("element found array at "+(position+1)+" position with "+(s_index+1)+" attempt");
                break;
            }
            if(arr[e_index]==element){
                position=e_index;
                System.out.println("element found array at "+(position+1)+" position with "+(length-e_index)+" attempt");
                break;
            }
        }
        if (position==-1)
            System.out.println("element not found");


    }
    public static void main(String[] args) {
        int arr[]={12,33,43,23,65,47,19};
        int s_element=65;
        linSearch(arr,s_element);
    }
}
