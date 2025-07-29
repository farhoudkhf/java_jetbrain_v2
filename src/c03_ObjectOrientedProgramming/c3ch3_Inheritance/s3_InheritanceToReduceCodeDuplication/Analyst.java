package c03_ObjectOrientedProgramming.c3ch3_Inheritance.s3_InheritanceToReduceCodeDuplication;

public class Analyst extends Employee {

    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus() {
        return this.salary * .05;
    }

}
