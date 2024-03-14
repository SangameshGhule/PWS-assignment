import java.util.Comparator;

public class beforeJava8Comparator {

    public static void main(String[] args) {

        //Before java 8
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(c1.compare(10, 20));

        //After java 8
        Comparator<Integer> c2 = (Integer x, Integer y) -> x.compareTo(y);
        System.out.println(c2.compare(10, 10));

        Comparator<Integer> c21 = (a, b) -> a.compareTo(b);
        System.out.println(c21.compare(10, 30));

        //After java 8 and Higher
        Comparator<Integer> c3 = Integer::compareTo;
        System.out.println(c3.compare(15, 10));
    }
}
