package c02_objectsAndAPIs.ch01_inheritance.shapes;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
