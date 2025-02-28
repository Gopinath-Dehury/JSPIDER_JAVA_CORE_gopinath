class B {
    public static void main(String[] args) {
        int a = 65;
        char ch = (char) a;// 2 bytes(Narrowing)
        System.out.println(a + " = " + ch);// 65 A

        double d = 5.5;// 8 bytes
        int n = (int) d;// 4 bytes(Narrowing)
        System.out.println(d + "  " + n);// 5.5 5

        int num = 130;// 1bytes
        byte b = (byte) num;// 1 bytes(Narrowing)  Explicit
        System.out.println(num + "  " + b);// 130 -126
    }
}
