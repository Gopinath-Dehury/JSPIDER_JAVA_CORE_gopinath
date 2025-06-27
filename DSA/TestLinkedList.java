import DSA.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Test 1: Add elements at end
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "second");
        list.add(3, "D");
        System.out.println("After adding A, B, C: " + list); // Expected: [A, B, C]

        // Test 2: Add at specific position
        list.add(0, "Start");
        System.out.println("After adding 'Start' at index 0: " + list); // Expected: [Start, A, B, C]

        list.add(2, "Mid");
        System.out.println("After adding 'Mid' at index 2: " + list); // Expected: [Start, A, Mid, B, C]

        // Test 3: Get elements
        System.out.println("Element at index 0: " + list.get(0)); // Expected: Start
        System.out.println("Element at index 2: " + list.get(2)); // Expected: Mid
        System.out.println("Element at last index: " + list.get(list.size() - 1)); // Expected: C

        // Test 4: Remove element
        list.remove(2);
        System.out.println("After removing index 2: " + list); // Expected: [Start, A, B, C]

        // Test 5: Reverse list
        list.reverse();
        System.out.println("After reverse: " + list); // Expected: [C, B, A, Start]

        // Test 6: Clear list
        list.clear();
        System.out.println("After clear: " + list); // Expected: []

        // Test 7: Edge case - add at invalid position
        try {
            list.add(5, "Error");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception for add at invalid index");
        }

        // Test 8: Edge case - get from empty list
        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception for get from empty list");
        }
    }
}
