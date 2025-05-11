package BST;

import java.util.LinkedList;
import java.util.Queue;

public class MyBST {
    private Node root = null;
    private int count = 0;
    private boolean flag = true;

    public boolean add(int key) {
        root = add(root, key);
        return flag;
    }

    private Node add(Node n, int key) {
        if (n == null) {
            n = new Node(key);
            count++;
            return n;
        }

        if (key < n.key)
            n.left = add(n.left, key);
        else if (key > n.key)
            n.right = add(n.right, key);
        else
            flag = false;

        return n;
    }

    public void InOrder() {
        InOrder(root);
        System.out.println();

    }

    public void InOrder(Node n) {// left,root,right
        if (n == null)
            return;
        InOrder(n.left);
        System.out.print(n.key + " ");
        InOrder(n.right);
    }

    public void PreOrder() {
        PreOrder(root);
        System.out.println();

    }

    public void PreOrder(Node n) {// root,left,right
        if (n == null)
            return;
        System.out.print(n.key + " ");
        PreOrder(n.left);
        PreOrder(n.right);
    }

    public void PostOrder() {
        PostOrder(root);
        System.out.println();

    }

    public void PostOrder(Node n) {// left,right,root
        if (n == null)
            return;

        PostOrder(n.left);
        PostOrder(n.right);
        System.out.print(n.key + " ");
    }

    public void LevelOrder() {
        Queue<Node> n = new LinkedList<>();

        if (root != null) {
            n.add(root);
            while (!n.isEmpty()) {
                Node a = n.poll();
                System.out.print(a.key + " ");
                if (a.left != null)
                    n.add(a.left);
                if (a.right != null)
                    n.add(a.right);
            }
        }
        System.out.println();
    }



    public 
}
