package Assignment;

import java.util.Arrays;

public class SortArrayDecreasingOrderBubbleSort {

    public static void main(String[] args) {

        int[] a = {3, 2, 5, 1, 8, 3, 2, 5, 90};
        int n = a.length;
        int temp = 0;
        printArray(a);

        System.out.println();
// this is by using no of iteration of totalLength-1,
//        for (int k = 0; k < n - 1; k++) {
//            for (int i = 0; i < n - 1; i++) {  // 0,1,2,3,4
//                if (a[i] < a[i + 1]) {
//                    temp = a[i];
//                    a[i] = a[i + 1];
//                    a[i + 1] = temp;
//                }
//            }
//        }
//        printArray(a);

//This is optimized way of bubble sort of decreasing order with checking each iteration it is sorting or not
        int count = 0;
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (a[i] < a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = false;
                }
                count++;
            }
            if (flag) break;
        }
        System.out.println(count);
        printArray(a);
    }


    private static void printArray(int[] a) {
        for (int ele : a) {
            System.out.print(ele + ", ");
        }
    }
}
