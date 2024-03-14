public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {11, 2, 3, 4, 8, 20, 18};
        int target = 5;
        printArrays(a);
        System.out.println();

        int n = a.length;
        int low = 0;
        int high = n - 1;
        boolean flag = false;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < target) {
                low = mid + 1;
            } else if (a[mid] > target) {
                high = mid - 1;
            } else {
                flag = true;
                index = mid;
                break;
            }
        }
        if (flag) System.out.println("element found in index " + index);
        else System.out.println("element not found " + index);
    }

    public static void printArrays(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}
