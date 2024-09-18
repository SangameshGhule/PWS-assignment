package org.example;

public class CountNumberOfChar {

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        StringBuilder stringBuilder= new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i-1)){
                count++;
            } else {
                stringBuilder.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }
        System.out.println(stringBuilder);
    }
}
