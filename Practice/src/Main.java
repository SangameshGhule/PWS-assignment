import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AB {
    void method1() {
        // implementation for method1
        System.out.println("mehtod1");
    }

    void method2() {
        // implementation for method2
        System.out.println("method2");
    }
}

class BC extends AB {
    @Override
    void method2() {
        // Provide an empty implementation or throw an exception
        // depending on your requirements
        System.out.println("2");
    }
}


public class Main {
    public static void main(String[] args) {
        AB ab = new AB();
        ab.method1();
        ab.method2();

        BC bc = new BC();
        bc.method2();
        bc.method1();


        List<String> siblings = new ArrayList<>();
        siblings.add("John");
        siblings.add("Jane");

        //original copy
        User originalUser = new User("Alice", 30, siblings);

        // Perform a shallow copy
        User shallowCopyUser = originalUser.clone();

        // Modify the original user's sibling list
        originalUser.getSiblings().add("Jake");
        shallowCopyUser.getSiblings().add("jjj");

        // Display both the original and shallow copied users
        System.out.println("Original User: " + originalUser);
        System.out.println("Shallow Copy User: " + shallowCopyUser);

    }
}