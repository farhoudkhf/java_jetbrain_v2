package c02_objectsAndAPIs.ch06_FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class Functional_Interfaces {

    public static void main(String[] args) {

        List countries = List.of("Austrolia", "China", "France", "Italy");
//        countries.forEach(c -> System.out.println(c));
        Consumer print = c -> System.out.println(c);
//        countries.forEach(print);
        print.accept("Hello World");
    }
}
