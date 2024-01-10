package pattern.AssignmnetQuestions;

public class Example19 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            System.out.print(i);
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(i+ " ");
            }

            System.out.println();
        }
    }
}
