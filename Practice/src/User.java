import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable {
    public User(String name, int age, List<String> siblings) {
        this.name = name;
        this.age = age;
        this.siblings = siblings;
    }

    private String name;
    private int age;
    private List<String> siblings;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", siblings=" + siblings +
                '}';
    }

    @Override
    public User clone() {
        try {
//            return (User) super.clone(); // Shallow copy

            User clone = (User) super.clone();
            clone.siblings = new ArrayList<>(this.siblings); // Deep Copy
            return clone;


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<String> siblings) {
        this.siblings = siblings;
    }
}
