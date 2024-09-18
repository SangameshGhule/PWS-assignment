package Assignment;

public class SortAndRemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {4, 1, -1, 6, 7, 5, 4, 6, 5};
        int n = a.length;

        // Sort the array using insertion sort
        insertionSort(a);

        // Remove duplicates
        n = removeDuplicates(a, n);

        // Print the sorted array without duplicates
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    // Remove Duplicates
    public static int removeDuplicates(int[] a, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int newSize = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                a[newSize] = a[i];
                newSize++;
            }
        }

        return newSize;
    }
}
