import java.util.Arrays;

//Given an array of strings. Check whether they are anagram or not.
public class Example9 {

    public static void main(String[] args) {
        String a = "car";
        String b = "arc";

        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean res = true;

        for (int i = 0; i < a.length(); i++) {
            if (a1[i] != a2[i]) {
                res = false;
            }
        }
        System.out.println(res);
        System.out.println(a1);
        System.out.println(a2);

    }
}
