import java.util.*;

public class Main{
    public static void main(String[] args) {

        List<Example> employees = new ArrayList<>();
        employees.add(new Example(1, "sonu", "sonu@gmail.com", 3490.89));
        employees.add(new Example(4, "muna", "muna@gmail.com", 5654.78));
        employees.add(new Example(2, "runa", "auna@gmail.com", 34325523.7));
        employees.add(new Example(3, "kanha", "kanha@gmail.com", 23525.78));
        employees.add(new Example(6, "ariyanka", "priyanka@gmail.com", 23525.78));

        Collections.sort(employees, new Example2());

        //sorting order
        Iterator<Example> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator" + iterator.next());
        }

        //reverse order
        ListIterator<Example> listIterator = employees.listIterator(employees.size());
        while (listIterator.hasPrevious()) {
            System.out.println("list-iterator" + listIterator.previous());
        }
    }
}