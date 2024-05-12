package maxminarray;

import java.util.Arrays;

public class SecondLargestSecondSmallest {

    public static void main(String[] args) {

        int[] arr = {1,1,3,4,5,6,6};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i]!= max) {
                secondMax = arr[i];
            }

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i]!= min) {
                secondMin = arr[i];
            }
        }

        int[] res = {secondMax, secondMin};
        System.out.println(Arrays.toString(res));
    }
}
