package org.example;

//Input: nums = [1,3,5,4,7]
//        Output: 3
//        Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
//        Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
//        4.

public class ArraySequence {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxCount = 1;
        int count = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1; // Reset the count for a new sequence
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {10,2,20,30,3,40,50};
        int result = findLengthOfLCIS(nums);
        System.out.println("Length of the longest continuous increasing subsequence: " + result);
    }


//    public static void main(String[] args) {
//        int[] a = {10,2,20,30,3,40,50};
//        int count = 1;
//        int maxCount = 1;
//
//        for (int i = 0; i < a.length-1; i++) {
//            if(a[i] < a[i+1]) {
//                count++;
//                maxCount = Math.max(maxCount, count);
//            }
//        }
//        System.out.println(maxCount);
//    }
}
