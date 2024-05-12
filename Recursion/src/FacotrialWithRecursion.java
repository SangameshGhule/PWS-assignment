import java.util.Scanner;

public class FacotrialWithRecursion {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(factorial(a));
    }

    private static int factorial(int a) {
        if (a == 1) return 1;  //base to break method calling itself
        return a * factorial(a - 1);  //calling same method
    }

}
