class A {
    static {
        System.out.println("static block of A");
    }

    static void m1() {
        System.out.println("m1 method of A");
    }
}

class Test1 {
    public static void main(String[] args) {
        A.m1();
        A.m1();
    }
}
// static block of A
// m1 method of A
// m1 method of A