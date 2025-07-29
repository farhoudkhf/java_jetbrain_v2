package c03_ObjectOrientedProgramming.c3ch2_Encapsulation.ch2_Challenge_MySolution;

public class Main {

    public static void main(String[] args) {

        BankAccount accoutOne = new BankAccount("John", 100);

        System.out.println(accoutOne.getOwner());
        System.out.println(accoutOne.getBalance());

        System.out.println(accoutOne.deposit(50));
        System.out.println("New Balance: " + accoutOne.getBalance());
        System.out.println(accoutOne.deposit(10));
        System.out.println("New Balance: " + accoutOne.getBalance());
        System.out.println(accoutOne.withdraw(30));
        System.out.println("New Balance: " + accoutOne.getBalance());
        System.out.println(accoutOne.withdraw(130));
        System.out.println("New Balance: " + accoutOne.getBalance());



    }
}
