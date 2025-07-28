package c01_syntaxAndStructure.ch07;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Rectangle2 kitchen = getRoom();
        Rectangle2 bathroom = getRoom();

        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);

        scanner.close();
    }

    public static double calculateTotalArea(Rectangle2 rectangle1, Rectangle2 rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle2 getRoom(){
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle2(length, width);
    }
}
