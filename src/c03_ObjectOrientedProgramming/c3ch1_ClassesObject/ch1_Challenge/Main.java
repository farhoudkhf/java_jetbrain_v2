package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.ch1_Challenge;

public class Main {

    public static void main(String[] args) {

        Employee employeeOne = new Employee("raza", 55, 100.50, "arak");
        Employee employeeTwo = new Employee("sooosis", 65, 100.50, "sabzevar");

        System.out.println(
                "Name: " + employeeOne.empName
                + " Age: " + employeeOne.age
                + " Salary: " + employeeOne.salary
                + " Location: " + employeeOne.location
        );

        System.out.println("after raise");

        employeeOne.raiseSalary(10);
        employeeTwo.raiseSalary(-5);

        System.out.println(
                "Name: " + employeeOne.empName
                        + " Age: " + employeeOne.age
                        + " Salary: " + employeeOne.salary
                        + " Location: " + employeeOne.location
        );

        System.out.println(
                "Name: " + employeeTwo.empName
                        + " Age: " + employeeTwo.age
                        + " Salary: " + employeeTwo.salary
                        + " Location: " + employeeTwo.location
        );

    }
}
