package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.s4_ThedifferenceBetweenClassAndInstanceMembers;

import java.awt.*;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(120, 51, 0);

    Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    static void accounceTree() {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree.");
    }

    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("that's a tall " + this.treeType + " tree.");
        }
    }
}
