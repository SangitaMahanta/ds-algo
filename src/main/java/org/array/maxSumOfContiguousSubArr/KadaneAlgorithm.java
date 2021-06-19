package org.array.maxSumOfContiguousSubArr;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int arr[]={1,22,-3,4,-5};
        int maxSoFar=0;
        int maxEnd=0;

        for (int i=0;i<arr.length;i++){
            maxEnd = maxEnd+arr[i];
            if (maxSoFar<maxEnd){
                maxSoFar = maxEnd;
            }
            if (maxEnd<0){
                maxEnd=0;
            }
        }
        System.out.println(maxSoFar);
    }
}
