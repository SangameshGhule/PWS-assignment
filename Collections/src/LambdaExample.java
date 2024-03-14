// Functional interface
interface MyFunctionalInterface {
    void myAbstractMethod();
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the abstract method
        MyFunctionalInterface myLambda = () -> System.out.println("Implementation of myAbstractMethod");

        // Calling the method through the lambda expression
        myLambda.myAbstractMethod();
    }
}