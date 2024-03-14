public class BeforeJava8Thread {

    public static void main(String[] args) {

        //Before java 8
        Runnable rr = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread -1");
            }
        };
        new Thread(rr).start();

        //After java 8
        Runnable r = () -> System.out.println("Thread -1");
        new Thread(r).start();

        Runnable r1 = () -> {
            System.out.println("Thread- 2");
        };
        new Thread(r1).start();
        ;

        Runnable r2 = () -> {
            System.out.println("Thread- 3");
            System.out.println("Thread- 3.1");
        };
        new Thread(r2).start();
    }
}
