//Input a string of even length and reverse the second half of the string.

public class Example4 {

    public static void main(String[] args) {
        String a = "sangmesh";
        String b = "";

        b = a.substring(0, a.length() / 2);
        System.out.println(b);

        for (int i = a.length() - 1; i >= a.length() / 2; i--) {
            b += a.charAt(i);
        }
        System.out.println(b);

        String s = "mayank";
        String c = "";

        c = s.substring(0, s.length() / 2);
        StringBuffer d = new StringBuffer(s.substring(s.length() / 2));
        d.reverse();
        System.out.println(c + d);
    }
}
