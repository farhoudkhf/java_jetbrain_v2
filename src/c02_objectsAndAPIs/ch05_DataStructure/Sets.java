package c02_objectsAndAPIs.ch05_DataStructure;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("have lemon? " + fruits.contains("lemon"));

        System.out.println("size before remove: " + fruits.size());
        fruits.remove("lemon");
        System.out.println("number of elements after removing lemon: " + fruits.size());

        Set moreFruits = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruits);
//        moreFruits.add("cherry");
//        moreFruits.remove("pear");
    }
}
