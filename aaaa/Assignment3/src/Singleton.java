public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public Singleton getInstance(){
        if(singleton==null){
            return new Singleton();
        }
        return singleton;
    }

}
