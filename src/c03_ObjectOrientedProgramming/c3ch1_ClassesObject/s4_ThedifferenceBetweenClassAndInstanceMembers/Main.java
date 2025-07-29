package c03_ObjectOrientedProgramming.c3ch1_ClassesObject.s4_ThedifferenceBetweenClassAndInstanceMembers;

public class Main {

    public static void main(String[] args) {
        Tree myOakTree = new Tree(120, 12, TreeType.OAK);

        myOakTree.announceTallTree();

        Tree myMapleTree = new Tree(90, 30, TreeType.MAPLE);

        myMapleTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR);

        Tree.accounceTree();

    }
}
