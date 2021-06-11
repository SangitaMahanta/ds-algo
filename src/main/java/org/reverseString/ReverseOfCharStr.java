package org.reverseString;

import java.util.Arrays;
//        Declare a string as char array
//        Find out the length of char array
//        Then Swap the position of array element within a loop

public class ReverseOfCharStr {
    public static void main(String[] args) {
       char ch[]={'s','a','n','g','i','t','a'};
       int n=ch.length-1;
       for (int i=0;i<n;i++){
           char temp=ch[i];
           ch[i]=ch[n];
           ch[n]=temp;
           n--;
       }
        System.out.println("The reverse string is :"+ Arrays.toString(ch));
    }
}
