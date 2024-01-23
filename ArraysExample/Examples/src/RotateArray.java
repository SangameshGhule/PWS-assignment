import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        int[] a = {22,10,55,32,11,23};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        reverseArray(a,0,a.length-num-1);
        reverseArray(a,a.length-num,a.length-1);
        reverseArray(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
    }

    private static void reverseArray(int[] a, int i, int j) {
        int temp=0;
        while(i<=j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }


//    public static void main(String[] args) {
//        int[] a = {22,33,11,55,66,44,88};
//        int temp=0;
//
//        Scanner sc= new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num>a.length){
//            num = num-a.length;
//        }
//
//        for(int i=0;i<=a.length-num-1 ;i++){
//            if(i<=(a.length-num-1)/2) {
//                int j = a.length - num - 1 - i;
//                temp = a[j];
//                a[j] = a[i];
//                a[i] = temp;
//            }
//            System.out.print(a[i] + " ");
//        }
//
//        System.out.println();
//
//        int j = a.length-1;
//        for(int i=a.length-num;i<a.length;i++) {
//            if(i<=num) {
//                temp = a[i];
//                a[i] = a[j];
//                a[j] = temp;
//                j--;
//            }
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
}
