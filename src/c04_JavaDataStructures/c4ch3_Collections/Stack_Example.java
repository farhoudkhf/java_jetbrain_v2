package c04_JavaDataStructures.c4ch3_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_Example {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.push("First Request");
        stack.push("second request");
        stack.push("third request");

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

    }
}
