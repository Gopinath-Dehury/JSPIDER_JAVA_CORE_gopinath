package DSA;

public class LinkedList {
    Node first = null;
    int index = 0;

    class Node {

        Object ele;
        Node next;

        public Node(Object ele) {
            this.ele = ele;
        }

        public Node(Object ele, Node next) {
            this.ele = ele;
            this.next = next;
        }
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void clear() {
        first = null;
        index = 0;
    }

    // ---------------------------------------------------------------
    // 1 ADD(OBJECT E) METHOD
    public void add(Object e) {
        if (first == null) {
            first = new Node(e);
            index++;
            return;
        }
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(e);
        index++;
    }

    // 2 ADD(INT POSITION,OBJECT E) adding in between method ------Add items at any
    // position: start, middle, or end.
    public void add(int pos, Object e) {
        if (pos < 0 || pos > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (pos == 0) {
            first = new Node(e, first);
            index++;
            return;
        }
        Node curr = first;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = new Node(e, curr.next);
        index++;
    }

    // 3 GET(int pos) this method return the object present in that position
    public Object get(int pos) {
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = first;
        for (int i = 1; i <= pos; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    // 4 REVERSE METHOD
    public void reverse() {
        if (index == 0)
            return;
        Node prev = null;
        Node curr = first;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        first = prev;
    }

    // 5 REMOVE(INT POSITION)
    public void remove(int pos) {
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (pos == 0) {
            first = first.next;
            index--;
            return;
        }
        Node curr = first;
        for (int i = 1; i < pos; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        index--;
    }

    // 6 TOSTRING() METHOD
    @Override
    public String toString() {
        if (index == 0)
            return "[]";

        StringBuilder s = new StringBuilder("[ " + first.ele);
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
            s.append(" , ").append(curr.ele);
        }
        s.append("]");

        return s.toString();
    }

    public boolean contains(Object e) {
        Node curr = first;
        while (curr != null) {
            if (e == null ? curr.ele == null : e.equals(curr.ele))
                return true;
            curr = curr.next;
        }
        return false;
    }

}
