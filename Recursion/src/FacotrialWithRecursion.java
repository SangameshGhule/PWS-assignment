import java.util.Scanner;

public class FacotrialWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));
    }

    private static int factorial(int a) {
        if (a == 1) return 1;  //base to break method calling itself
        return a * factorial(a - 1);  //calling same method
    }

//    private static int factorial(int a) {
//        int res=1;
//        if (a != 1) {
//            res= a * factorial(a - 1);  //calling same method
//        }
//        return res;
//    }
}
