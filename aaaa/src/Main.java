public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // n= 50  (50,45,40,---0)

        int n =50;
        int diff = 5;
        result( n, diff);
    }

    private static void result(int n, int diff) {
        if(n <0){
            return;
        }
        System.out.println(n);
        result(n-diff, diff);
    }
}