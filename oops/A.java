class A {

    static int i;
    int j;

    static void m1() {
        System.out.println(i);
    }

    void m2() {
        System.out.println(j);
    }
}

class Test1 {
    public static void main(String[] args) {
        A.i = 10;// initializing the static variable
        A.m1();// calling of static method of another class using class name
        A a1 = new A();// creating object of class A to access non-static method
        a1.j = 20;       
        a1.m2();
        A a2 = new A();
        a2.m2();
    }
}