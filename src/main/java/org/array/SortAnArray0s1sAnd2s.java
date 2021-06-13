package org.array;
//without using any sorting algorithm
//time complex city O(n)
import java.util.Arrays;

public class SortAnArray0s1sAnd2s {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0, 0, 1, 2, 1, 2, 0};
        sortElement(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortElement(int[] arr, int n) {
        int count1 = 0, count2 = 0, count3 = 0;

        for (int i = 0; i <= n; i++) {
//            if (arr[i] == 0) {
//                count1++;
//            }
//            else if (arr[i] == 1) {
//                count2++;
//
//            }
//          else if (arr[i] == 2) {
//                count3++;
//
//            }


//            using switch case
            switch (arr[i]) {
                case 0:
                    count1++;
                    break;
                case 1:
                    count2++;
                    break;
                case 2:
                    count3++;
                    break;

            }
        }

        int i = 0;
//using while loop
        while (count1 != 0) {
            arr[i] = 0;
            count1--;
            i++;

        }
        while (count2 != 0) {
            arr[i] = 1;
            count2--;
            i++;

        }
        while (count3 != 0) {
            arr[i] = 2;
            count3--;
            i++;

        }

//        using for loop
//        for (;count1 !=0 ;i++){
//            arr[i]=0;
//            count1--;
//        }
//        for (;count2 !=0 ;i++){
//            arr[i]=1;
//            count2--;
//        }
//        for (;count3 !=0 ;i++){
//            arr[i]=2;
//            count3--;
//        }


    }
}

