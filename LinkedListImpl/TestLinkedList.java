public class TestLinkedList {
    public static void main(String[] args) {
        LinkedListImp ll = new LinkedListImp();
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(0, 9);
        ll.add(0, 19);
        ll.add(57);
        ll.add(0, 29);
        System.out.println(ll);
        System.out.println("size ="+ll.size());
        ll.reverse();
       // ll.remove(4);
        //ll.remove(3);

        // System.out.println(ll.get(3) + " " + ll.size());
         System.out.println(ll);
         //System.out.println(ll.size());
    }
}
