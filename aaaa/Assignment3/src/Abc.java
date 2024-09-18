import java.util.Arrays;
import java.util.stream.IntStream;

public class Abc {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int temp = 0;
        int min = 100;
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                temp = prices[i];
                prices[i] = min;
                min = temp;
            }
        }

        System.out.println(min);

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                index = i;
            }
        }
        System.out.println(index);
    }


}
