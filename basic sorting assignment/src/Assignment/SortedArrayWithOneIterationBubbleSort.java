package Assignment;

public class SortedArrayWithOneIterationBubbleSort {

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 10, 7, 12, 15};
        int n = a.length;
        int temp = 0;
        printArray(a);

        System.out.println();

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
                break;
            }
            count++;
        }
        System.out.println(count);
        printArray(a);
    }

    public static void printArray(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}
