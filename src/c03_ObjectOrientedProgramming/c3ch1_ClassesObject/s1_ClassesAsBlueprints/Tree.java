package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.s1_ClassesAsBlueprints;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }
}
