package c03_ObjectOrientedProgramming.c3ch2_Encapsulation.s2and3_AccessModifiers;

import java.awt.*;

public class Tree {

    protected Color trunkColor = new Color(102,51,0);

    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;

    public Tree(double heightFt, double trunkDiameterInches,
         TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void grow() {
        this.heightFt = heightFt + 10;
        this.trunkDiameterInches = trunkDiameterInches + 1;
    }

    public void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType +
                    " tree!");
        }
    }
}
