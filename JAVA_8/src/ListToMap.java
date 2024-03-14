import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;


public class ListToMap {

    public static void main(String[] args) {

        ArrayList<Test1> test1 = new ArrayList<>();
        test1.add(new Test1(1, "mayank"));
        test1.add(new Test1(2, "sangmesh"));
        test1.add(new Test1(3, "nagaraj"));
        test1.add(new Test1(4, "naveed"));

        System.out.println(test1);
        HashMap<Integer, String> map = new HashMap<>();

        test1.forEach(a -> {
                    if (a != null) {
                        map.put(a.getId(), a.getName());
                    }
                }
        );
        System.out.println(map);
        System.out.println(map.entrySet());

        HashMap<Integer, Integer> map1 = new HashMap<>();
//        int[] a = new int[]{23,5,4,3};
//        int i[]={0};
//        Arrays.stream(a).forEach(b-> {
//                    map1.put(i[0], b);
//                    i[0]++;
//                }
//        );

//        int[] a= new int[]{2,3,1,4,6};
//        AtomicInteger i= new AtomicInteger(0);
//
//        Arrays.stream(a).forEach(b->{
//            map1.put(i.getAndIncrement(),b);
//        });
        System.out.println(map1);

        String a = "mayank123";

        boolean b = a.chars().allMatch(Character::isLetter);
        System.out.println(b);
    }
}
