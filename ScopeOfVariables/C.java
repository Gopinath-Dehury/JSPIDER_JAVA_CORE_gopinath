class C {
    static int i;
    int j;

    void increment() {
        ++i;
        ++j;
    }

    void display() {
        System.out.println(i + " " + j);
    }
}

class Test2 {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C();
        C c3 = new C();
        c1.increment();

        c1.display();
        c2.increment();
        c2.display();
        c3.increment();
        c3.display();
        c1.increment();
        c1.display();
        c3.increment();
        c3.display();

    }
}