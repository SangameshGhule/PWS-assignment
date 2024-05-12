public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        // Create thread1 to append "A" strings
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                stringBuilder.append("A");
            }
        });

        // Create thread2 to append "B" strings
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                stringBuilder.append("B");
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
        System.out.println("Final String Length: " + stringBuilder.length());
        //20000
        //19679
        //13180
        //it will throw Exception in thread "Thread-1" java.lang.ArrayIndexOutOfBoundsException:
        //arraycopy: last destination index 71 out of bounds for byte[70]
    }
}
