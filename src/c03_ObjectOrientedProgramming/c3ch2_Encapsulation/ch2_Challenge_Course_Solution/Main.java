package c03_ObjectOrientedProgramming.c3ch2_Encapsulation.ch2_Challenge_Course_Solution;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Wonder Woman",
                1000);

        bankAccount.withdraw(500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
