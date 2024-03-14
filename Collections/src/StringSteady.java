import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringSteady {

    public static void main(String[] args) {
        //W<Q<R<E
        String s = "WQWRWEQW";  //2
//        char[] ch = s.toCharArray();
//
//        Map<Character, Long> characterCount =
//        new String(ch).chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        System.out.println(characterCount);

        int[] chars = new int[26];
        for(char c: s.toCharArray()){
            chars[c-'A']++;
        }
        System.out.println(Arrays.toString(chars));
    }
}
