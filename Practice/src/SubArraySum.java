public class SubArraySum {

    public static void main(String[] args) {
        int a[]= {1,4,45,6,0,19};
        int x =51;
        int n =6;

        int i=0;
        int j=0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        while(j<n){
            sum = sum+a[j];
            while(sum>x){
                ans= Math.min(ans,j);
                sum= sum-a[i];
                i++;
            }
            j++;
        }
        System.out.println(ans);
    }
}
