package org.array.duplicateElement;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateNoInArray {
    public static void m1(String[] args) {
        int[] arr = {11,2,44,33,2,19,8};
        Arrays.sort(arr);
        for (int i = 1 ; i < arr.length; i++){
            if (arr[i] == arr[i-1]){
                //finding the duplicate element
                System.out.println(arr[i]);
                break;
        }
    }
    }

    public static void main(String[] args) {
        int[] arr = {11,2,44,33,2,19,8};
        Arrays.sort(arr);

        Set<Integer> st = new TreeSet<>();

        for (int num : arr) {
            if (st.contains(num)){
                System.out.println(num);
                break;
        }
            else
                st.add(num);
        }
    }
}
