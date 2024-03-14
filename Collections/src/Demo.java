public class Demo implements Runnable {

    public void printNums() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "=> " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        printNums();
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        Thread t1 = new Thread(d);
        t1.setName("Thread-1");
        t1.start();

        Thread t2 = new Thread(d);
        t2.setName("Thread-2");
        t2.start();
    }
}