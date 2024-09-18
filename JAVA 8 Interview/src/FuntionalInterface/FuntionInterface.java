package FuntionalInterface;

import java.util.function.Function;

public class FuntionInterface {

    public static void main(String[] args) {

        Function<Integer, String> function = i -> "Number: " + i;
        String result = function.apply(5);  // Returns "Number: 5"
        System.out.println(result);


        Function<Integer , Integer> f = i-> i + 5;
        Integer res = f.apply(5);
        System.out.println(res);

        int out = 0;
        for (int i = 0; i < 10; i++) {
            int finalOut = out;
            Function<Integer, Integer> ff = a -> a + finalOut;
            out = ff.apply(i);
        }
        System.out.println(out);

    }

}

