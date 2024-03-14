public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] a = {3, 2, 5, 6, 4, 3, 8, 6, 9};
        int target = 8;
        int c = 0, b = 0;
        int j = 1;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[j] == target) {
                c = a[i];
                b = a[j];
                System.out.println(a[i] + "  " + a[j]);
                j++;
            }
        }
    }
}


// for(int i=0;i<a.length-1;i++){
//        for(int j=i+1;j<a.length-1;j++){
//        if(a[i]+a[j]==target){
//        c=a[i];
//        b=a[j];
//        System.out.println(a[i]+"  "+a[j]);
//        }
//        }
//        }