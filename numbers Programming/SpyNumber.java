import java.util.Scanner;

public class SpyNumber {
    public static boolean isSpyNumber(int n) {
        int mul = 1, sum = 0;

        while (n > 0) {
            mul *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return sum == mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        for (int i = start; i <= end; i++) {
            if (isSpyNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
