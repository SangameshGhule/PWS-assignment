package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckSubSetOfArray {

    public static void main(String[] args) {
        int[] a= {4,6,3,2,3,8,7};

        char[] c = {'s','a','n','g','m','e','s','h'};
        System.out.println(c);


        int[] b= {4,3,6,8};

        Arrays.stream(a);
        IntStream distinct = Arrays.stream(a).distinct();
        System.out.println(Arrays.toString(distinct.toArray()));
        int count = 0;
        int count1 = 0;

        for(int i= 0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                    break;
                }
            }
            count1++;
        }
        if(count1 == a.length){
            System.out.println("Sub array not present in an given array");
        }
    }
}
