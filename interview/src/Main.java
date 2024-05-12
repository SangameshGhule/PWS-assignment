public class Main {
    // Example 1: Passing a primitive value as a method parameter
    public static void modifyPrimitive(Integer num) {
        num = num * 2;
        System.out.println("Inside modifyPrimitive: " + num);
    }

    public static void main(String[] args) {
        int originalNum = 10;
        Integer i = Integer.valueOf(10);
        System.out.println("Original value before modification: " + originalNum); // Output: Original value before modification: 10

        modifyPrimitive(i);
        System.out.println("Original value after modification: " + originalNum); // Output: Original value after modification: 10
    }
}
