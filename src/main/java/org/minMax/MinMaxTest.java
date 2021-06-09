package org.minMax;

public class MinMaxTest {
    public static class Calculate{
        int min;
        int max;
    }
    public static void main(String[] args) {
        int arr[]={11,99,-45,87,8};
        Calculate cal=new Calculate();
        //if array contain one element
        if(arr.length==1){
            cal.min=arr[0];
            cal.max=arr[0];
        }
        //if an array contain two element
        if (arr[0]>arr[1]){
            cal.max= arr[0];
            cal.min=arr[1];
        }
        else{
        cal.max= arr[1];
        cal.min= arr[0];
    }
        int count=1;
        for (int i=2;i<arr.length-1;i++){
            ++count;
            if (arr[i]> cal.max){
                cal.max=arr[i];
            }
            else if(arr[i]< cal.min){
                cal.min=arr[i];
            }
        }

        System.out.println("Min = "+cal.min);
        System.out.println("Max = "+cal.max);
        System.out.println("No of comparision = "+count);
    }
}
