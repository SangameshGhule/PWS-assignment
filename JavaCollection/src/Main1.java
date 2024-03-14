import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> iin = new ArrayList<>(15);  // Initialize the ArrayList

        System.out.println("total numbers:");
        int a= sc.nextInt();

        System.out.println("Enter element:");
        for (int i = 0; i < a; i++) {
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                iin.add(value);
            }
        }

        if (!iin.isEmpty()) {
            Integer sum = iin.stream().distinct().reduce(Integer::sum).orElse(0);
            System.out.println("Sum of distinct elements: " + sum);
        } else {
            System.out.println("List is empty");
        }
    }
}
