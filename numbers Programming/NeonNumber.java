import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        for (int i = start; i <= end; i++) {
            if (isNeon(i)) {
                System.out.println(i);
            }
        }
    }
}
