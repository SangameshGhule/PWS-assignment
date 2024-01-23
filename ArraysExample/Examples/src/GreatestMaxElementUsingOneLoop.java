import java.util.Arrays;

public class GreatestMaxElementUsingOneLoop {

    public static void main(String[] args) {
        int[] a = {12,8,41,37,60,2,49,16,28,21};

        int[] c = new int[a.length];
        c[a.length-1]=-1;
        int max = a[a.length-1];

        for(int i=a.length-2;i>=0;i--){
            c[i]= max;
            max= Math.max(a[i],max);
        }
        System.out.println(Arrays.toString(c));
    }
}
