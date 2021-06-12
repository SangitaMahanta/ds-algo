package org.minMax;
//Its only applicable for if the elements are -ve and +ve

public class MaxMinDemo {
    public static void main(String[] args) {
//        int arr[] = {11, 55, 7, 9, 34, 22};
//        int arr[] = {11, 55, 7, 9, 34, 22,-123,345};
        int arr[] = {-11,-55, -7, -9, -34,-22,-123,-345};

        int left = 0, right = arr.length - 1;
        int min = arr[0], max = arr[0];
//
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            ++count;
            if (arr[left] < arr[right]) {
                if (min > arr[left]) {
                    min = arr[left];
                } else if (max < arr[right]) {
                    max = arr[right];
                }
                left++;
                right--;
            } else if (arr[left] > arr[right]) {
                if (max < arr[left]) {
                    max = arr[left];
                } else if (min > arr[right]) {
                    min = arr[right];
                }

                left++;
                right--;


            }
            if (left >= right)
                break;
        }

        System.out.println("No of comparision = " + count);
        System.out.println("Minimum No. is = " + min);
        System.out.println("Maximum No. is = "  + max);
    }
}

