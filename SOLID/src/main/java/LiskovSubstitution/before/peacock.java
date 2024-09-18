package LiskovSubstitution.before;

public class peacock extends Bird{
    @Override
    public void fly() {
        System.out.println("Peacock flying..");
    }

    @Override
    public void walk() {
        System.out.println("Walking..");
    }
}
