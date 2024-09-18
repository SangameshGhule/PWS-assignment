import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30));
        employees.add(new Employee("Doe", 35));
        employees.add(new Employee("Jane", 25));


        // Comparator for descending order based on names
        Comparator<Employee> comparatorByNameDesc = (o1, o2) -> o1.getName().compareTo(o2.getName());

        // Sorting in descending order based on names
        Collections.sort(employees, comparatorByNameDesc);

        // Printing sorted list
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
