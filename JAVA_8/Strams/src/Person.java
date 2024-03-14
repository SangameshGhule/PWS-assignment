import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    Integer height;
    Double salary;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                ", emailId='" + emailId + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public Person(String name, Integer height, Double salary, String emailId, List<String> hobbies) {
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.emailId = emailId;
        this.hobbies = hobbies;
    }

    String emailId;
    List<String> hobbies;
}



