package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeIntoSingleArray {

    public static void main(String[] args) {


        int[] i = {4, 2, 6, 1};
        int[] f = {5, 3, 4, 2};

        int[] res = new int[i.length + f.length];

        System.arraycopy(i,0,res,0,i.length);
        System.arraycopy(f,0,res,i.length,f.length);

        System.out.println(Arrays.toString(Arrays.stream(res).sorted().distinct().toArray()));
    }
}
