public class StopThread extends Thread {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); // Simulate some work being done
            } catch (InterruptedException e) {
                // Thread interrupted while sleeping
                System.out.println("Thread was interrupted while sleeping.");
                // Re-interrupt the thread to maintain interrupted status
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread is stopping...");
    }

    public static void main(String[] args) {
        StopThread thread = new StopThread();
        thread.start();

        // Let the thread run for a while
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread
        thread.interrupt();
    }
}
