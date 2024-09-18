package FuntionalInterface;

public class Runnable {

    public static void main(String[] args) {

        java.lang.Runnable runnable = ()-> System.out.println("Hello world");
        runnable.run();
    }
}
