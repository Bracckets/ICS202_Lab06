public class BST_Test {
    public static void main(String[] args){
        BST myBST = new BST();
        for (int i = 1; i < 7; i++){
            myBST.insert(i);
        }
        myBST.inorder();

        System.out.println("\n" + myBST.count());
    }
}
