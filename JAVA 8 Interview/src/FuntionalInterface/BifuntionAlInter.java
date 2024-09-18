package FuntionalInterface;

import java.util.function.BiFunction;

public class BifuntionAlInter {

    public static void main(String[] args) {

        Integer apply = 0; // Initialize apply with a default value
        for (int i = 0; i < 10; i++) {
            BiFunction<Integer, Integer, Integer> bf = (a, b) -> a + b;
            apply = bf.apply(apply, i); // Use apply as one of the arguments
        }
        System.out.println(apply);
    }

}
