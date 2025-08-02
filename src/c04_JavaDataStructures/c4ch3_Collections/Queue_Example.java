package c04_JavaDataStructures.c4ch3_Collections;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Example {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("p_one");
        queue.offer("p_two");
        queue.offer("p_ three");

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println("--- LinkedList ---");
        Queue<String> queue2 = new LinkedList<>();
        queue2.offer("p_one");
        queue2.offer("p_two");
        queue2.offer("p_ three");

        System.out.println(queue2);
        System.out.println(queue2.peek());
        queue2.poll();
        System.out.println(queue2);
        System.out.println(queue2.peek());

        System.out.println("--- PriorityQueue ---");
        Queue<String> queue3 = new PriorityQueue<>();
        queue3.offer("p_one");
        queue3.offer("p_two");
        queue3.offer("p_three");

        System.out.println(queue3);
        System.out.println(queue3.peek());
        queue3.poll();
        System.out.println(queue3);
        System.out.println(queue3.peek());


    }
}
