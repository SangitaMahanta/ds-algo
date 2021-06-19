package org.array.maxSumOfContiguousSubArr;
// maxSoFar is initially assigned with MIN_VALUE bcz in case of
// all -ve array elements maxSofar value will still be small and hence
// it will be updated anyhow.
// for better clarity take all -ve value array and run the first if condition you will get the ans.

// MIN_VALUE = -2147483548(2^-31)

public class MaximumSumOfContiguousSubArray {
    public static void m1(String[] args) {
        int[] arr = {  -2,4,-3,-2,-10 };

//        int maxSoFar = Integer.MIN_VALUE, maxEndHere = 0;
        int maxSoFar = arr[0], maxEndHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndHere = maxEndHere + arr[i];
            if (maxSoFar < maxEndHere) {
                maxSoFar = maxEndHere;
            }
            if (maxEndHere < 0) {
                maxEndHere = 0;
            }
        }
        System.out.println(maxEndHere+ " "+maxSoFar);

        for (int i = 0; i < arr.length; i++) {
        maxEndHere = maxEndHere + arr[i];

        if (maxEndHere < 0) {
            maxEndHere = 0;
        }
        else if (maxSoFar < maxEndHere) {
            maxSoFar = maxEndHere;
        }

    }
        System.out.println("Maximum value of contiguous subArray  : "+maxSoFar);
}

    public static void main(String[] args) {
        int arr[]={-11,9,-5,-77,-2,55,-2,8,-3,40,-1};
        int maxSum = Integer.MIN_VALUE;
        int calValue = 0;
        for (int i=0;i<arr.length;i++){
            calValue = calValue + arr[i];
            if(calValue < 0){
                calValue = 0;
            }
            else  if (maxSum < calValue){
                maxSum = calValue;
            }
        }
        System.out.println("The maximum sum of contiguous subArray is : "+maxSum);
    }
}
