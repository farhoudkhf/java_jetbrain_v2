package c01_syntaxAndStructure.ch07;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String[] args){

        Rectangle2 room1 = new Rectangle2();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle2 room2 = new Rectangle2(30,75);
        double areaOfRoom2 = room2.calculateArea();
    }
}
