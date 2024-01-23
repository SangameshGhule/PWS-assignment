import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30,0,50,66};
        int n = a.length;
        int temp = 0;
//        for (int i = 0; i < n / 2; i++) {
//            int j = n - 1 - i;
//            temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//        }
        int i=0;
        int j= n - 1 - i;
        while(i<=j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}
