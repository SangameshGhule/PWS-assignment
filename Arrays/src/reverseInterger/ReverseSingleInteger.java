package reverseInterger;

public class ReverseSingleInteger {

    public static void main(String[] args) {
        int a = 78;
        int r = 0;
        while (a != 0) {
            r = r * 10 + a % 10;
            a /= 10;
        }
        System.out.println(r);
    }
}
