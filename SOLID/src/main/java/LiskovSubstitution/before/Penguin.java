package LiskovSubstitution.before;

public class Penguin extends Bird{

    @Override
    public void fly() {
        throw new RuntimeException("Penguin wont fly");
    }

    @Override
    public void walk() {
        System.out.println("Penguin walking");
    }
}
