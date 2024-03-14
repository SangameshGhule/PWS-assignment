import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i=0;i<sb.length();i++){
            char ch= sb.charAt(i);
            System.out.print((int)ch+ " ");
        }
    }
}
