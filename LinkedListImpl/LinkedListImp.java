public class LinkedListImp {
    private Node first = null;
    private int count = 0;

    public void add(Object e) {
        if (first == null) {
            first = new Node(e, null);
            count++;
            return;
        }
        Node c = first;
        while (c.next != null) {
            c = c.next;
        }
        c.next = new Node(e, null);
        count++;
    }

    public void add(int index, Object e) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = new Node(e, first);
            count++;
            return;
        }

        Node c = first;
        for (int i = 1; i < index; i++) {
            c = c.next;
        }
        c.next = new Node(e, c.next);
        count++;
    }

    public int size() {
        return count;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node c = first;
        for (int i = 0; i < index; i++) {
            c = c.next;
        }
        return c.ele;
    }

    @Override
    public String toString() {
        if (first == null)
            return "[ ]";
        Node c = first;
        StringBuilder s = new StringBuilder("[ " + c.ele);
        // for (int i = 1; i <size(); i++) {
        while (c.next != null) {
            c = c.next;
            // if (i < size())
            // s += ", ";
            s.append(" ,").append(c.ele);

        }
        s.append(" ]");
        return s.toString();

    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = first.next;
            count--;
            return;
        }
        Node c = first;
        for (int i = 1; i < index; i++) {
            c = c.next;
        }
        c.next = c.next.next;
        count--;
    }

    public void reverse() {
        Node prevNode = null;
        Node currNode = first;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        first = prevNode;
    }

    public void clear() {
        first = null;
        count = 0;
    }
}
