package org.example;

interface MyFunctionalInterface {
    void performAction();

    // A static method in the interface
    static void printGreeting() {
        System.out.println("Hello from the interface!");
    }

    // A default method (just for context)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

class Trt implements MyFunctionalInterface{
    @Override
    public void performAction() {

    }

    @Override
    public void defaultMethod() {
        MyFunctionalInterface.super.defaultMethod();
    }

    MyFunctionalInterface myFunc = () -> System.out.println("llll");


}