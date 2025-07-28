package c01_syntaxAndStructure.gross_calculator;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args){

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){
            System.out.printf("Enter the cost of the item %d: ", i+1);
            double price = scanner.nextDouble();

            total = total + price;
            System.out.printf("Running Total: %.2f%n", total);
        }

        scanner.close();
        System.out.println("Your total is $" + total);
    }
}
