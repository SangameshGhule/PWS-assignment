package Assignment1;

public class GreatestCommonDivision {

    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 18;

        int res = 0;
        while (num1 != num2) {
            if (num1 > num2) {
                res = num1 -= num2;
            } else {
                res = num2 -= num1;
            }
        }
        System.out.println(res);

        //another way
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD :" + gcd);
    }
}
