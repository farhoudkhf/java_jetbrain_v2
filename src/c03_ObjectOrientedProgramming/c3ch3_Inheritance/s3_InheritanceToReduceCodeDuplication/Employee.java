package c03_ObjectOrientedProgramming.c3ch3_Inheritance.s3_InheritanceToReduceCodeDuplication;

public class Employee extends Person {

//    private String name;
//    private int age;
    protected double salary;

    public Employee(String name, double salary, int age) {
        super(name, age);
//        this.name = name;
//        this.age = age;
        this.salary = salary;
    }

//    public String getName() {
//        return name;
//    }

    public double getSalary() {
        return salary;
    }

//    public int getAge() {
//        return age;
//    }

    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
