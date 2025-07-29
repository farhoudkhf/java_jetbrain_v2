package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.s2_ObjectsWithConstructor;

public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(25, 5, TreeType.OAK);

        System.out.println(myFavoriteOakTree.heightFt);
        System.out.println(myFavoriteOakTree.trunkDiameterInches);
        System.out.println(myFavoriteOakTree.treeType);
    }

}
