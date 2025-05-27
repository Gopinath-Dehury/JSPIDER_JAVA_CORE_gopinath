package Linkedlistimpl2;

public class Node {
    Object ele;

    Node next;

    public Node(Object ele) {
        this.ele = ele;
        this.next = null;

    }

    public Node(Object ele, Node next) {
        this.ele = ele;
        this.next = next;
    }

}
