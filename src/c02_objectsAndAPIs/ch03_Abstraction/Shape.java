package c02_objectsAndAPIs.ch03_Abstraction;

public abstract class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("I'm a shape.");
    }
}
