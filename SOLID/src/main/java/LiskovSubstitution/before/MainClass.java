package LiskovSubstitution.before;

public class MainClass {

    public static void main(String[] args) {

        Bird p = new peacock();
        p.fly();

        Penguin pg = new Penguin();
        pg.fly();

    }
}
