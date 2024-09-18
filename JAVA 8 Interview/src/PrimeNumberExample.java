public class PrimeNumberExample {

    public static void main(String[] args) {
        int number = 5; // Example number to check

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            System.out.println(Math.sqrt(number));
//            if (number % i == 0) {
//                return false;
//            }
//        }
//
//
        for (int i = 2; i <= number; i++) {
            System.out.println(Math.sqrt(number));
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}