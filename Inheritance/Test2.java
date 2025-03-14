class A {
    int a;

    A() {
        System.out.println("ctt-A");
    }

    A(int a) {
        this.a = a;
        System.out.println("ctt-A(int)");
    }
}

class B extends A {
    {
        System.out.println("non static block-B");
    }

    B() {
        this(10);
        System.out.println("ctt-B");
    }

    B(int a) {

        System.out.println("ctt-B(int)");
    }

}

class C extends B {
    C() {
        super(10);
        System.out.println("ctt-C");
    }
}

public class Test2 {
    public static void main(String[] args) {
        C c = new C();
    }

}
