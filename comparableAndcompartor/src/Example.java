import java.util.ArrayList;
import java.util.List;

@lombok.Getter
@lombok.Setter
public class Example{
    int id;
    String name;
    String email;
    Double salary;
    public Example(int id, String name, String email, Double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Example{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Example o) {
//        return this.email.compareTo(o.email);  //based on name / email /
//    }
}
