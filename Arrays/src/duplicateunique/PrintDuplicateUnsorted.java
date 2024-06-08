package duplicateunique;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateUnsorted {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 2, 6, 8, 4, 6, 9, 5};
        boolean duplicate = false;

        Set<Integer> integers = new HashSet<>();
        for (int j : a) {
            if (integers.contains(j)) {
                System.out.println(j);
                duplicate = true;
            } else {
                integers.add(j);
            }
        }
        int res = duplicate ? 0 : -1;
        System.out.println(res);
        System.out.println(integers);

    }
}

