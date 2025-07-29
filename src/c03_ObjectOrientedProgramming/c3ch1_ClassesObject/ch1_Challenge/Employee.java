package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.ch1_Challenge;

//import static java.lang.Math.round;

public class Employee {
    String empName;
    int age;
    double salary;
    String location;

    Employee(String empName, int age, double salary, String location) {
        this.empName = empName;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

     void raiseSalary(double raisePercentage) {
        this.salary = Math.round(this.salary * ( 1 + (raisePercentage / 100)) * 100.0) / 100.0;
     }
}
