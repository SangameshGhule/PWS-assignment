import java.util.Arrays;

public class SortArray0And1And2Method1 {
    public static void main(String[] args) {
        int[] a= {2,0,1,1,2,2,1,1,1,0,2};
        int noz=0;
        int noo=0;

        for (int k : a) {
            if (k == 0) noz++;
            else if (k == 1) noo++;
        }
        for(int i=0;i<a.length;i++){
            if(i<noz) a[i]=0;
            else if(i<=noo+1) a[i]=1;
            else a[i]=2;
        }
        System.out.println(Arrays.toString(a));
    }
}
