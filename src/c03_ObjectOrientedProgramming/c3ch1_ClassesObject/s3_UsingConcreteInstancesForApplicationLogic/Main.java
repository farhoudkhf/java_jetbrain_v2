package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.s3_UsingConcreteInstancesForApplicationLogic;

public class Main {

    public static void main(String[] args) {
        Tree myOakTree = new Tree(120, 12, TreeType.OAK);

        myOakTree.announceTallTree();

        Tree myMapleTree = new Tree(90, 30, TreeType.MAPLE);

        myMapleTree.announceTallTree();

//        if (myOakTree.heightFt > 100) {
//            System.out.println("that's a tall " + myOakTree.treeType + " tree.");
//        }
//        if (myMapleTree.heightFt > 100) {
//            System.out.println("that's a tall " + myMapleTree.treeType + " tree.");
//        }
    }
}
