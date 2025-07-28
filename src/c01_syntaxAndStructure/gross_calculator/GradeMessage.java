package c01_syntaxAndStructure.gross_calculator;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String operation = scanner.next();
        scanner.close();

        // switch statement
        String message;
        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        // switch expression
        String message2 = switch(grade){
            case "A", "B" -> "Excellent for A and Great for B job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(message);
        System.out.println(message2);

        float firstnumber = 2;
        float secondnumber = 8;
        float result = switch (operation) {
            case "+" -> {
                System.out.println("addition...");
                yield firstnumber + secondnumber;
            }
            case "-" -> {
                System.out.println("Suntraction...");
                yield firstnumber - secondnumber;
            }
            default -> 0;
        };

        System.out.println("Result: " + result);

    }
}
