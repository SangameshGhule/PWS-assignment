// Abstract class with an abstract method
interface Animal {
    abstract void sound();
}

// Concrete class implementing Animal with a specific sound
class Tiger implements Animal {
    @Override
    public void sound() {
        System.out.println("Tiger roars");
    }
}

// Another concrete class implementing Animal with a different sound
class Parrot implements Animal {
    @Override
    public void sound() {
        System.out.println("Parrot squawks");
    }
}


class ABC{
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.sound();

        Tiger a = new Tiger();
        a.sound();
    }
}



