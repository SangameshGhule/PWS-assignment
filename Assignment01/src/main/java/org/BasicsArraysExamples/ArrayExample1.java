package org.BasicsArraysExamples;


import java.util.ArrayList;
import java.util.Arrays;

//Input: nums = [1,2,3,4]
//        Output: [2,4,4,4]
//        Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//        The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//        At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
public class ArrayExample1 {

    public static void main(String[] args) {
        int[] input = {2, 3, 10, 5}; // Replace this with your desired input array
        int[] decompressed = decompressRLElist(input);

        // Print the decompressed array elements
        for (int num : decompressed) {
            System.out.print(num + " ");
        }
    }

    public static int[] decompressRLElist(int[] a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i += 2) {
            for (int j = 0; j < a[i]; j++) {
                res.add(a[i + 1]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}


//    public static void main(String[] args) {
//
//        int a[]= {1,2,3,4,6,5};
//        ArrayList<Integer> res= new ArrayList<>();
//        for(int i=0;i<a.length-1;i+=2){
//            System.out.println(a[i]+" "+a[i+1]+"   ");
//            for(int j=0;j<a[i];j++){
//                res.add(a[i+1]);
//            }
//        }
//        System.out.println(res);
//    }

