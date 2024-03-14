import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeforeJava8_01 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("sam","mas","sunny","sam");
        List<String> uniqueName = new ArrayList<>();

        for(String name: names){
            if(!uniqueName.contains(name)){
                uniqueName.add(name);
            }
        }
        System.out.println(uniqueName);


        //After java 8
        System.out.println(names.stream().distinct().collect(Collectors.toList()));


    }
}
