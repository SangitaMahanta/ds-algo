package org.searching;
// Given an array arr[] of n elements, write a function to search a given element x in arr[].
//Time complexity O(n)-worst case and O(1) in best case
public class LinearSearch {
    public static int linSearch(int arr[],int element)
    {
        for (int i=0;i<arr.length;i++){
            if(arr[i]==element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
          int arr[]={10,20,80,30,60,50,110,100,130,170};
//          int s_element=110;
          int s_element=175;
          int result=linSearch(arr,s_element);

          if(result==-1)
              System.out.println("The search element "+s_element+" is not found in an array");
          else
        System.out.println("The search element "+s_element+" is found in an index "+result+" position");


    }

}
