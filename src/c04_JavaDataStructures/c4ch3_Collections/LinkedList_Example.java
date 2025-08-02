package c04_JavaDataStructures.c4ch3_Collections;

import java.util.Collections;
import java.util.List;

public class LinkedList_Example {

    public static void main(String[] args) {

        java.util.LinkedList<String> shoppingList = new java.util.LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);

        shoppingList.addLast("orange");
        System.out.println(shoppingList);

        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);
    }
}
