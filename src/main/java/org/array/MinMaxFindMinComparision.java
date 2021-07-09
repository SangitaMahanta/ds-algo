package org.array;

public class MinMaxFindMinComparision {
    public static void main(String[] args) {
        int arr[] = {11,-34,77,98,-2,-55,77,100};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count=0;
        for (int i=0; i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
                count++;
            }

            if(arr[i]<min){
                min = arr[i];
                count++;
        }
        }
        System.out.println("min = "+min+" and max = "+max+" no of comparision "+count);
    }
}
