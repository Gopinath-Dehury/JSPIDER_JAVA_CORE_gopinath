class A {
    public static void main(String[] args) {
        m1(1);
    }

    static void m1(int i) {
        System.out.println(i);
        try {
            Thread.sleep(5);
        } catch (Exception e) {
        } // delay for 150 mili sec
        m1(i + 1);
        System.out.println("m1 ends");
    }
}