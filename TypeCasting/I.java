class I {

    static void m1(double d) {
        System.out.println("d = " + d);
    }

    public static void main(String[] args) {
        int a = 10;
        m1(a);// auto widening
        m1('a');// auto widening
        m1(3.5f);// auto widening
    }
}
