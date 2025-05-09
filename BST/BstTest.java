package BST;

public class BstTest {
    public static void main(String[] args) {
        MyBST bst = new MyBST();
        bst.add(10);
        bst.add(1);
        bst.add(20);
        bst.add(30);
        bst.add(40);
        bst.add(50);
        bst.add(12);
        bst.add(11);
        bst.add(17);
        bst.add(18);
        bst.LevelOrder();
        bst.InOrder();
        bst.PreOrder();
        bst.PostOrder();

    }
}
