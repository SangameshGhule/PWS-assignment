import java.util.Arrays;

public class MergeTWoSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        int[] res = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            res[i] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            res[j+nums1.length] = nums2[j];
        }

        int temp = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if (res[i] > res[j]) {
                    temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        double ff;
        if (res.length % 2 == 0) {
            int r = res.length / 2;
            int sum = res[r] + res[r - 1];
            System.out.println(sum);
            ff = (double) sum / 2;
        } else {
            ff = res[res.length / 2];
        }
        System.out.println(ff);
    }
}


/*
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        double ff =0;
         for(int i=0;i<nums1.length;i++){
            res[i]= nums1[i];
        }
        int k=0;
        for(int j= nums1.length;j<res.length;j++){
            res[j]= nums2[k];
            k++;
        }
        int temp=0;
        for(int i=0;i<res.length;i++){
            for(int j=i+1;j<res.length;j++){
                if(res[i]>res[j]){
                    temp = res[i];
                    res[i] =res[j];
                    res[j] = temp;
                }
            }
        }
        if(res.length%2==0){
            int r = res.length/2;
            int sum = res[r]+res[r-1];
            ff = (double) sum /2;
        }else {
            ff = res[res.length/2];
        }
        return ff;
    }
}
 */