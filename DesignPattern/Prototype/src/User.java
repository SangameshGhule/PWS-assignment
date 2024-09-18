import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;

public class User implements Cloneable {

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
            User clone = (User) super.clone();
            clone.siblings = new ArrayList<>(this.siblings);
            return clone; // Deep copy
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
