package c02_objectsAndAPIs.ch06_FunctionalProgramming;

import java.util.Arrays;

public class Stream {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        Arrays.stream(numbers).parallel().
                forEach(n -> System.out.println(n+1+" "));
    }
}
