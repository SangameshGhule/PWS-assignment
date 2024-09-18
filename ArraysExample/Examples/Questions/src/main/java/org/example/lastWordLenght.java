package org.example;

import java.util.Arrays;

public class lastWordLenght {

    public static void main(String[] args) {
        String input = "Hello world this is Java";

        Object[] s = Arrays.stream(input.split(" ")).toArray();

        for(int j= s.length-1;j>=0;j--){
            System.out.println(s[j].toString().length());
            break;
        }
    }
}
