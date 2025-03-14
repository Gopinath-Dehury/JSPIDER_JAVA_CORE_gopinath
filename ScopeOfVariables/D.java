class D {
    int i;
}

class Test3 {
    public static void main(String[] args) {
        D d1 = new D();
        d1.i = 10;
        System.out.println(d1.i);
        D d2 = d1;
        System.out.println(d2.i);
        d2.i = 20;
        System.out.println(d2.i);
        System.out.println(d1.i);
        d1 = new D();
        System.out.println(d1.i);
    }
}
