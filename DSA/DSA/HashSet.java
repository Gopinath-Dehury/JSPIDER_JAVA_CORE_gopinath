package DSA;

class Node {
    Integer key;
    Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    public Node(int key, Node next) {
        this.key = key;
        this.next = next;
    }

}

public class HashSet {
    Node[] a = new Node[10];
    int count = 0;
    boolean flag = true;

    public boolean add(Integer e) {
         e.hashCode();
        int hc = e.hashCode();
        int index = Math.abs(hc % a.length);
        if (a[index] == null) {
            a[index] = new Node(e);
            count++;
            return flag;
        }

        Node curr = a[index];
        Node temp = null;
        while (curr != null) {
            if (curr.key.equals(e))
                return false;
            temp = curr;
            curr = curr.next;
        }
        temp.next = new Node(e);
        count++;
        return flag;
    }
}
