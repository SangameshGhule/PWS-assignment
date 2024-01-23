package ArrayAssignment;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m
//and n, representing the number of elements in nums1 and nums2 respectively.

import java.util.Arrays;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {4, 2, 10, 3, 6, 8};
        int[] b = {5, 8, 9, 2, 6, 10};
        int[] res = new int[a.length + b.length];
        int temp = 0;

        int index = 0;
        for (int element : a) {
            res[index++] = element;
        }

        for (int element : b) {
            res[index++] = element;
        }

        System.out.println(Arrays.toString(res));

        for (int i = 0; i < res.length; i++) {
            for (int j = i+1; j < res.length; j++) {
                if (res[i] < res[j]) {
                    temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}


//    int temp;
//
//        for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a.length; j++) {
//        if (a[i] > a[j]) {
//        temp = a[j];
//        a[j] = a[i];
//        a[i] = temp;
//        }
//        }
//        }
//
//        for (int i = 0; i < b.length; i++) {
//        for (int j = 0; j < b.length; j++) {
//        if (b[i] > b[j]) {
//        temp = b[j];
//        b[j] = b[i];
//        b[i] = temp;
//        }
//        }
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
