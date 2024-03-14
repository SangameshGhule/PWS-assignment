public class InheritanceExample {

    public static void main(String[] args) {
//        A a= new B();
//        a.display();
//        a.display1();

        B b= new B();
    }
}

class A{
    public void display(){
        System.out.println("Hello display from A");
    }

    public void display1(){
        System.out.println("Hello display1 from A");
    }
}

class B extends A {
    public void display(){
        System.out.println("Hello display from B");
    }
}
