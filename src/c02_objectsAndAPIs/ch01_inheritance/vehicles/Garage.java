package c02_objectsAndAPIs.ch01_inheritance.vehicles;

public class Garage {

    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("red");

        System.out.println(
                 String.format("my car is %s and has %d doors.",
                         myCar.getColor(), myCar.getDoors())
        );
    }
}
