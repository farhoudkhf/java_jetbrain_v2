package c02_objectsAndAPIs.ch02_Polymorphism;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void scratch() {
        System.out.println("I am a cat, I scratch things.");
    }

}
