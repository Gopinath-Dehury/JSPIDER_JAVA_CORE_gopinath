public class B {
    public static void main(String[] args) {
        m1(1);
    }

    static int m1(int a) {
        if (a >= 50)
            return a + 1;
        return m1(a + 1) * 2;

    }
}
