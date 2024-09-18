package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingCharecterMOreThan2Times {

    public static void main(String[] args) {
        String input = "java is Fun programming language";
        findAndPrintRepeatingChars(input);


        String g = "programming";

        Map<Character, Long> collect = g.chars().mapToObj(value -> (char) value).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .forEach(entry -> System.out.println(entry.getKey()));
    }

    public static void findAndPrintRepeatingChars(String input) {

//        Map<Character, Long> charCountMap = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        List<Map.Entry<Character, Long>> collect = charCountMap.entrySet().stream().filter(a -> a.getValue() > 2).collect(Collectors.toList());
//        System.out.println(collect);



        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count each character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);
        // Filter and print characters that appear more than twice
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 2) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }


    }

}
