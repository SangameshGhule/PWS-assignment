package FuntionalInterface;

public class Predicate {

    public static void main(String[] args) {

        java.util.function.Predicate<String> predicate = s -> s.isEmpty();
        boolean result = predicate.test("San");  // Returns true
        System.out.println(result);
    }
}
