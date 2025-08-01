package c01_syntaxAndStructure.ch06;

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String args[]){

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified
        isUserQualified(actualCreditScore, actualSalary);
    }

    public static void isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            System.out.println("Congrats! You've been approved!");
        }
        else{
            System.out.println("Sorry, you've been declined.");
        }
    }
}
