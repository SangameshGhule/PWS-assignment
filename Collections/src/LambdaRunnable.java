public class LambdaRunnable {

    public static void main(String[] args) {

        Runnable runnable = ()->{
            Thread.currentThread().setName("Thread-1");
            System.out.println("Current threadName : " +Thread.currentThread().getName());
        };

        Thread t= new Thread(runnable);
        t.start();
    }
}
