class A {
    static {
        System.out.println("static in A");
    }
    {
        System.out.println("non static in A");
    }

    A() {
        System.out.println("ctt in A");
    }
}

class B extends A {
    static {
        System.out.println("static in B");
    }
    {
        System.out.println("non static in B");
    }

    B() {
        super();
        System.out.println("ctt in B");
    }

    B(int x) {
        System.out.println("ctt in B with x " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}
