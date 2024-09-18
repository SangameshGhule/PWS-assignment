import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {

    public static void main(String[] args) {
        String a ="sangamesh";

        String collect = a.chars().distinct().mapToObj(b -> String.valueOf((char) b)).collect(Collectors.joining());
        System.out.println(collect);

        int b = 567546;
        String collect1 = String.valueOf(b).chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
        int i = Integer.parseInt(collect1);
        System.out.println(i);

        String a1 = "ZYXW";

        char[] charArray = a1.toCharArray();

        int left = 0;
        int right = charArray.length-1;

        while(left < right){
            char temp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = temp;
            left++;
            right--;
        }

        System.out.println(charArray);


        int g = 8;
        int result = 1;
        for(int k=1;k<=g;k++){
            result = result * k;
        }
        System.out.println(result);

        String f = "BCDAA";
//        f.chars().mapToObj(d-> String.valueOf((char) d)).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
//        String reversed = f.chars() // Convert the string to an IntStream of character codes
//                .mapToObj(c -> String.valueOf((char) c)) // Convert each character code to a string
//                .sorted((h, j) -> -h.compareTo(j)) // Sort in descending order (reverse)
//                .collect(Collectors.joining());
//        System.out.println(reversed);

        String reversed = f.chars() // Convert the string to an IntStream of character codes
                .mapToObj(c -> String.valueOf((char) c)) // Convert each character code to a string
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    java.util.Collections.reverse(list); // Reverse the list
                    return String.join("", list); // Join the characters back into a string
                }));
        System.out.println(reversed);



        char[] charArray1 = f.toCharArray();

        String p = "ADFAEB";

        String collect2 = Stream.of(p).map(String -> new StringBuffer(p).reverse()).collect(Collectors.joining());
        System.out.println(collect2);

        String s = p.chars().mapToObj(l -> String.valueOf((char) l)).reduce((w, r) -> r + w).orElse("");
        System.out.println(s);

        int F[] = {3,4,6,7};
        String d = "4567";
        int e = 5678;

        int sum2 = String.valueOf(e).chars().map(Character::getNumericValue).sum();
        System.out.println(sum2);

        int sum1 = d.chars().map(Character::getNumericValue).sum();
        System.out.println(sum1);

        int sum = Arrays.stream(F).sum();
        System.out.println(sum);


    }
}
