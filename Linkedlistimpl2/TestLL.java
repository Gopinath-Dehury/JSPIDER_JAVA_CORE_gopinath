package Linkedlistimpl2;

public class TestLL {

    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.add(1);
        mll.add(2);
        mll.add(3);
        mll.add(4);
        mll.add(5);
        // System.out.println(mll.size());
        // System.out.println(mll.get(4));
         System.out.println(mll);
        mll.reverse();
        // System.out.println(mll.get(4));
        System.out.println(mll);
    }
}