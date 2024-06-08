package duplicateunique;

import java.util.Arrays;

public class PrintDuplicateWithoutSet {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 2, 6, 8, 4, 6, 9,2};
        int[] b = new int[a.length];
        boolean duplicate;
        int count=0;
        int g=0;

        // Loop through each element in the array
        for (int i = 0; i < a.length; i++) {
            duplicate = false;
            // Compare the current element with every other element in the array
            for (int j = i + 1; j < a.length; j++) {
                // If a duplicate is found
                if (a[i] == a[j]) {
                    System.out.println("Duplicate: " + a[j]);
                    duplicate = true;
                    count++;
                    break; // No need to continue checking for this element
                }
            }
            // If the element is not a duplicate, print it as a non-duplicate
            if (!duplicate) {
                b[g++]= a[i];
                System.out.println("Non-Duplicate: " + a[i]);
            }
        }

        System.out.println("Duplicates removed: " + Arrays.toString(b));

        int[] res = new int[a.length-count];
        System.arraycopy(b, 0, res, 0, res.length);
        System.out.println("Duplicates removed: " + Arrays.toString(res));
    }
}
