package c03_ObjectOrientedProgramming.c3ch2_Encapsulation.ch2_Challenge;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0); //forcing the number to be positive
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double amount) {
        return (amount <= this.balance) ? this.balance = this.balance - amount : 0;
    }

    public double deposit(double amount) {
        // Returns "Even" if num is even, otherwise "Odd"
//        return (num % 2 == 0) ? "Even" : "Odd";
        return (amount > 0) ? this.balance = this.balance + amount : 0;
    }

}
