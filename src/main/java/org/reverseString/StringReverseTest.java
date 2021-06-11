package org.reverseString;

import java.util.Arrays;

public class StringReverseTest {
    public static void main(String[] args) {
        String str = "Sangita";
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
        int left = 0, right = ch.length - 1;
        for (int i = 0; i < ch.length - 1; i++) {
            swap(ch, left, right);
            left++;
            right--;
            if (left >= right) break;
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(String.copyValueOf(ch));
    }

    private static void swap(char[] ch, int left, int right) {
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
    }


}
