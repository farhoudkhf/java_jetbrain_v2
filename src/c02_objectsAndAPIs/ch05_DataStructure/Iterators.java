package c02_objectsAndAPIs.ch05_DataStructure;

import java.util.HashSet;
import java.util.Set;

public class Iterators {

    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var i = fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
