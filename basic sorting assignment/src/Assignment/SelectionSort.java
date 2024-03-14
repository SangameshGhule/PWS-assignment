package Assignment;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3, 2, 5, 9, -8};
        int n = a.length;
        printArray(a);
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minind = 0;
            for (int j = i; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minind = j;
                }
            }
            int temp = a[i];
            a[i] = a[minind];
            a[minind] = temp;
        }
        printArray(a);
    }

    private static void printArray(int[] a) {
        for (int ele : a) {
            System.out.print(ele + ", ");
        }
    }
}
