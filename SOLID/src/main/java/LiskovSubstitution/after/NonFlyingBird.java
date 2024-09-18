package LiskovSubstitution.after;

public class NonFlyingBird extends Bird{
    @Override
    public void move() {
        System.out.println("move..");
    }

    public void walk(){
        System.out.println("walking..");
    }
}


