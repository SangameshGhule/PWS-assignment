package org.example;

import java.util.Arrays;
import java.util.List;

public class ExmapleExceptionIntegerParse {

    public static void main(String[] args) {
        List<String> values = Arrays.asList("10", "20", "abc", "30", "40", "xyz", "50");
        int sum = 0;
        for(String a:values){
            try{
                int i = Integer.parseInt(a);
                sum = sum+i;
            }catch (Exception e){
                System.out.println(e.getMessage() + a);
            }
        }
System.out.println(sum);
    }
}
