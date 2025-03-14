class A {
    static int i;
    int j;
    static void m1() {
        System.out.println(i + " inside static m1()");
    }

    void m2() {
        m1();
        System.out.println(j + " inside non-static m2()");
    }
}

class Test {
    public static void main(String[] args) {
        A.i = 10;// Static i value initialize to 10
        A.m1();// calling of static method using className.
        A a1 = new A();// new object created to access the non static members
        a1.m2();// by reference a1 we call m2() non static method
        A a2 = new A();// new object created
        a2.m2();// by reference a2 we call m2() non static method
    }
}