import java.util.Scanner;

public class StrongNumber {
    public static boolean isStrong(int s) {
        int t = s;
        int sum = 0;
        while (t > 0) {
            int fact = 1;
            int r = t % 10;
            while (r > 0) {
                fact *= r;
                r--;
            }
            sum += fact;
            t /= 10;
        }
        return sum == s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
