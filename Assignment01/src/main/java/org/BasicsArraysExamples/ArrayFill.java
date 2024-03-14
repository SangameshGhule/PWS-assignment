package org.BasicsArraysExamples;

import java.util.Arrays;

public class ArrayFill {

    public static void main(String[] args) {

        int[] a= new int[5];
        int b = 5;

         Arrays.fill(a,2,3,5);
         System.out.println(Arrays.toString(Arrays.stream(a).toArray()));
    }
}
