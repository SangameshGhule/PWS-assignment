package FuntionalInterface;

public class Supplier {

    public static void main(String[] args) {

        java.util.function.Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

    }
}
