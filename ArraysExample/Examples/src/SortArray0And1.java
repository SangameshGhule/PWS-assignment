import java.util.Arrays;

public class SortArray0And1 {

    public static void main(String[] args) {
        int[] a= {0,1,1,1,0,1,1,1,0,0};
        int noz=0;

        for (int j : a) {
            if (j == 0) noz++;
        }
        for(int i=0;i<a.length;i++){
            if(i<noz) a[i]=0;
            else a[i]=1;
        }
        System.out.println(Arrays.toString(a));

    }
}
