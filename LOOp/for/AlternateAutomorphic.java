import java.util.Scanner;

class AlternateAutomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start range :");
        int start = sc.nextInt();
        System.out.println("Start range :");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int sqr = i * i;
            int m = i;
            int temp = 1;
            while (i > 0) {
                temp *= 10;
                i /= 10;
            }
            if (sqr % temp == m) {
                System.out.println(m);
            }

        }
    }
}