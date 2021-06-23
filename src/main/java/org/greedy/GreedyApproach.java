package org.greedy;
//QUESTION:
//find the minimum number of coins that can be paid to customer if denominations are given :
//total sum is 90
//denominations:{50 30 10}
public class GreedyApproach {
    public static void main(String[] args) {
        int coins[] = {1,10,20,30,60,70};
        int sum = 90;
        System.out.println(greedySol(coins,sum));
    }

    private static int greedySol(int[] arr, int sum) {
        int l = arr.length;
        int result = 0;
        for (int i = 0;i<l;i++){
            if(sum >= arr[i]){
                sum-=arr[i];
                result++;
            }
        }
        return result;
    }
}
