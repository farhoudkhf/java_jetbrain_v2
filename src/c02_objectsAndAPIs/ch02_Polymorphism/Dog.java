package c02_objectsAndAPIs.ch02_Polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println("fetch is fun.");
    }
}
