import java.util.Arrays;
import java.util.stream.IntStream;

public class MEdiumNumOrAvrg {

//    Input: N = 4
//    arr[] = 56 67 30 79
//    Output: 61

    public static void main(String[] args) {
        int n=4;
        int a[]= {56,67,30,79,44};
        int temp =0;

//        int[] array = Arrays.stream(a).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        int res=0;
        if(a.length%2==0){
            int r = a.length/2;
            int sum = a[r]+a[r-1];
            res = sum/2;
        }else {
            res = a[a.length/2];
        }
        System.out.println(res);
    }
}
