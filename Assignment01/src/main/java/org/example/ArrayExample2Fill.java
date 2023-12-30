package org.example;

import java.util.Arrays;

public class ArrayExample2Fill {
//    public static void main(String[] args) {
//        int[] nums= {2,3,4,5,6,7};
//        decompressRLElist(nums);
//    }
//    public static void decompressRLElist(int[] nums) {
//        int arrSize = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            arrSize += nums[i];
//        }
//
//        int[] result = new int[arrSize];
//
//        int startIdx = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
//            startIdx += nums[i];
//        }
//        System.out.println(Arrays.toString(result));
//    }


    public static void main(String[] args) {
        int a[]= {1,1,2,3,5,6};
        int sum= 0 ;
        for(int j=0;j<a.length;j+=2){
            sum= sum+a[j];
        }
        int[] res= new int[sum];
        int startIdx = 0;
        for (int i = 0; i < a.length; i += 2) {
            Arrays.fill(res, startIdx, startIdx + a[i], a[i + 1]);
            startIdx += a[i];
        }
        System.out.println(Arrays.toString(res));
    }
}

