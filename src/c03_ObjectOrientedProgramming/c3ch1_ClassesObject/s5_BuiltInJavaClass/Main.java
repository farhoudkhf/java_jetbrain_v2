package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.s5_BuiltInJavaClass;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaulrWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;

        Color brighterBlue = myDefaultBlue.brighter();


    }
}
