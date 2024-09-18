package LiskovSubstitution.after;

public class MainClass {

    public static void main(String[] args) {

        FlyingBird flyingBird = new peacock();
        flyingBird.move();
        flyingBird.walk();
        flyingBird.fly();

        NonFlyingBird nonFlyingBird= new NonFlyingBird();
        nonFlyingBird.move();
        nonFlyingBird.walk();
    }
}
