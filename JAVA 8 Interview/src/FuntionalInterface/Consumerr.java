package FuntionalInterface;

import java.util.function.Consumer;

public class Consumerr  {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("HELLO");
    }

}


