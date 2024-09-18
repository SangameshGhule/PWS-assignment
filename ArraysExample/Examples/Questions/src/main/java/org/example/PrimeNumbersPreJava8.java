package org.example;

public class PrimeNumbersPreJava8 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 10, 13, 17, 19, 21, 23, 29,7};

        System.out.println("Prime numbers in the array:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        System.out.println(Math.sqrt(number));
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("i " +i );
                return false;
            }
        }
        return true;
    }
}
