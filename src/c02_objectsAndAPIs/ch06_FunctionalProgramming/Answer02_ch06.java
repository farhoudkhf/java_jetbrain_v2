package c02_objectsAndAPIs.ch06_FunctionalProgramming;

// Java code below
/*******************************************************
 Write your answer here, and then test your code.
 Your job is to implement the filterColorsContainingE()
 method.
 ********************************************************/

import java.util.List;
import java.util.stream.Collectors;

class Answer02_ch06 {

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;


    static List<String> filterColorsContainingE(List<String> colors) {
        /*
        TODO: Use stream operations to filter the list of colors
        into a new list that contains only the ones that contain
        the letter 'e'.
         */
//        List colorsContainE =
//                colors.stream()
////                .sorted()
//                .filter(c -> c.contains("e"))
////                .map(String::toUpperCase)
////                .map(v -> v.transform(w -> "yammy " + w))
//                .collect(Collectors.toList());
////        return colorsContainE;
        return colors.stream()
                .filter(c -> c.contains("e"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        /*************************************************************
         This is how your code will be called.
         Your answer should be a filtered list containing colors with
         the letter 'e'.
         You can edit this code to try different testing cases.
         *************************************************************/
        List<String> colors = List.of("red", "green", "blue", "pink", "black", "brown", "yellow", "purple", "orange", "white");
        List<String> result = Answer02_ch06.filterColorsContainingE(colors);
    }
}

