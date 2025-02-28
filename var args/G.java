class G {
    public static void main(String[] args) {
        display(3);
        display(2, 4, 6, 7);

    }

    static void display(int... a) {
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}