
//Given a sorted array of n elements and a target ‘x’. Find the last occurrence of ‘x’ in the array. If ‘x’ does
//not exist return -1.
//Input 1: arr[] = {1,2,3,3,4,4,4,5} , x = 4

public class Example02 {

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 3, 4, 4, 9,55,66,66,66};
        int[] a = {1, 2, 3, 5, 8, 8, 9};
        int target = 8;
        int low = 0;
        int high = a.length - 1;
        int earlyAccessValue = 0;
        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                for (int i = mid - 1; i >= 0; i--) {
                    if (a[mid] == a[i]) {
                        earlyAccessValue = i;
                        flag = true;
                    } else if (mid > i) {
                        earlyAccessValue = mid;
                        flag = true;
                        break;
                    }
                    mid--;
                }
            }

            if (!flag) {
                if (a[mid] <= target) {
                    low = mid + 1;
                } else if (a[mid] >= target) {
                    high = mid - 1;
                } else if (a[mid] == target) {
                    System.out.println(mid + "   :");
                    break;
                }
            } else {
                System.out.println(earlyAccessValue);
                break;
            }
        }
        if (!flag) System.out.println(target + " is Not found");
    }
}
