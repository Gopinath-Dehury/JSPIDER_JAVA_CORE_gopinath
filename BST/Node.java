package BST;

public class Node {
    Integer key;
    Node left;
    Node right;

    public Node(Integer key) {
        this.key = key;
    }

    public Node(Integer key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

}
