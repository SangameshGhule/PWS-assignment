import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OrderStringGenerator {

    // Method to generate the order strings using Java 8 streams
    public static List<String> generateOrderStrings(String baseString, int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> baseString + "_" + String.format("%02d", i)).collect(Collectors.toList());
    }

    // Method to generate nested order strings using Java 8 streams
    public static List<String> generateNestedOrderStrings(List<String> baseStrings, int innerNum) {
        return baseStrings.stream()
                .flatMap(base -> generateOrderStrings(base, innerNum).stream())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example usage
        String baseString = "ORDER_SKU001";

        // Generate order strings for num = 2
        List<String> orderStrings = generateOrderStrings(baseString, 2);
        orderStrings.forEach(System.out::println);

        // Generate nested order strings for the generated order strings with innerNum = 2
        List<String> nestedOrderStrings = generateNestedOrderStrings(orderStrings, 2);
        nestedOrderStrings.forEach(System.out::println);
    }
}





//import java.util.ArrayList;
//import java.util.List;
//
//public class OrderStringGenerator {
//
//    // Method to generate the order strings
//    public static List<String> generateOrderStrings(String baseString, int num) {
//        List<String> result = new ArrayList<>();
//
//        for (int i = 1; i <= num; i++) {
//            result.add(baseString + "_" + String.format("%02d", i));
//        }
//
//        return result;
//    }
//
//    // Method to generate nested order strings
//    public static List<String> generateNestedOrderStrings(List<String> baseString, int innerNum) {
//
//        List<String> result = new ArrayList<>();
//
//        // Generate nested strings
//        for (String outer : baseString) {
//            List<String> nestedStrings = generateOrderStrings(outer, innerNum);
//            result.addAll(nestedStrings);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        String baseString = "ORDER_SKU001";
//
//        // Generate order strings for num = 2
//        List<String> orderStrings = generateOrderStrings(baseString, 2);
//        for (String s : orderStrings) {
//            System.out.println(s);
//        }
//
//        // Generate nested order strings for outerNum = 2 and innerNum = 2
//        List<String> nestedOrderStrings = generateNestedOrderStrings(orderStrings, 2);
//        for (String s : nestedOrderStrings) {
//            System.out.println(s);
//        }
//    }
//}


