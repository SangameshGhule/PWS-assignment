package org.example;

import java.util.Arrays;

public class reverseWordFromString {

    public static void main(String[] args) {

        String a ="I am Good";
        String[] arr = a.split(" ");
        StringBuilder res = reverseString(arr);
        System.out.println(res);
    }

    private static StringBuilder reverseString(String[] arr) {

        StringBuilder stringBuilder= new StringBuilder();

        for(String word : arr){
            String rev = new StringBuilder(word).reverse().toString();
            stringBuilder.append(rev).append(" ");
        }
        return stringBuilder;
    }
}
