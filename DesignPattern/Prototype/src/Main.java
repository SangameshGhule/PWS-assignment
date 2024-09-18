import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "cara"; //a
        String b = "acra"; //c
        getResult(a,b);  // using inbuilt method
        result1(a,b);    // using two for-loop method
    }

    public static void result1(String a, String b) {
        getResult(Arrays.toString(sortt(a)), Arrays.toString(sortt(b)));
    }

    private static char[] sortt(String a) {
        char[] q = a.toCharArray();
        char temp;
        for(int i=0;i<q.length;i++){
            for(int j=i+1;j<a.length();j++){
                if(q[i]>q[j]){
                    temp = q[i];
                    q[i] = q[j];
                    q[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(q));
        return q;
    }


    private static void getResult(String a, String b) {
        char[] c1 = a.toLowerCase().toCharArray();
        char[] c2 = b.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean res = true;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                res = false;
                break;
            }
        }
        if (res) System.out.println("Equal");
        else System.out.println("Not equal");
    }
}