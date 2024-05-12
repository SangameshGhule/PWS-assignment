import java.util.Arrays;
import java.util.OptionalInt;

public class MaxElemet {

    public static void main(String[] args) {

        int[] a ={4,3,11,6,9,12,1,10};

        //MAX
//        int max1 = Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(max1 < a[i]){
//                max1= a[i];
//            }
//        }
//        System.out.println(max1);
//
//        //MIN
//        int minq = Integer.MAX_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(minq > a[i]){
//                minq = a[i];
//            }
//        }
//        System.out.println(minq);

//        int[] a ={4,3,11,6,9,12,1,10};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
