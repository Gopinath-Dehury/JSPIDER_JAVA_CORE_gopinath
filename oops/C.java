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

class Test3 {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C();
        C c3 = new C();
        C c4=new C();
        c1.increment();
        c2.increment();
        c3.increment();
        c4.increment();
        
        c1.display();
        // c1.i = 6;
        // System.out.println(c1.i);
    }
}
