interface AA {
    default void foo() {
        System.out.println("A's foo");
    }

    void display();
}

interface BB extends AA {
    // no additional methods
}

interface CC extends AA {
    // no additional methods
}

public abstract class  MyClass implements BB, CC {
    @Override
    public void display() {

    }
    // no implementation for foo
}
