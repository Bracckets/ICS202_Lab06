public class BST_Test {
    public static void main(String[] args){
        BST myBST = new BST();

        myBST.insert(3);     myBST.insert(2);    myBST.insert(5);
        myBST.insert(1);     myBST.insert(4);    myBST.insert(6);

        myBST.breadthFirst();

        System.out.println("\n" + myBST.countLeaves());



    }
}

