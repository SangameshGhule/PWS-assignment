package LiskovSubstitution.after;

public class FlyingBird extends Bird{
    @Override
    public void move() {
        System.out.println("move");
    }

    public void walk(){
        System.out.println("walking..");
    }

    public void fly(){
        System.out.println("flying");
    }
}
