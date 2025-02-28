class A {
    public static void main(String[] args) {
        byte a = 20;// 1byte
        int b = a;// 4 bytes(widening)

        System.out.println(a + "\t" + b);

        char ch = 'A';// 2bytes
        int n = ch;// 4types (widening)

        System.out.println(ch + "=" + n); // A=65

        int c = 9; // 4bytes
        double d = c;// 8 bytes (widening)

        System.out.println(c + "\t" + d);// 9 9.0

        // for (int i = 1; i <= 58; i++) {

        //     System.out.print(ch);
        //     if (i < 58)
        //         System.out.print(" , ");
        //     ch++;
        //     if (i % 10 == 0)
        //         System.out.println();
        // }
    }
}