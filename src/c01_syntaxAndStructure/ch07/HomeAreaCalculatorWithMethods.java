package c01_syntaxAndStructure.ch07;

public class HomeAreaCalculatorWithMethods {

    public static void main(String[] args){
        Rectangle2 kitchen = new Rectangle2(200, 400);
        Rectangle2 bathroom = new Rectangle2(300, 700);
        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
    }

    public static double calculateTotalArea(Rectangle2 rectangle1, Rectangle2 rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
