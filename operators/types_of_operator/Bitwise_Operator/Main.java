class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = -12;
        // int c = a&b;//4
        int c = a | b;// 3
        System.out.println(c);
        // 101
        // 110
        // 011
        System.out.println(Integer.toBinaryString(b));
    }
}
