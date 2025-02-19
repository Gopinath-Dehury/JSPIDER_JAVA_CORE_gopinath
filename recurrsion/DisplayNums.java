public class DisplayNums {
    static void display(int i) {
        if (i > 10)
            return;
        System.out.println(i);
        display(i + 1);

    }

    public static void main(String[] args) {
        display(1);
    }
}
