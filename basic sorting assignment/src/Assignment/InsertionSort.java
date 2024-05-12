package Assignment;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 9, 1, -8, 9};
        int n = a.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                } else break;
            }
        }
        printArray(a);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a) {
        int[] temp1 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp1[i] = a[i];
        }
        System.out.println(Arrays.toString(temp1));
        removeDuplicate(temp1);
    }

    private static void removeDuplicate(int[] temp1) {
        int[] res = new int[temp1.length];
        int j = 0;
        for (int i = 0; i < temp1.length - 1; i++) {
            if (temp1[i] != temp1[i + 1]) {
                res[j++] = temp1[i];
            }
        }

//        for(int i=0;i<j;i++){
//            System.out.println(res[i]);
//        }
    }
}
