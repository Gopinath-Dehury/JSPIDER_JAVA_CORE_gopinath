import java.util.Scanner;

public class AutomorphicNum {
    static boolean isAutomorphic(int a) {
        int sq = a * a, count = 0, temp = a;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (sq % (int) Math.pow(10, count) == a) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        for (int i = start; i <= end; i++) {
            if (isAutomorphic(i)) {
                System.out.println(i + "  " + i * i);
            }
        }
    }
}
