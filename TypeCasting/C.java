class C {
    public static void main(String[] args) {
        long a = 230;// 8 bytes
        float b = a;// 4 bytes(widening)
        System.out.println(a + " " + b);// 230 230.0
        float c = 5.5f;// 4 bytes
        long d = (long) c;// 8 bytes ( narrowing)

        System.out.println(c + " " + d);// 5.5 5

        int n = (int) Math.pow(5, 3);// Narrowing
        System.out.println(n);// 125

    }
}
