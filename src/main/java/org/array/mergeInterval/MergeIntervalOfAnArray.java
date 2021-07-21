package org.array.mergeInterval;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervalOfAnArray {
    public static void main(String[] args) {
        int[][] intervals= {{1,4},{2,6},{9,11},{8,14}};

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> merge = new LinkedList<>();

        for (int[] interval : intervals)
        {
         if (merge.isEmpty() || merge.getLast()[1] < interval[0] )
         {
             merge.add(interval);
         }
         else
         {
             merge.getLast()[1] = Math.max(merge.getLast()[1],interval[1]);
         }
        }

        System.out.println( merge.toArray(new int[merge.size()][]));

        intervals = merge.toArray(new int[merge.size()][]);
        for (int i=0; i<intervals.length;i++){
            System.out.print(Arrays.toString(intervals[i]));
        }

    }
}
