class H {
    public static void main(String[] args) {

        display(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    static void display(int arg, int... a) {
        System.out.println(arg);
        for (int n : a) {
            System.out.print(n + " ");
        }

        System.out.println();
    }
}
