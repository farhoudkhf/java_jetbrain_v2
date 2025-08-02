package c04_JavaDataStructures.c4ch3_Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);

        System.out.println(treeSet);
        treeSet.add(6);
        System.out.println(treeSet);

        Set<String> wordSet = new TreeSet<>();
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);

        System.out.println("this is Set 2 ordered by lenght of the string: ");
        Set<String> wordSet2 = new TreeSet<>(Comparator.comparing(String::length));
        wordSet2.add("tiger");
        wordSet2.add("giraffe");
        wordSet2.add("bear");
        System.out.println(wordSet2);
        wordSet2.add("wolf");
        System.out.println(wordSet2);
        wordSet2.remove("giraffe");
        System.out.println(wordSet2);

//        static TreeSet<String> createSortedTreeSet(String word1, String word2, String word3) {
//            TreeSet<String> set = new TreeSet<>(Comparator.comparing(String::length));
//            set.addAll(Arrays.asList(word1, word2, word3));
//            return set;
//        }

        String word1 = "red";
        String word2 = "yellow";
        String word3 = "blue";
        TreeSet<String> set = new TreeSet<>(Comparator.comparing(String::length));
        set.addAll(Arrays.asList(word1, word2, word3));
        System.out.println(set);

//        TreeSet<String> result = createSortedTreeSet(word1, word2, word3);

    }

//    private static TreeSet<String> createSortedTreeSet(String word1, String word2, String word3) {
//    }
}
