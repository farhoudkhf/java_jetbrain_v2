package c02_objectsAndAPIs.ch05_DataStructure;

// Java code below
/*****************************************************
 Write your answer here, and then test your code.
 Implement the updateGrades() method.
 ******************************************************/

import java.util.HashMap;
import java.util.Map;

class Answer02_ch05 {

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;


    static Map<String, Integer> updateGrades(Map<String, Integer> gradebook, Map<String, Integer> makeupGrades) {

        // TODO: Update gradebook entry if the makeup grade is better
//        System.out.println("list1");
//        gradebook.forEach((k, v) -> System.out.println(k + ": " + v));
//        System.out.println("list2");
//        makeupGrades.forEach((k, v) -> System.out.println(k + ": " + v));
        gradebook.forEach((student, originalGrade) -> {
            Integer makeupGrade = makeupGrades.get(student);
            if (makeupGrade > originalGrade){
                gradebook.put(student, makeupGrade);
            }
        });

        return gradebook;
    }

    public static void main(String[] args) {
        /*****************************************************************
         This is how your code will be called.
         Your answer should be a map with the best scores for each student.
         You can edit this code to try different testing cases.
         *****************************************************************/
        var grades = new HashMap<String, Integer>();
        grades.put("Isaac", 95);
        grades.put("Hannah", 55);
        grades.put("Charlie", 80);
        grades.put("Alice", 24);
        grades.put("Bob", 32);
        grades.put("Jane", 63);
        grades.put("Daniel", 50);
        grades.put("Grace", 59);
        grades.put("Frank", 40);
        grades.put("Eve", 79);


        var makeupGrades = new HashMap<String, Integer>();
        makeupGrades.put("Isaac", 90);
        makeupGrades.put("Hannah", 95);
        makeupGrades.put("Charlie", 76);
        makeupGrades.put("Alice", 97);
        makeupGrades.put("Bob", 82);
        makeupGrades.put("Jane", 62);
        makeupGrades.put("Daniel", 89);
        makeupGrades.put("Grace", 80);
        makeupGrades.put("Frank", 98);
        makeupGrades.put("Eve", 79);

        var gradebook = Answer02_ch05.updateGrades(grades, makeupGrades);
    }
}

