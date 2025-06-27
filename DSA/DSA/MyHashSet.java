package DSA;

public class MyHashSet {
    static class Node {
        Integer key;
        Node next;

        Node(Integer key) {
            this.key = key;
        }
    }

    private Node[] buckets;
    private int capacity = 10;
    private int size = 0;
    private final double LOAD_FACTOR = 0.75;

    // Constructor
    public MyHashSet() {
        buckets = new Node[capacity];
    }

    // Hash function
    private int getIndex(Integer key) {
        return Math.abs(key.hashCode() % capacity);
    }

    // Add key if not present
    public boolean add(Integer key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return false; // Already present
            }
            head = head.next;
        }

        // Insert at head
        Node newNode = new Node(key);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        if ((double) size / capacity > LOAD_FACTOR) {
            resize();
        }

        return true;
    }

    // Check if key exists
    public boolean contains(Integer key) {
        int index = getIndex(key);
        Node curr = buckets[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    // Remove key
    public boolean remove(Integer key) {
        int index = getIndex(key);
        Node curr = buckets[index];
        Node prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }

        return false;
    }

    // Resize and rehash
    private void resize() {
        capacity *= 2;
        Node[] oldBuckets = buckets;
        buckets = new Node[capacity];
        size = 0;

        for (Node head : oldBuckets) {
            while (head != null) {
                add(head.key); // re-add existing keys
                head = head.next;
            }
        }
    }

    // Print for testing
    public void printSet() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            Node curr = buckets[i];
            while (curr != null) {
                System.out.print(curr.key + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }
}
