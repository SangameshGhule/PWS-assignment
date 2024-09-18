import java.util.function.*;

public class FIE {

    public static void main(String[] args) {
        // Function - accepts a string and returns its length
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println("Length of 'Hello': " + stringLengthFunction.apply("Hello"));

        // BiFunction - concatenates two strings
        BiFunction<String, String, String> stringConcatenatorBiFunction = (s1, s2) -> s1 + s2;
        System.out.println("Concatenated strings: " + stringConcatenatorBiFunction.apply("Hello, ", "world!"));

        // Consumer - accepts a string and prints it
        Consumer<String> stringPrinterConsumer = s -> System.out.println("Printing: " + s);
        stringPrinterConsumer.accept("Hello, world!");

        // Supplier - generates a random number
        Supplier<Double> randomDoubleSupplier = () -> Math.random();
        System.out.println("Random number: " + randomDoubleSupplier.get());

        // Predicate - checks if a string is empty
        Predicate<String> stringEmptyPredicate = s -> s.isEmpty();
        System.out.println("Is '': " + stringEmptyPredicate.test(""));
        System.out.println("Is 'Hello': " + stringEmptyPredicate.test("Hello"));

    }
}
