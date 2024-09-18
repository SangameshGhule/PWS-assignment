package org.example;

public class CountVowelsAndConsonts {

    public static void main(String[] args) {
        String a = "Hello World";
        char[] charr = a.toCharArray();
        int vowels=0;
        int consonants=0;


        for (char ch : charr) {
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println(ch);
                vowels++;
            } else {
                consonants++;
            }
        }


        //consononts
        for(char ch : charr){
            if("aeiou".indexOf(ch)==-1){
                System.out.println(ch);
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
