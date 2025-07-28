package c01_syntaxAndStructure.gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator  {

    public static void main(String[] args){
//        System.out.println("Hello World!");
        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota) {
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);


//        //1. Get the number of hours worked
//        int hours = 0;
//        System.out.println("How many hours did you work:");
//
//        Scanner scanner = new Scanner(System.in);
//        hours = scanner.nextInt();
//
//        //2. Get the hourly pay rate
//        double payRate = 0;
//
//        System.out.println("What is your pay rate? ");
//        payRate = scanner.nextDouble();
//
//        scanner.close();
//
//        //3. Multiply hours and rate
//        double grossPay = hours * payRate;
//
//        //4. Display result
//        System.out.println("Gross Pay: " + grossPay);

    }
}
