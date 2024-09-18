import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exmaple1 {

    public static void main(String[] args) {

            int a=7;
            a=9;

            System.out.println(a);

            User user= new User();
            user.setName("Sangamesh");
            user.setAge(27);
            user.setSiblings(new ArrayList<>(Arrays.asList("Jaggu","Bhagya")));

            User user1= user.clone();
            user1.setName("Mayank");
            user1.setAge(24);
            user1.getSiblings().add("Siya");

            System.out.println(user);
            System.out.println(user1);

            List<Integer> integerList = new ArrayList<>();
//            integerList.add();

            List<Integer> collect = integerList.stream().filter(b -> b % 2 == 1).collect(Collectors.toList());
            System.out.println(collect);

    }
}
