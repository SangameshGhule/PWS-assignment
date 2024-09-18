public class Example3 {
    public static void main(String[] args) {
        int start = 01; // starting number
        int end = 100; // ending number
        for (int i = start; i <= 100; i++) {
            String formattedNumber = String.format("%02d", i);
            System.out.println(formattedNumber);
        }
    }
}
