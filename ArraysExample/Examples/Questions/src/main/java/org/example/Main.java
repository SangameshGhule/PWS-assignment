package org.example;

public class Main {
    public static void main(String[] args) {
        String input = "aabcccccaaacc";
        String compressed = compressString(input);
        System.out.println(compressed); // Output: a2b1c5a3
    }

    private static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character group
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.toString();
    }
}
