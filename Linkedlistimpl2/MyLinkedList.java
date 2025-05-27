package Linkedlistimpl2;

public class MyLinkedList {
    private Node firstNode = null;
    private int count = 0;

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(Object e) {
        if (firstNode == null) {
            firstNode = new Node(e);
            count++;
            return;
        }
        Node c = firstNode;
        while (c.next != null) {
            c = c.next;
        }
        c.next = new Node(e);
        count++;
    }

    public void add(int index, Object e) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            firstNode = new Node(e, firstNode);
            count++;
            return;
        }
        Node currNode = firstNode;
        for (int i = 1; i < index; i++) {
            currNode = currNode.next;
        }
        currNode.next = new Node(e, currNode.next);
        count++;
    }

    public void reverse() {
        Node prevNode = null;
        Node currNode = firstNode;
        Node nextNode = null;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        firstNode = prevNode;

    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node currNode = firstNode;
        for (int i = 1; i <= index; i++) {
            currNode = currNode.next;
        }
        return currNode.ele;
    }

    public String toString() {

        Node currNode = firstNode;
        StringBuilder s = new StringBuilder("[ " + currNode.ele);
        while (currNode.next != null) {
            currNode = currNode.next;
            s.append(", ").append(currNode.ele);

        }
        s.append(" ]");
        return s.toString();
    }

}
