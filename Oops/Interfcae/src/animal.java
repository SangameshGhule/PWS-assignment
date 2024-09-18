public interface animal {

    public default void sound(){
        System.out.println("animal sound");
    }

    public default void speed(){
        System.out.println("animal speed");
    }
}
