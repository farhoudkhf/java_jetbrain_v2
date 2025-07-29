package c03_ObjectOrientedProgramming.c3ch3_Inheritance.s4_InheritanceInFoundationalJavaClasses;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Character> charStack = new Stack<>();

        charStack.push('c');
        charStack.push('a');
        charStack.push('t');

        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
    }
}
