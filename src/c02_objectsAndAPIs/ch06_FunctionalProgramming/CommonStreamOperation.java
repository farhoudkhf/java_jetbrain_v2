package c02_objectsAndAPIs.ch06_FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class CommonStreamOperation {

    public static void main(String[] args) {

        List<String> veggies = List.of(
                "spinach",
                "cabbage",
                "peas",
                "green beans",
                "brussels sprouts",
                "carrots"
        );

        veggies.stream().anyMatch(v -> v.contains(" ")); //true

        veggies.stream().allMatch(v -> v.contains("s")); //false

        veggies.stream().
                filter(v -> v.startsWith("c")).
                forEach(System.out::println);

        veggies.stream().
                map(String::toUpperCase).
                forEach(System.out::println);

        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        numbers.stream().reduce(0, (a, b) -> a + b);

        veggies.stream()
                .sorted()
                .reduce("", (a, b) -> a + " | " + b);

        List veggiesThatEndWithS = veggies.stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toList());

        veggiesThatEndWithS.forEach(System.out::println);

        veggies.stream()
                .sorted()
                .filter(v -> v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v -> v.transform(w -> "yammy " + w))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
