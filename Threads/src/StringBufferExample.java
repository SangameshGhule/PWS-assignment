public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        // Create thread1 to append "A" strings
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                stringBuffer.append("A");
            }
        });

        // Create thread2 to append "B" strings
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                stringBuffer.append("B");
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final string length
        System.out.println("Final String Length: " + stringBuffer.length());
    }
}
