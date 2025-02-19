class PreIncrement {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a++);// 0
        System.out.println(++a);// 2
        System.out.println(a + ++a);// 5
        int b = a++ + 2;
        System.out.println(b);// 5

        if (a < b && a <= b++) {
            System.out.println(b);// 6
            System.out.println(a);// 4
        }

        if (++a <= b && a >= b++) {
            System.out.println("hi");
        }
        System.out.println(b);// 7
            System.out.println(a);// 5
    }
}