package AllZerosRightOrLeft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AllZerosRight {

    public static void main(String[] args) {

        int[] a = {4, 3, 2, 0, 2, 0, 3, 0, 0, 9};
        int[] r = new int[a.length];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            int k = a[i];
            if (k != 0) {
                r[j] = k;
                j++;
            }
        }
        System.out.println(Arrays.toString(r));
    }
}

