package org.array.maxSumOfContiguousSubArr;

public class MinimumNoOfJumpsToReachEnd {
        /*public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int ans = 0;
//        int jump=0;
        boolean flag = false;
        if (arr[0] == 0)
            return;
        else if (arr[0] >= arr.length) {
            System.out.println("Min jumps = 1");
            System.exit(0);
        }
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            if (arr[i] < arr.length){
//                i = arr[i];
//                ans++;
//            }
//        }
        int i =0,j=0;
        int temp = arr.length;
        while (i < arr.length){
            if (arr[i] == 0) {
                System.out.println("Can not be found");
                return;
            }
            flag = true;
            if (arr[i] < temp){
                i = i + arr[i];
                ans++;
                temp--;
            }
            if (i+ arr[i] >= arr.length){
                break;
            }
//            i++;
        }
        if (flag==true)
            ans++;
        System.out.println(ans);
    }*/

    /*static int minJumps(int arr[], int l, int h) {
        if (h == l)
            return 0;
        if (arr[l] == 0)
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h
                && i <= l + arr[l];
             i++) {
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }
    // Driver code
    public static void main(String args[]) {
        int arr[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
        int n = arr.length;
        System.out.print("Minimum number of jumps to reach end is "
                + minJumps(arr, 0, n - 1));
    }*/
//    1.In this way, make a jumps[] array from left to
//    right such that jumps[i] indicate the minimum number of jumps needed to reach arr[i] from arr[0].
//    2. To fill the jumps array run a nested loop inner loop counter is j and outer loop count is i.
//    3. Outer loop from 1 to n-1 and inner loop from 0 to n-1.
//   4. if i is less than j + arr[j] then set jumps[i] to minimum of jumps[i] and jumps[j] + 1. initially set jump[i]
//   to INT MAX
//    Finally, return jumps[n-1].
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 1, 0, 9 };
        int n = arr.length;
        int jumps[] = new int[n];
        // result
        int i, j;

        // if first element is 0,
        if (n == 0 || arr[0] == 0)
            return;
        // end cannot be reached

        jumps[0] = 0;

        // Find the minimum number of jumps to reach arr[i]
        // from arr[0], and assign this value to jumps[i]
        for (i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (i <= j + arr[j]
                        && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        System.out.println(jumps[n - 1]);
    }
}
