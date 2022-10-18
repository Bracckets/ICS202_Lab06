public class BST_Test {
    public static void main(String[] args){
        BST myBST = new BST();

        myBST.insert(8);     myBST.insert(4);    myBST.insert(9);
        myBST.insert(2);    myBST.insert(7);

        System.out.print("Breadth-First traversal prints: ");
        myBST.breadthFirst();
        System.out.print("\n");

        System.out.print("Preorder Depth First Traversal prints: ");
        myBST.preorder();
        System.out.print("\n");

        System.out.print("Inorder Depth First Traversal prints: ");
        myBST.inorder();
        System.out.print("\n");

        System.out.print("Post Order Depth First Traversal prints: ");
        myBST.postorder();
        System.out.println("\n\n");

        System.out.println("----------------------------------------");

        System.out.println("The number of nodes is: " + myBST.count());

        System.out.println("'4' is leaf? " + myBST.isLeaf(4));

        System.out.println("'7' is leaf? " + myBST.isLeaf(7));

        System.out.println("Number of leaves is: " + myBST.countLeaves());

        System.out.println("Height is: " + myBST.height());

        System.out.println();



    }
}

