package c03_ObjectOrientedProgramming.c3ch3_Inheritance.s3_InheritanceToReduceCodeDuplication;

public class Person {
    private String name;
    private int age;
    private String behavior;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
//        this.behavior = behavior;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getBehavior() {
        return this.behavior;
    }
}
